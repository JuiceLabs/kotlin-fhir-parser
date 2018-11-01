package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class healthcareservice_example_jsonTest : DataTests() {
    @Test
    fun `healthcareservice-example Test`() {
        val json = readFile("healthcareservice-example.json")
        val obj = mapper.fromJson(json, HealthcareService::class.java)
        assertTrue(stringMatch("HealthcareService", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Consulting psychologists and", obj.name))
        assertTrue(stringMatch("Providing Specialist psychol", obj.comment))
        assertTrue(stringMatch("Several assessments are requ", obj.extraDetails))
        assertTrue(stringMatch("Evidence of application for ", obj.eligibilityNote))
        assertEquals(false, if (obj.appointmentRequired != null) obj.appointmentRequired else false, "Field: appointmentRequired")
        assertTrue(stringMatch("Reduced capacity is availabl", obj.availabilityExceptions))
    }
}
