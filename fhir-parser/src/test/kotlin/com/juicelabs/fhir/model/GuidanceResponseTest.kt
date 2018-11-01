package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class guidanceresponse_example_jsonTest : DataTests() {
    @Test
    fun `guidanceresponse-example Test`() {
        val json = readFile("guidanceresponse-example.json")
        val obj = mapper.fromJson(json, GuidanceResponse::class.java)
        assertTrue(stringMatch("GuidanceResponse", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("success", obj.status))
    }
}
