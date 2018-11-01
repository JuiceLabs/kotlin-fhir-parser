package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class servicedefinition_example_jsonTest : DataTests() {
    @Test
    fun `servicedefinition-example Test`() {
        val json = readFile("servicedefinition-example.json")
        val obj = mapper.fromJson(json, ServiceDefinition::class.java)
        assertTrue(stringMatch("ServiceDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("Guideline Appropriate Orderi", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}
