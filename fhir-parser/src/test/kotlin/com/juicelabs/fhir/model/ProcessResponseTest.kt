package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class processresponse_example_jsonTest : DataTests() {
    @Test
    fun `processresponse-example Test`() {
        val json = readFile("processresponse-example.json")
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Adjudication processing comp", obj.disposition))
    }
}

class processresponse_example_error_jsonTest : DataTests() {
    @Test
    fun `processresponse-example-error Test`() {
        val json = readFile("processresponse-example-error.json")
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2349", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Referred to claim not found ", obj.disposition))
    }
}

class processresponse_example_pended_jsonTest : DataTests() {
    @Test
    fun `processresponse-example-pended Test`() {
        val json = readFile("processresponse-example-pended.json")
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2499", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Additional information requi", obj.disposition))
    }
}
