package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class immunization_example_jsonTest : DataTests() {
    @Test
    fun `immunization-example Test`() {
        val json = readFile("immunization-example.json")
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notGiven != null) obj.notGiven else false, "Field: notGiven")
        assertEquals(true, if (obj.primarySource != null) obj.primarySource else false, "Field: primarySource")
        assertTrue(stringMatch("AAJN11K", obj.lotNumber))
    }
}

class immunization_example_historical_jsonTest : DataTests() {
    @Test
    fun `immunization-example-historical Test`() {
        val json = readFile("immunization-example-historical.json")
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("historical", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notGiven != null) obj.notGiven else false, "Field: notGiven")
        assertEquals(false, if (obj.primarySource != null) obj.primarySource else false, "Field: primarySource")
    }
}

class immunization_example_refused_jsonTest : DataTests() {
    @Test
    fun `immunization-example-refused Test`() {
        val json = readFile("immunization-example-refused.json")
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("notGiven", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(true, if (obj.notGiven != null) obj.notGiven else false, "Field: notGiven")
        assertEquals(true, if (obj.primarySource != null) obj.primarySource else false, "Field: primarySource")
    }
}
