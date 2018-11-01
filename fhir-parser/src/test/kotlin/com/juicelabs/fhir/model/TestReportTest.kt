package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class testreport_example_jsonTest : DataTests() {
    @Test
    fun `testreport-example Test`() {
        val json = readFile("testreport-example.json")
        val obj = mapper.fromJson(json, TestReport::class.java)
        assertTrue(stringMatch("TestReport", obj.resourceType))
        assertTrue(stringMatch("testreport-example", obj.id))
        assertTrue(stringMatch("TestReport Example for TestS", obj.name))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("pass", obj.result))
        assertTrue(stringMatch("HL7 Execution Engine", obj.tester))
    }
}
