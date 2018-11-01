package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class coverage_example_2_jsonTest : DataTests() {
    @Test
    fun `coverage-example-2 Test`() {
        val json = readFile("coverage-example-2.json")
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("7546D", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("AB9876", obj.subscriberId))
        assertTrue(stringMatch("1", obj.dependent))
        assertTrue(stringMatch("5", obj.network))
    }
}

class coverage_example_selfpay_jsonTest : DataTests() {
    @Test
    fun `coverage-example-selfpay Test`() {
        val json = readFile("coverage-example-selfpay.json")
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("SP1234", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class coverage_example_ehic_jsonTest : DataTests() {
    @Test
    fun `coverage-example-ehic Test`() {
        val json = readFile("coverage-example-ehic.json")
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("7547E", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class coverage_example_jsonTest : DataTests() {
    @Test
    fun `coverage-example Test`() {
        val json = readFile("coverage-example.json")
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("9876B1", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("0", obj.dependent))
        assertTrue(stringMatch("9", obj.sequence))
    }
}
