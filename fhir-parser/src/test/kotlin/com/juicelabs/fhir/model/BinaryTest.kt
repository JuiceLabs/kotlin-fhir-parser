package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class binary_example_jsonTest : DataTests() {
    @Test
    fun `binary-example Test`() {
        val json = readFile("binary-example.json")
        val obj = mapper.fromJson(json, Binary::class.java)
        assertTrue(stringMatch("Binary", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("application/pdf", obj.contentType))
    }
}
