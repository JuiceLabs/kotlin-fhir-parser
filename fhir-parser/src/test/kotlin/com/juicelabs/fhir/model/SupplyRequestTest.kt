package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class supplyrequest_example_simpleorder_jsonTest : DataTests() {
    @Test
    fun `supplyrequest-example-simpleorder Test`() {
        val json = readFile("supplyrequest-example-simpleorder.json")
        val obj = mapper.fromJson(json, SupplyRequest::class.java)
        assertTrue(stringMatch("SupplyRequest", obj.resourceType))
        assertTrue(stringMatch("simpleorder", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("asap", obj.priority))
    }
}
