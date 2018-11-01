package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class visionprescription_example_1_jsonTest : DataTests() {
    @Test
    fun `visionprescription-example-1 Test`() {
        val json = readFile("visionprescription-example-1.json")
        val obj = mapper.fromJson(json, VisionPrescription::class.java)
        assertTrue(stringMatch("VisionPrescription", obj.resourceType))
        assertTrue(stringMatch("33124", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class visionprescription_example_jsonTest : DataTests() {
    @Test
    fun `visionprescription-example Test`() {
        val json = readFile("visionprescription-example.json")
        val obj = mapper.fromJson(json, VisionPrescription::class.java)
        assertTrue(stringMatch("VisionPrescription", obj.resourceType))
        assertTrue(stringMatch("33123", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
