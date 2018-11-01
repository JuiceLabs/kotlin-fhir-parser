package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class operationoutcome_example_validationfail_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example-validationfail Test`() {
        val json = readFile("operationoutcome-example-validationfail.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("validationfail", obj.id))
    }
}

class operationoutcome_example_break_the_glass_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example-break-the-glass Test`() {
        val json = readFile("operationoutcome-example-break-the-glass.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("break-the-glass", obj.id))
    }
}

class operationoutcome_example_searchfail_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example-searchfail Test`() {
        val json = readFile("operationoutcome-example-searchfail.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("searchfail", obj.id))
    }
}

class operationoutcome_example_exception_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example-exception Test`() {
        val json = readFile("operationoutcome-example-exception.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("exception", obj.id))
    }
}

class operationoutcome_example_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example Test`() {
        val json = readFile("operationoutcome-example.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
    }
}

class operationoutcome_example_allok_jsonTest : DataTests() {
    @Test
    fun `operationoutcome-example-allok Test`() {
        val json = readFile("operationoutcome-example-allok.json")
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("allok", obj.id))
    }
}
