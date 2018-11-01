package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class documentreference_example_jsonTest : DataTests() {
    @Test
    fun `documentreference-example Test`() {
        val json = readFile("documentreference-example.json")
        val obj = mapper.fromJson(json, DocumentReference::class.java)
        assertTrue(stringMatch("DocumentReference", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("current", obj.status))
        assertTrue(stringMatch("preliminary", obj.docStatus))
        assertTrue(stringMatch("Physical", obj.description))
    }
}
