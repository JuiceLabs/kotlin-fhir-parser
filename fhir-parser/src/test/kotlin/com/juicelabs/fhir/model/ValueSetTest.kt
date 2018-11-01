package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class valueset_example_jsonTest : DataTests() {
    @Test
    fun `valueset-example Test`() {
        val json = readFile("valueset-example.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-extensional", obj.id))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol ", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
    }
}

class valueset_example_expansion_jsonTest : DataTests() {
    @Test
    fun `valueset-example-expansion Test`() {
        val json = readFile("valueset-example-expansion.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-expansion", obj.id))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol ", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("FHIR Project team", obj.publisher))
    }
}

class valueset_example_inactive_jsonTest : DataTests() {
    @Test
    fun `valueset-example-inactive Test`() {
        val json = readFile("valueset-example-inactive.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("inactive", obj.id))
        assertTrue(stringMatch("Example-inactive", obj.name))
        assertTrue(stringMatch("Example with inactive codes", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class valueset_example_yesnodontknow_jsonTest : DataTests() {
    @Test
    fun `valueset-example-yesnodontknow Test`() {
        val json = readFile("valueset-example-yesnodontknow.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("yesnodontknow", obj.id))
        assertTrue(stringMatch("Yes/No/Don't Know", obj.name))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class valueset_list_example_codes_jsonTest : DataTests() {
    @Test
    fun `valueset-list-example-codes Test`() {
        val json = readFile("valueset-list-example-codes.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("list-example-codes", obj.id))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Example Use Codes for List", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertEquals(true, if (obj.immutable != null) obj.immutable else false, "Field: immutable")
    }
}

class valueset_example_intensional_jsonTest : DataTests() {
    @Test
    fun `valueset-example-intensional Test`() {
        val json = readFile("valueset-example-intensional.json")
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-intensional", obj.id))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol ", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
    }
}
