package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class devicerequest_example_insulinpump_jsonTest : DataTests() {
    @Test
    fun `devicerequest-example-insulinpump Test`() {
        val json = readFile("devicerequest-example-insulinpump.json")
        val obj = mapper.fromJson(json, DeviceRequest::class.java)
        assertTrue(stringMatch("DeviceRequest", obj.resourceType))
        assertTrue(stringMatch("insulinpump", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("routine", obj.priority))
    }
}

class devicerequest_example_jsonTest : DataTests() {
    @Test
    fun `devicerequest-example Test`() {
        val json = readFile("devicerequest-example.json")
        val obj = mapper.fromJson(json, DeviceRequest::class.java)
        assertTrue(stringMatch("DeviceRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
