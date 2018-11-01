package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class compartmentdefinition_example_jsonTest : DataTests() {
    @Test
    fun `compartmentdefinition-example Test`() {
        val json = readFile("compartmentdefinition-example.json")
        val obj = mapper.fromJson(json, CompartmentDefinition::class.java)
        assertTrue(stringMatch("CompartmentDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("EXAMPLE", obj.name))
        assertTrue(stringMatch("Base FHIR compartment defini", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Level Seven Internati", obj.publisher))
        assertTrue(stringMatch("Device", obj.code))
        assertEquals(true, if (obj.search != null) obj.search else false, "Field: search")
    }
}
