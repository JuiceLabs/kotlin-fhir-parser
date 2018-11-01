package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class medicationdispenseexample8_jsonTest : DataTests() {
    @Test
    fun `medicationdispenseexample8 Test`() {
        val json = readFile("medicationdispenseexample8.json")
        val obj = mapper.fromJson(json, MedicationDispense::class.java)
        assertTrue(stringMatch("MedicationDispense", obj.resourceType))
        assertTrue(stringMatch("meddisp008", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
