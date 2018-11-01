package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class familymemberhistory_example_jsonTest : DataTests() {
    @Test
    fun `familymemberhistory-example Test`() {
        val json = readFile("familymemberhistory-example.json")
        val obj = mapper.fromJson(json, FamilyMemberHistory::class.java)
        assertTrue(stringMatch("FamilyMemberHistory", obj.resourceType))
        assertTrue(stringMatch("father", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: notDone")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class familymemberhistory_example_mother_jsonTest : DataTests() {
    @Test
    fun `familymemberhistory-example-mother Test`() {
        val json = readFile("familymemberhistory-example-mother.json")
        val obj = mapper.fromJson(json, FamilyMemberHistory::class.java)
        assertTrue(stringMatch("FamilyMemberHistory", obj.resourceType))
        assertTrue(stringMatch("mother", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
