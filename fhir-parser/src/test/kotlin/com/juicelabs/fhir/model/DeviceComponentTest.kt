package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class devicecomponent_example_jsonTest : DataTests() {
    @Test
    fun `devicecomponent-example Test`() {
        val json = readFile("devicecomponent-example.json")
        val obj = mapper.fromJson(json, DeviceComponent::class.java)
        assertTrue(stringMatch("DeviceComponent", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("optical", obj.measurementPrinciple))
    }
}

class devicecomponent_example_prodspec_jsonTest : DataTests() {
    @Test
    fun `devicecomponent-example-prodspec Test`() {
        val json = readFile("devicecomponent-example-prodspec.json")
        val obj = mapper.fromJson(json, DeviceComponent::class.java)
        assertTrue(stringMatch("DeviceComponent", obj.resourceType))
        assertTrue(stringMatch("example-prodspec", obj.id))
    }
}
