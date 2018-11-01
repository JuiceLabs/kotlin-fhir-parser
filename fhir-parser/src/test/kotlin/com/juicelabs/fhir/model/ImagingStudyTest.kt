package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class imagingstudy_example_xr_jsonTest : DataTests() {
    @Test
    fun `imagingstudy-example-xr Test`() {
        val json = readFile("imagingstudy-example-xr.json")
        val obj = mapper.fromJson(json, ImagingStudy::class.java)
        assertTrue(stringMatch("ImagingStudy", obj.resourceType))
        assertTrue(stringMatch("example-xr", obj.id))
        assertTrue(stringMatch("ONLINE", obj.availability))
        assertTrue(stringMatch("XR Wrist 3+ Views", obj.description))
    }
}

class imagingstudy_example_jsonTest : DataTests() {
    @Test
    fun `imagingstudy-example Test`() {
        val json = readFile("imagingstudy-example.json")
        val obj = mapper.fromJson(json, ImagingStudy::class.java)
        assertTrue(stringMatch("ImagingStudy", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}
