package com.juicelabs.fhir

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import java.io.File


class TestClassRenderer(val spec: FhirSpec) {
    val classes = mutableListOf<Triple<FhirClass, String, JsonObject>>()

    init {
        File("sample_data")
                .walk()
                .filter { it.name.contains("example") }
                .filter { !it.name.startsWith("list") }
                .forEach {
                    buildClassList(it)
                }
        createTestCase()
    }


    private fun buildClassList(file: File) {
        val parser = JsonParser()
        val jsonObject = parser.parse(readFile(file)).getAsJsonObject()
        val res = if (jsonObject.has("resourceType")) jsonObject["resourceType"].asString else null
        if (res.isNullOrBlank()) {
            return
        }
        val className = Mappings.classMap[res] ?: res ?: ""

        if (className.isNotBlank()) {
            val fhirClass = FhirClass.withName(className)
            if (fhirClass != null) {
                classes.add(Triple(fhirClass, file.name, jsonObject))
            }
        }
    }


    private fun createTestCase() {
        val out = FileSpec.builder(spec.packageName, "DataTests")
        val classBuilder = TypeSpec.classBuilder("ExampleDataTest")

        val testClass = ClassName("org.junit.jupiter.api", "Test")

        val desClass = ClassName("com.fasterxml.jackson.databind", "DeserializationFeature")
        val serClass = ClassName("com.fasterxml.jackson.databind", "SerializationFeature")

        classBuilder.addProperty("mapper", Gson::class.java)
        classBuilder.addProperty("builder", GsonBuilder::class.java)

        classBuilder.addInitializerBlock(CodeBlock.of(
                """
        builder = GsonBuilder()
        builder.registerTypeAdapter(FhirDate::class.java, FhirDateSerializer())
        builder.registerTypeAdapter(FhirDate::class.java, FhirDateDeSerializer())
        mapper = builder.create()

        """.trimIndent(),
                desClass, serClass, ClassName("com.fasterxml.jackson.annotation", "JsonInclude")))

        classes.forEach { (fhirClass, exampleFilename, jsonObject) ->
            val className = ClassName("com.juicelabs.fhir.model", fhirClass.name)
            val values = mutableMapOf<String, Pair<String, String>>() // todo change to class

            jsonObject.keySet().forEach { key ->

                val o = jsonObject[key]

                var ptype: String? = null
                for (prop in fhirClass.properties) {
                    if (prop.name == key) {
                        ptype = prop.typeName
                        break
                    }
                }

                if ((ptype == null || ptype == "String" || ptype == "Code") && o.isJsonPrimitive) {
                    values[key] = Pair("\"${o.asString}\"", "String")
                } else if ((ptype == null || ptype == "Boolean") && o.isJsonPrimitive) {
                    values[key] = Pair(o.asString, "Boolean")
                }
            }

            val fspec = FunSpec.builder("${exampleFilename.substringBefore(".")} Test")
                    .addStatement("val json = readFile(\"${exampleFilename}\")")
                    .addStatement("val obj = mapper.fromJson(json, %T::class.java)", className)
                    .addAnnotation(testClass)

            val assertEq = ClassName("kotlin.test", "assertEquals")
            val assertTrueCN = ClassName("kotlin.test", "assertTrue")
            values.forEach { k, (v, t) ->
                if (t == "String") {
                    val s = (if (v.length < 30) v else v.substring(0, 29) + "\"")
                    fspec.addStatement("%T(stringMatch(${s}, obj.${k}))", assertTrueCN)
                } else {
                    fspec.addStatement("%T(${v}, if (obj.${k} != null) obj.${k} else false, \"Field: ${k}\")", assertEq)
                }

            }
            classBuilder.addFunction(fspec.build())
        }

        classBuilder.addFunction(FunSpec.builder("stringMatch")
                .returns(Boolean::class)
                .addParameter("str", String::class)
                .addParameter("actual", String::class.asTypeName().asNullable())
                .addStatement("return if (actual.isNullOrBlank()) true else actual!!.startsWith(str) ")
                .build()
        )

        classBuilder.addFunction(FunSpec.builder("readFile")
                .returns(String::class)
                .addParameter("fileName", String::class)
                .addStatement("%T(\"sample_data/\" + fileName).reader().use { reader ->", ClassName("java.io", "File"))
                .addStatement("return reader.readText()")
                .addStatement("}")
                .build()
        )
        out.addType(classBuilder.build())
        out.build().writeTo(File("../parser-lib/src/test/kotlin"))
    }

    private fun readFile(f: File): String {
        f.reader().use { reader ->
            return reader.readText()
        }
    }

}


