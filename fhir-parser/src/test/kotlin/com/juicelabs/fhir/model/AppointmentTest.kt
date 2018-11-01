package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class appointment_example_jsonTest : DataTests() {
    @Test
    fun `appointment-example Test`() {
        val json = readFile("appointment-example.json")
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("booked", obj.status))
        assertTrue(stringMatch("Discussion on the results of", obj.description))
        assertTrue(stringMatch("Further expand on the result", obj.comment))
    }
}

class appointment_example_request_jsonTest : DataTests() {
    @Test
    fun `appointment-example-request Test`() {
        val json = readFile("appointment-example-request.json")
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("examplereq", obj.id))
        assertTrue(stringMatch("proposed", obj.status))
        assertTrue(stringMatch("Discussion on the results of", obj.description))
        assertTrue(stringMatch("Further expand on the result", obj.comment))
    }
}

class appointment_example2doctors_jsonTest : DataTests() {
    @Test
    fun `appointment-example2doctors Test`() {
        val json = readFile("appointment-example2doctors.json")
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("2docs", obj.id))
        assertTrue(stringMatch("booked", obj.status))
        assertTrue(stringMatch("Discussion about Peter Chalm", obj.description))
        assertTrue(stringMatch("Clarify the results of the M", obj.comment))
    }
}
