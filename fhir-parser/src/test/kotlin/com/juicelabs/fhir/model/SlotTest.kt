package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class slot_example_busy_jsonTest : DataTests() {
    @Test
    fun `slot-example-busy Test`() {
        val json = readFile("slot-example-busy.json")
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("busy", obj.status))
        assertEquals(true, if (obj.overbooked != null) obj.overbooked else false, "Field: overbooked")
        assertTrue(stringMatch("Assessments should be perfor", obj.comment))
    }
}

class slot_example_jsonTest : DataTests() {
    @Test
    fun `slot-example Test`() {
        val json = readFile("slot-example.json")
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("free", obj.status))
        assertTrue(stringMatch("Assessments should be perfor", obj.comment))
    }
}

class slot_example_unavailable_jsonTest : DataTests() {
    @Test
    fun `slot-example-unavailable Test`() {
        val json = readFile("slot-example-unavailable.json")
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("3", obj.id))
        assertTrue(stringMatch("busy-unavailable", obj.status))
        assertTrue(stringMatch("Dr Careful is out of the off", obj.comment))
    }
}

class slot_example_tentative_jsonTest : DataTests() {
    @Test
    fun `slot-example-tentative Test`() {
        val json = readFile("slot-example-tentative.json")
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("busy-tentative", obj.status))
        assertTrue(stringMatch("Dr Careful is out of the off", obj.comment))
    }
}
