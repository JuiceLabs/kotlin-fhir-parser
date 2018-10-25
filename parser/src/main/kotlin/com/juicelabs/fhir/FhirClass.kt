package com.juicelabs.fhir

import com.google.gson.JsonElement

class FhirClass(element: FhirStructureDefinitionElement) {

    val path: String?
    val name: String
    var module: String? = null
    val resourceType: String?
    val superclassName: String?
    var superClass: FhirClass? = null
    val short: JsonElement?
    val formal: JsonElement?
    val properties = mutableListOf<FhirClassProperty>()


    init {
        path = element.path
        name = element.nameIfClass()
        resourceType = element.nameOfResource()
        superclassName = element.getSuperclassName()
        short = element.definition.short
        formal = element.definition.formal
    }


    companion object {
        val known = mutableMapOf<String, FhirClass>()

        fun forElement(element: FhirStructureDefinitionElement): Pair<FhirClass, Boolean> {
            val className = element.nameIfClass()
            if (known.containsKey(className)) {
                return Pair(known[className]!!, false)
            }
            val klass = FhirClass(element)
            known.put(className, klass)
            return Pair(klass, true)
        }

        fun withName(className: String?): FhirClass? {
            return known[className]
        }
    }


    fun addProperty(prop: FhirClassProperty) {
        // todo checks
        properties.add(prop)

        // todo sort?

//        if prop.nonoptional and prop.one_of_many is not None:
//        if prop.one_of_many in self.expanded_nonoptionals:
//        self.expanded_nonoptionals[prop.one_of_many].append(prop)
//        else:
//        self.expanded_nonoptionals[prop.one_of_many] = [prop]
    }

    fun shouldWrite(): Boolean {
        if (superClass != null) {
            return true
        }
        return properties.size > 0
    }
}
