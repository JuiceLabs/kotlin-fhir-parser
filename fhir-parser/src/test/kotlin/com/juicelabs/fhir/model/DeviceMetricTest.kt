package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class devicemetric_example_jsonTest : DataTests() {
    @Test
    fun `devicemetric-example Test`() {
        val json = readFile("devicemetric-example.json")
        val obj = mapper.fromJson(json, DeviceMetric::class.java)
        assertTrue(stringMatch("DeviceMetric", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("on", obj.operationalStatus))
        assertTrue(stringMatch("blue", obj.color))
        assertTrue(stringMatch("measurement", obj.category))
    }
}
