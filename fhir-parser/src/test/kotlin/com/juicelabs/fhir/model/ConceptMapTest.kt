package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class conceptmap_example_jsonTest : DataTests() {
    @Test
    fun `conceptmap-example Test`() {
        val json = readFile("conceptmap-example.json")
        val obj = mapper.fromJson(json, ConceptMap::class.java)
        assertTrue(stringMatch("ConceptMap", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("20120613", obj.version))
        assertTrue(stringMatch("FHIR-v3-Address-Use", obj.name))
        assertTrue(stringMatch("FHIR/v3 Address Use Mapping", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7, Inc", obj.publisher))
    }
}

class conceptmap_example_2_jsonTest : DataTests() {
    @Test
    fun `conceptmap-example-2 Test`() {
        val json = readFile("conceptmap-example-2.json")
        val obj = mapper.fromJson(json, ConceptMap::class.java)
        assertTrue(stringMatch("ConceptMap", obj.resourceType))
        assertTrue(stringMatch("example2", obj.id))
        assertTrue(stringMatch("FHIR-exanple-2", obj.name))
        assertTrue(stringMatch("FHIR Example 2", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7, Inc", obj.publisher))
    }
}

class conceptmap_example_specimen_type_jsonTest : DataTests() {
    @Test
    fun `conceptmap-example-specimen-type Test`() {
        val json = readFile("conceptmap-example-specimen-type.json")
        val obj = mapper.fromJson(json, ConceptMap::class.java)
        assertTrue(stringMatch("ConceptMap", obj.resourceType))
        assertTrue(stringMatch("102", obj.id))
        assertTrue(stringMatch("20130725", obj.version))
        assertTrue(stringMatch("Specimen mapping from v2 tab", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(false, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("FHIR project team (original ", obj.publisher))
    }
}
