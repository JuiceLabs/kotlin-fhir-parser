package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class schedule_provider_location1_example_jsonTest : DataTests() {
    @Test
    fun `schedule-provider-location1-example Test`() {
        val json = readFile("schedule-provider-location1-example.json")
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("exampleloc1", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("The slots attached to this s", obj.comment))
    }
}

class schedule_example_jsonTest : DataTests() {
    @Test
    fun `schedule-example Test`() {
        val json = readFile("schedule-example.json")
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("The slots attached to this s", obj.comment))
    }
}

class schedule_provider_location2_example_jsonTest : DataTests() {
    @Test
    fun `schedule-provider-location2-example Test`() {
        val json = readFile("schedule-provider-location2-example.json")
        val obj = mapper.fromJson(json, Schedule::class.java)
        assertTrue(stringMatch("Schedule", obj.resourceType))
        assertTrue(stringMatch("exampleloc2", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("The slots attached to this s", obj.comment))
    }
}
