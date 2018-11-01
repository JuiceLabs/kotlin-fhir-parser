package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class relatedperson_example_peter_jsonTest : DataTests() {
    @Test
    fun `relatedperson-example-peter Test`() {
        val json = readFile("relatedperson-example-peter.json")
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("peter", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}

class relatedperson_example_f001_sarah_jsonTest : DataTests() {
    @Test
    fun `relatedperson-example-f001-sarah Test`() {
        val json = readFile("relatedperson-example-f001-sarah.json")
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("female", obj.gender))
    }
}

class relatedperson_example_jsonTest : DataTests() {
    @Test
    fun `relatedperson-example Test`() {
        val json = readFile("relatedperson-example.json")
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("benedicte", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("female", obj.gender))
    }
}

class relatedperson_example_f002_ariadne_jsonTest : DataTests() {
    @Test
    fun `relatedperson-example-f002-ariadne Test`() {
        val json = readFile("relatedperson-example-f002-ariadne.json")
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("female", obj.gender))
    }
}
