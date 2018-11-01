package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class practitionerrole_example_jsonTest : DataTests() {
    @Test
    fun `practitionerrole-example Test`() {
        val json = readFile("practitionerrole-example.json")
        val obj = mapper.fromJson(json, PractitionerRole::class.java)
        assertTrue(stringMatch("PractitionerRole", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Adam is generally unavailabl", obj.availabilityExceptions))
    }
}
