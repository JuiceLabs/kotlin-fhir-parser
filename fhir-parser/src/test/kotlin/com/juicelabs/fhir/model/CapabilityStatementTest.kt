package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class capabilitystatement_example_jsonTest : DataTests() {
    @Test
    fun `capabilitystatement-example Test`() {
        val json = readFile("capabilitystatement-example.json")
        val obj = mapper.fromJson(json, CapabilityStatement::class.java)
        assertTrue(stringMatch("CapabilityStatement", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("20130510", obj.version))
        assertTrue(stringMatch("ACME-EHR", obj.name))
        assertTrue(stringMatch("ACME EHR capability statemen", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("ACME Corporation", obj.publisher))
        assertTrue(stringMatch("instance", obj.kind))
        assertTrue(stringMatch("both", obj.acceptUnknown))
    }
}

class capabilitystatement_phr_example_jsonTest : DataTests() {
    @Test
    fun `capabilitystatement-phr-example Test`() {
        val json = readFile("capabilitystatement-phr-example.json")
        val obj = mapper.fromJson(json, CapabilityStatement::class.java)
        assertTrue(stringMatch("CapabilityStatement", obj.resourceType))
        assertTrue(stringMatch("phr", obj.id))
        assertTrue(stringMatch("PHR Template", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertTrue(stringMatch("capability", obj.kind))
        assertTrue(stringMatch("no", obj.acceptUnknown))
    }
}
