package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class enrollmentrequest_example_jsonTest : DataTests() {
    @Test
    fun `enrollmentrequest-example Test`() {
        val json = readFile("enrollmentrequest-example.json")
        val obj = mapper.fromJson(json, EnrollmentRequest::class.java)
        assertTrue(stringMatch("EnrollmentRequest", obj.resourceType))
        assertTrue(stringMatch("22345", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
