package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class graphdefinition_example_jsonTest : DataTests() {
    @Test
    fun `graphdefinition-example Test`() {
        val json = readFile("graphdefinition-example.json")
        val obj = mapper.fromJson(json, GraphDefinition::class.java)
        assertTrue(stringMatch("GraphDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("Document Generation Template", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertTrue(stringMatch("Composition", obj.start))
    }
}
