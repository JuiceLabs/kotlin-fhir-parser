package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class person_example_f002_ariadne_jsonTest : DataTests() {
    @Test
    fun `person-example-f002-ariadne Test`() {
        val json = readFile("person-example-f002-ariadne.json")
        val obj = mapper.fromJson(json, Person::class.java)
        assertTrue(stringMatch("Person", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("female", obj.gender))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
    }
}

class person_example_jsonTest : DataTests() {
    @Test
    fun `person-example Test`() {
        val json = readFile("person-example.json")
        val obj = mapper.fromJson(json, Person::class.java)
        assertTrue(stringMatch("Person", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("male", obj.gender))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
    }
}
