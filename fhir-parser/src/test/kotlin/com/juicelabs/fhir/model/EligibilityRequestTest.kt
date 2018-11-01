package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class eligibilityrequest_example_2_jsonTest : DataTests() {
    @Test
    fun `eligibilityrequest-example-2 Test`() {
        val json = readFile("eligibilityrequest-example-2.json")
        val obj = mapper.fromJson(json, EligibilityRequest::class.java)
        assertTrue(stringMatch("EligibilityRequest", obj.resourceType))
        assertTrue(stringMatch("52346", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("NB8742", obj.businessArrangement))
    }
}

class eligibilityrequest_example_jsonTest : DataTests() {
    @Test
    fun `eligibilityrequest-example Test`() {
        val json = readFile("eligibilityrequest-example.json")
        val obj = mapper.fromJson(json, EligibilityRequest::class.java)
        assertTrue(stringMatch("EligibilityRequest", obj.resourceType))
        assertTrue(stringMatch("52345", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
