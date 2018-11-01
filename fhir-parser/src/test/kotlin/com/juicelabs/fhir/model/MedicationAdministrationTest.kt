package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class medicationadministrationexample3_jsonTest : DataTests() {
    @Test
    fun `medicationadministrationexample3 Test`() {
        val json = readFile("medicationadministrationexample3.json")
        val obj = mapper.fromJson(json, MedicationAdministration::class.java)
        assertTrue(stringMatch("MedicationAdministration", obj.resourceType))
        assertTrue(stringMatch("medadminexample03", obj.id))
        assertTrue(stringMatch("on-hold", obj.status))
        assertEquals(true, if (obj.notGiven != null) obj.notGiven else false, "Field: notGiven")
    }
}
