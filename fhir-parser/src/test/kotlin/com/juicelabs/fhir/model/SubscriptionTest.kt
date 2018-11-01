package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class subscription_example_error_jsonTest : DataTests() {
    @Test
    fun `subscription-example-error Test`() {
        val json = readFile("subscription-example-error.json")
        val obj = mapper.fromJson(json, Subscription::class.java)
        assertTrue(stringMatch("Subscription", obj.resourceType))
        assertTrue(stringMatch("example-error", obj.id))
        assertTrue(stringMatch("error", obj.status))
        assertTrue(stringMatch("Monitor new neonatal functio", obj.reason))
        assertTrue(stringMatch("Observation?code=http://loin", obj.criteria))
        assertTrue(stringMatch("Socket Error 10060 - can't c", obj.error))
    }
}

class subscription_example_jsonTest : DataTests() {
    @Test
    fun `subscription-example Test`() {
        val json = readFile("subscription-example.json")
        val obj = mapper.fromJson(json, Subscription::class.java)
        assertTrue(stringMatch("Subscription", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("requested", obj.status))
        assertTrue(stringMatch("Monitor new neonatal functio", obj.reason))
        assertTrue(stringMatch("Observation?code=http://loin", obj.criteria))
    }
}
