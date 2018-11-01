package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class clinicalimpression_example_jsonTest : DataTests() {
    @Test
    fun `clinicalimpression-example Test`() {
        val json = readFile("clinicalimpression-example.json")
        val obj = mapper.fromJson(json, ClinicalImpression::class.java)
        assertTrue(stringMatch("ClinicalImpression", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("This 26 yo male patient is b", obj.description))
        assertTrue(stringMatch("provisional diagnoses of lac", obj.summary))
    }
}
