package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class appointmentresponse_example_req_jsonTest : DataTests() {
    @Test
    fun `appointmentresponse-example-req Test`() {
        val json = readFile("appointmentresponse-example-req.json")
        val obj = mapper.fromJson(json, AppointmentResponse::class.java)
        assertTrue(stringMatch("AppointmentResponse", obj.resourceType))
        assertTrue(stringMatch("exampleresp", obj.id))
        assertTrue(stringMatch("tentative", obj.participantStatus))
        assertTrue(stringMatch("can't we try for this time, ", obj.comment))
    }
}

class appointmentresponse_example_jsonTest : DataTests() {
    @Test
    fun `appointmentresponse-example Test`() {
        val json = readFile("appointmentresponse-example.json")
        val obj = mapper.fromJson(json, AppointmentResponse::class.java)
        assertTrue(stringMatch("AppointmentResponse", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("accepted", obj.participantStatus))
    }
}
