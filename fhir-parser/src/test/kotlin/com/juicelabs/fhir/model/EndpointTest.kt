package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class endpoint_example_iid_jsonTest : DataTests() {
    @Test
    fun `endpoint-example-iid Test`() {
        val json = readFile("endpoint-example-iid.json")
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example-iid", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("PACS Hospital Invoke Image D", obj.name))
    }
}

class endpoint_example_wadors_jsonTest : DataTests() {
    @Test
    fun `endpoint-example-wadors Test`() {
        val json = readFile("endpoint-example-wadors.json")
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example-wadors", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("PACS Hospital DICOM WADO-RS ", obj.name))
    }
}

class endpoint_example_jsonTest : DataTests() {
    @Test
    fun `endpoint-example Test`() {
        val json = readFile("endpoint-example.json")
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Health Intersections CarePla", obj.name))
    }
}
