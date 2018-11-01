package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class flag_example_jsonTest : DataTests() {
    @Test
    fun `flag-example Test`() {
        val json = readFile("flag-example.json")
        val obj = mapper.fromJson(json, Flag::class.java)
        assertTrue(stringMatch("Flag", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("inactive", obj.status))
    }
}

class flag_example_encounter_jsonTest : DataTests() {
    @Test
    fun `flag-example-encounter Test`() {
        val json = readFile("flag-example-encounter.json")
        val obj = mapper.fromJson(json, Flag::class.java)
        assertTrue(stringMatch("Flag", obj.resourceType))
        assertTrue(stringMatch("example-encounter", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
