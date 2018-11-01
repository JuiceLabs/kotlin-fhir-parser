package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class eligibilityresponse_example_benefits_2_jsonTest : DataTests() {
    @Test
    fun `eligibilityresponse-example-benefits-2 Test`() {
        val json = readFile("eligibilityresponse-example-benefits-2.json")
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2502", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Policy is currently in-force", obj.disposition))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: inforce")
    }
}

class eligibilityresponse_example_error_jsonTest : DataTests() {
    @Test
    fun `eligibilityresponse-example-error Test`() {
        val json = readFile("eligibilityresponse-example-error.json")
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2503", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Eligibiliy request could not", obj.disposition))
    }
}

class eligibilityresponse_example_jsonTest : DataTests() {
    @Test
    fun `eligibilityresponse-example Test`() {
        val json = readFile("eligibilityresponse-example.json")
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Policy is currently in-force", obj.disposition))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: inforce")
    }
}

class eligibilityresponse_example_benefits_jsonTest : DataTests() {
    @Test
    fun `eligibilityresponse-example-benefits Test`() {
        val json = readFile("eligibilityresponse-example-benefits.json")
        val obj = mapper.fromJson(json, EligibilityResponse::class.java)
        assertTrue(stringMatch("EligibilityResponse", obj.resourceType))
        assertTrue(stringMatch("E2501", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Policy is currently in-force", obj.disposition))
        assertEquals(true, if (obj.inforce != null) obj.inforce else false, "Field: inforce")
    }
}
