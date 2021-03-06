package com.juicelabs.fhir

import com.google.gson.JsonElement
import com.google.gson.JsonObject


class FhirStructureDefinitionElementDefinition(val element: FhirStructureDefinitionElement, dict: JsonObject) {
    val LOG by logger()

    val id: String?
    val types = mutableListOf<FhirElementType>()
    val short: JsonElement?
    val name: JsonElement?
    var propName: String? = null // todo huh?
    val contentReference: String?
    var contentReferenced: FhirStructureDefinitionElementDefinition? = null
    val formal: JsonElement?
    val comment: JsonElement?
    val binding: FhirElementBinding?
    val constraint: FhirElementConstraint?
    val mapping: FhirElementMapping?
    val slicing: JsonElement?
    val representation: JsonElement?

    init {
        this.id = if (dict.has("id")) dict["id"].asString else null
        if (dict.has("type")) {
            dict.getAsJsonArray("type").forEach { e ->
                types.add(FhirElementType(e as JsonObject))
            }
        }

        name = dict["name"]
        contentReference = if (dict.has("contentReference")) dict["contentReference"].asString else null
        short = dict["short"]
        formal = dict["definition"]
        // todo
        //if self.formal and self.short == self.formal[:-1]:     # formal adds a trailing period
        //   self.formal = None
        comment = dict["comments"]

        // todo check for existence on theses?
        binding = if (dict.has("binding")) FhirElementBinding(dict["binding"] as JsonObject) else null
        constraint = if (dict.has("constraint")) FhirElementConstraint(dict["constraint"]) else null
        mapping = if (dict.has("mapping")) FhirElementMapping(dict["mapping"]) else null
        slicing = dict["slicing"]
        representation = dict["representation"]
    }


    fun resolveDependencies() {
        // update the definition from a reference, if there is one
        if (contentReference != null) {
            if (!contentReference.startsWith("#")) {
                throw Exception("Only relative 'contentReference' dict definitions are supported right now")
            }
            val elem = element.profile.elementWithId(contentReference.substring(1))

            if (elem == null) {
                throw Exception("There is no element definiton with id ${contentReference}, as referenced by {} in {}")
                // .format(self.content_reference, self.path, self.profile.url))
            } else {
                contentReferenced = elem.definition
            }
        }

        // resolve bindings
        if (binding != null && binding.isRequired && (binding.uri != null || binding.canonical != null)) {
            val uri = binding.canonical ?: binding.uri!!
            if (uri.startsWith("http://hl7.org/fhir")) {
                LOG.debug("Ignoring foreign ValueSet \"{}\"".format(uri))
                return
            }

            val valueSet = element.profile.fhirSpec.valuesetWithUri(uri)
            if (valueSet == null) {
                LOG.error("There is no ValueSet for required binding \"${uri}\" on ${propName} in ${element.profile.name()}")
            } else {
                element.valueSet = valueSet
                element.enum = valueSet.enum()
            }
        }

    }


    /**
     * Determines the class-name that the element would have if it was
     * defining a class. This means it uses "name", if present, and the last
     * "path" component otherwise.
     */
    fun nameIfClass(): String {
        if (contentReferenced != null) {
            return contentReferenced!!.nameIfClass()
        }

        val withName = if (name != null) name.asString else propName
        val parent = element.parent
        val parentName = if (parent != null) parent.nameIfClass() else null

        var className = if (withName != null) element.profile.fhirSpec.classNameForType(withName, parentName) else null
        if (parentName != null) { // && and self.element.profile.spec.settings.backbone_class_adds_parent:
            className = parentName + className
        }
        return className!!

    }
}

