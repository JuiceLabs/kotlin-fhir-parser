package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class structuremap_example_jsonTest : DataTests() {
    @Test
    fun `structuremap-example Test`() {
        val json = readFile("structuremap-example.json")
        val obj = mapper.fromJson(json, StructureMap::class.java)
        assertTrue(stringMatch("StructureMap", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("0.1", obj.version))
        assertTrue(stringMatch("ExampleMap", obj.name))
        assertTrue(stringMatch("Example Map", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("HL7 FHIR Standard", obj.publisher))
    }
}
