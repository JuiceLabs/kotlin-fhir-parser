package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class codesystem_list_example_codes_jsonTest : DataTests() {
    @Test
    fun `codesystem-list-example-codes Test`() {
        val json = readFile("codesystem-list-example-codes.json")
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("list-example-codes", obj.id))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Example Use Codes for List", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: caseSensitive")
        assertTrue(stringMatch("complete", obj.content))
    }
}

class codesystem_example_summary_jsonTest : DataTests() {
    @Test
    fun `codesystem-example-summary Test`() {
        val json = readFile("codesystem-example-summary.json")
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("summary", obj.id))
        assertTrue(stringMatch("Code system summary example ", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: caseSensitive")
        assertTrue(stringMatch("not-present", obj.content))
    }
}

class codesystem_example_jsonTest : DataTests() {
    @Test
    fun `codesystem-example Test`() {
        val json = readFile("codesystem-example.json")
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("20160128", obj.version))
        assertTrue(stringMatch("ACME Codes for Cholesterol i", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: caseSensitive")
        assertTrue(stringMatch("complete", obj.content))
    }
}
