package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class referralrequest_example_jsonTest : DataTests() {
    @Test
    fun `referralrequest-example Test`() {
        val json = readFile("referralrequest-example.json")
        val obj = mapper.fromJson(json, ReferralRequest::class.java)
        assertTrue(stringMatch("ReferralRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("In the past 2 years Beverly ", obj.description))
    }
}
