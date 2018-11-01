package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class library_predecessor_example_jsonTest : DataTests() {
    @Test
    fun `library-predecessor-example Test`() {
        val json = readFile("library-predecessor-example.json")
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("library-fhir-helpers-predece", obj.id))
        assertTrue(stringMatch("1.6", obj.version))
        assertTrue(stringMatch("FHIR Helpers", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
    }
}

class library_cms146_example_jsonTest : DataTests() {
    @Test
    fun `library-cms146-example Test`() {
        val json = readFile("library-cms146-example.json")
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("library-cms146-example", obj.id))
        assertTrue(stringMatch("2.0.0", obj.version))
        assertTrue(stringMatch("Appropriate Testing for Chil", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class library_example_jsonTest : DataTests() {
    @Test
    fun `library-example Test`() {
        val json = readFile("library-example.json")
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("2.0.0", obj.version))
        assertTrue(stringMatch("Chlamydia Screening Common L", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class library_composition_example_jsonTest : DataTests() {
    @Test
    fun `library-composition-example Test`() {
        val json = readFile("library-composition-example.json")
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("composition-example", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("Zika Artifacts", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}
