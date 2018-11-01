package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class documentmanifest_example_jsonTest : DataTests() {
    @Test
    fun `documentmanifest-example Test`() {
        val json = readFile("documentmanifest-example.json")
        val obj = mapper.fromJson(json, DocumentManifest::class.java)
        assertTrue(stringMatch("DocumentManifest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("current", obj.status))
        assertTrue(stringMatch("Physical", obj.description))
    }
}
