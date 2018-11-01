package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class enrollmentresponse_example_jsonTest : DataTests() {
    @Test
    fun `enrollmentresponse-example Test`() {
        val json = readFile("enrollmentresponse-example.json")
        val obj = mapper.fromJson(json, EnrollmentResponse::class.java)
        assertTrue(stringMatch("EnrollmentResponse", obj.resourceType))
        assertTrue(stringMatch("ER2500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Dependant added to policy.", obj.disposition))
    }
}
