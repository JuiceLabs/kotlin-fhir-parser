package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class allergyintolerance_example_jsonTest : DataTests() {
    @Test
    fun `allergyintolerance-example Test`() {
        val json = readFile("allergyintolerance-example.json")
        val obj = mapper.fromJson(json, AllergyIntolerance::class.java)
        assertTrue(stringMatch("AllergyIntolerance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("allergy", obj.type))
        assertTrue(stringMatch("high", obj.criticality))
    }
}
