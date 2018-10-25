package com.juicelabs.fhir

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject

class FhirCodeSystem(spec: FhirSpec, resource: JsonObject) {

    val spec: FhirSpec
    val definition: JsonObject
    val url: String?
    val name: String
    val concepts: JsonArray?
    var generateEnum: Boolean
    val codes = mutableListOf<JsonObject>()


    init {
        this.spec = spec
        definition = resource
        url = if (resource.has("url")) resource["url"].asString else ""
        name = if (Mappings.enumNameMap.containsKey(url)) Mappings.enumNameMap[url]!! else spec.safeEnumName(resource.get("name").asString)
        concepts = definition.getAsJsonArray("concept")
        if (!resource.has("experimental")) {
            generateEnum = "complete".equals(resource["content"])
            if (generateEnum) {
                if (concepts.count() > 200) {
                    generateEnum = false
                    //logger.info("Will not generate enum for CodeSystem \"{}\" because it has > 200 ({}) concepts"
                    //        .format(self.url, len(concepts)))
                } else {
                    codes.addAll(parsedCodes(concepts))
                }
            } else {
                // todo log
//                logger.debug("Will not generate enum for CodeSystem \"{}\" whose content is {}"
//                        .format(self.url, resource['content']))
            }
        } else {
            generateEnum = false
        }
    }


    fun parsedCodes(codes: JsonArray, prefix: String? = null): MutableList<JsonObject> {
        val found = mutableListOf<JsonObject>()
        codes.forEach { c ->
            val cd = (c as JsonObject)["code"] // todo yeah, python sutff
            found.add(c)

            // todo nested concepts
        }
        return found
    }
}