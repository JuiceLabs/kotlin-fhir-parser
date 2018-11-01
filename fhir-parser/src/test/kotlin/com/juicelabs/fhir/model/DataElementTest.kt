package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class dataelement_example_jsonTest : DataTests() {
    @Test
    fun `dataelement-example Test`() {
        val json = readFile("dataelement-example.json")
        val obj = mapper.fromJson(json, DataElement::class.java)
        assertTrue(stringMatch("DataElement", obj.resourceType))
        assertTrue(stringMatch("gender", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("DCP", obj.publisher))
        assertTrue(stringMatch("Gender Code", obj.name))
        assertTrue(stringMatch("Administrative gender", obj.title))
    }
}

class dataelement_labtestmaster_example_jsonTest : DataTests() {
    @Test
    fun `dataelement-labtestmaster-example Test`() {
        val json = readFile("dataelement-labtestmaster-example.json")
        val obj = mapper.fromJson(json, DataElement::class.java)
        assertTrue(stringMatch("DataElement", obj.resourceType))
        assertTrue(stringMatch("prothrombin", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Prothrombin Time", obj.name))
    }
}
