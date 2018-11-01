package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class composition_example_jsonTest : DataTests() {
    @Test
    fun `composition-example Test`() {
        val json = readFile("composition-example.json")
        val obj = mapper.fromJson(json, Composition::class.java)
        assertTrue(stringMatch("Composition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Consultation Note", obj.title))
        assertTrue(stringMatch("N", obj.confidentiality))
    }
}
