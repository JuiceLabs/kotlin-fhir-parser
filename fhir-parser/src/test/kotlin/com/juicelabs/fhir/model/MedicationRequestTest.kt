package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class medicationrequestexample1_jsonTest : DataTests() {
    @Test
    fun `medicationrequestexample1 Test`() {
        val json = readFile("medicationrequestexample1.json")
        val obj = mapper.fromJson(json, MedicationRequest::class.java)
        assertTrue(stringMatch("MedicationRequest", obj.resourceType))
        assertTrue(stringMatch("medrx0311", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class medicationrequestexample2_jsonTest : DataTests() {
    @Test
    fun `medicationrequestexample2 Test`() {
        val json = readFile("medicationrequestexample2.json")
        val obj = mapper.fromJson(json, MedicationRequest::class.java)
        assertTrue(stringMatch("MedicationRequest", obj.resourceType))
        assertTrue(stringMatch("medrx002", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}
