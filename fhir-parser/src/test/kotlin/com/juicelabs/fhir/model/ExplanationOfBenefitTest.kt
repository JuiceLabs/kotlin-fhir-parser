package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class explanationofbenefit_example_jsonTest : DataTests() {
    @Test
    fun `explanationofbenefit-example Test`() {
        val json = readFile("explanationofbenefit-example.json")
        val obj = mapper.fromJson(json, ExplanationOfBenefit::class.java)
        assertTrue(stringMatch("ExplanationOfBenefit", obj.resourceType))
        assertTrue(stringMatch("EB3500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Claim settled as per contrac", obj.disposition))
    }
}
