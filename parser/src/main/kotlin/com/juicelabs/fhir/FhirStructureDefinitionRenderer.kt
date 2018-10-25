package com.juicelabs.fhir

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.io.File
import java.time.LocalDateTime.now

class FhirStructureDefinitionRenderer(val spec: FhirSpec) {

    val LOG by logger()

    fun copy() {
        // todo imp
    }


    fun render() {
        spec.writeableProfile().forEach { profile ->
            val classes = profile.writeableClasses()
            val imports = profile.neededExternalClasses()
            val data = hashMapOf<String, Any>(
                    "profile" to profile,
                    "info" to spec.info,
                    "imports" to imports,
                    "classes" to classes
            )

            val header = buildHeader(data)
            val out = FileSpec.builder("", profile.targetName)

            classes.filter { c -> !Mappings.natives.contains(c.name) }.forEach { c ->
                val classBody = buildClass(c)
                out.addType(classBody)
                if (true || c.name == "Immunization")
                    LOG.debug("Building class {}", c.name)
            }

            val dir = spec.info.directory
            out.build().writeTo(File(dir))
        }
    }

//    private fun buildImports(imports: List<FhirClass>): Int {
//
//    }


    private fun buildClass(cls: FhirClass): TypeSpec {

        val className = ClassName("", cls.name)


        val classBuilder = TypeSpec.classBuilder(cls.name).addModifiers(KModifier.OPEN)

        var i = 0

        val primaryCtor = FunSpec.constructorBuilder()

        classBuilder.addKdoc("%L\n\n%L\n", cls.short!!.asString, cls.formal!!.asString)
        cls.properties.forEach { prop ->
            renderProperty(prop, prop.typeName, prop.origName, classBuilder, primaryCtor)
        }
        classBuilder.primaryConstructor(primaryCtor.build())

        val superClass = cls.superClass
        if (superClass != null) {
            buildSuperClassConstructor(superClass, classBuilder)
        }

        return classBuilder.build()
    }

    private fun buildSuperClassConstructor(cls: FhirClass, classBuilder: TypeSpec.Builder) {
        val superClass = ClassName("", cls.name)
        val scBuilder = classBuilder.superclass(superClass)
        cls.properties.forEach { prop ->
            val cn = ClassName("", prop.className)
            //          scBuilder.addSuperclassConstructorParameter(prop.name)
        }
        scBuilder.build()

    }

    private fun renderProperty(prop: FhirClassProperty, typeName: String, origName: String, classBuilder: TypeSpec.Builder, primaryCtor: FunSpec.Builder) {
        val mappedTypeName = Mappings.classMap[typeName.decapitalize()] ?: typeName
        val typeClassName = ClassName("", mappedTypeName)
        val propName = Mappings.reservedMap[origName] ?: prop.origName // todo origName?
        if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            classBuilder.addProperty(PropertySpec.builder(propName, listOfProps)
                    .initializer(CodeBlock.of("mutableListOf<%L>()", typeClassName))
                    .build())
            //     primaryCtor.addParameter(ParameterSpec.builder(propName, listOfProps).build())
        } else {
            val propBuilder = PropertySpec.builder(propName, typeClassName.isNullable(prop.min == 0)).mutable(true)

            if (prop.min == 0) {
                propBuilder.initializer("null")
            }

            if (prop.min == 1) {
                if (Mappings.defaultValues.contains(mappedTypeName)) {
                    propBuilder.initializer(Mappings.defaultValues[mappedTypeName]!!)
                } else {
                    propBuilder.initializer("${mappedTypeName}()")
                }
            }

            classBuilder.addProperty(propBuilder.build())
            //    .initializer(propName)
            //                        .addKdoc("%L\n", prop.formalDesc)
            //.build())
            //     primaryCtor.addParameter(ParameterSpec.builder(propName, typeClassName.isNullable(prop.min == 0)).build())
        }
    }


    private fun buildHeader(data: HashMap<String, Any>): CodeBlock {
        return CodeBlock.builder().add("Generated from FHIR %L on %L \n %L, JuiceLab, LLC", data["profile"], now(), now().year).build()
    }
}

fun ClassName.isNullable(nullable: Boolean): ClassName {
    return if (nullable)
        asNullable()
    else
        asNonNullable()
}