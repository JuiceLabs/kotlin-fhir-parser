package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class claimresponse_example_jsonTest : DataTests() {
    @Test
    fun `claimresponse-example Test`() {
        val json = readFile("claimresponse-example.json")
        val obj = mapper.fromJson(json, ClaimResponse::class.java)
        assertTrue(stringMatch("ClaimResponse", obj.resourceType))
        assertTrue(stringMatch("R3500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Claim settled as per contrac", obj.disposition))
    }
}
