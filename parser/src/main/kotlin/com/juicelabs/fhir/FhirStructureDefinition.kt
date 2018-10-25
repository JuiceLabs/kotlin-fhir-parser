package com.juicelabs.fhir

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject

class FhirStructureDefinition(val fhirSpec: FhirSpec, val profile: JsonObject) {

    val structure = FhirStructureDefinitionStructure(fhirSpec, this)
    val elements = mutableListOf<FhirStructureDefinitionElement>()
    var mainElement: FhirStructureDefinitionElement? = null
    val classes = mutableListOf<FhirClass>()
    var didWrapUp: Boolean = false
    val url: JsonElement?
    val isManual = false
    lateinit var targetName: String


    fun name(): String? {
        return structure.name
    }


    init {
        assert(profile.get("resourceType").equals("StructureDefinition"))

        url = profile.get("url")

        structure.parseFrom(profile)
        print(2)
    }


    fun processProfile() {
        val struct = if (structure.differential != null) structure.differential as JsonArray else structure.snapshot as JsonArray

        //  val mapped = HashMap()
        val mapped = mutableMapOf<String, FhirStructureDefinitionElement>()
        struct.forEach { e ->
            val element = FhirStructureDefinitionElement(this, e as JsonObject, (mainElement == null))
            elements.add(element)
            val path = element.path!!
            mapped.put(path, element)

            // establish hierarchy (may move to extra loop in case elements are no longer in order)
            if (element.isMainProfileElement) {
                mainElement = element
            }

            val parent = mapped[element.parentName]
            if (parent != null) {
                parent.addChild(element)
            }

            elements.forEach {
                it.resolveDependencies()
            }

            // run check: if n_min > 0 and parent is in summary, must also be in summary
            elements.forEach { e ->
                val p = e.parent
                if (e.min != null && p != null && p.isSummary && !e.isSummary) {
                    //logger.error("n_min > 0 but not summary: `{}`".format(element.path))
                    e.summaryMinConflict = true
                }
            }
        }

        // create classes and class properties
        if (mainElement != null) {
            val (snapClass, kids) = mainElement!!.createClass() // todo stench

            if (snapClass == null) {
                Exception("The main element for \"{}\" did not create a class") // self.url
            } else {
                foundClass(snapClass)


                kids.keys.forEach { cls ->
                    foundClass(cls)
                }
//                kids.forEach { klass, subs ->
//                    subs.forEach { sub ->
//                        foundClass(sub)
//                    }
//                }

                targetName = snapClass.name
            }
        }
    }


    fun foundClass(klass: FhirClass) {
        classes.add(klass)
    }


    fun elementWithId(ident: String): FhirStructureDefinitionElement? {

        elements.forEach { e ->
            if (e.definition.id.equals(ident)) {
                return e
            }
        }
        return null
    }


    fun wrapUp() {
        // assign all super-classes as objects
        classes.forEach { c ->
            if (c.superClass == null) {
                val sc = FhirClass.withName(c.superclassName)
                if (sc == null && c.superclassName != null) {
                    Exception("There is no class implementation for class named {} in profile {}")
//                            .format(cls.superclass_name, self.url))
                }
                c.superClass = sc
            }
        }
        didWrapUp = true
    }


    fun writeableClasses(): List<FhirClass> {
        val c = mutableListOf<FhirClass>()
        classes.forEach { fclass ->
            if (fclass.shouldWrite()) {
                c.add(fclass)
            }
        }
        return c
    }


    /**
     * Returns a unique list of class items that are needed for any of the
     * receiver's classes' properties and are not defined in this profile.
     */
    fun neededExternalClasses(): List<FhirClass> {
        val internal = mutableSetOf<String>()
        internal.addAll(classes.map { it.name })

        val needed = mutableSetOf<String>()
        val needs = mutableListOf<FhirClass>()

        classes.forEach { cls ->
            val superClass = cls.superClass
            if (superClass != null && !internal.contains(superClass.name) && !needed.contains(superClass.name)) {
                needed.add(superClass.name)
                needs.add(superClass)
            }

            cls.properties.forEach { prop ->
                val propClassName = prop.className
                if (!internal.contains(propClassName) && !fhirSpec.classNameIsNative(propClassName)) {
                    val propClass = FhirClass.withName(propClassName)
                    if (propClass == null) {
                        Exception("'There is no class \"{}\" for property \"{}\" on \"{}\" in {}'.format(prop_cls_name, prop.name, klass.name, self.name))")
                    } else {
                        // todo wtf?  prop.moduleName = propClass.module
                        if (!needed.contains(propClassName)) {
                            needed.add(propClassName)
                            needs.add(propClass)
                        }
                    }
                }
            }
        }
        return needs.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER, { it.name }))
    }
}