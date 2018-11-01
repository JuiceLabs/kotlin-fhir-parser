package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class specimen_example_isolate_jsonTest : DataTests() {
    @Test
    fun `specimen-example-isolate Test`() {
        val json = readFile("specimen-example-isolate.json")
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("isolate", obj.id))
        assertTrue(stringMatch("available", obj.status))
    }
}

class specimen_example_urine_jsonTest : DataTests() {
    @Test
    fun `specimen-example-urine Test`() {
        val json = readFile("specimen-example-urine.json")
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("vma-urine", obj.id))
        assertTrue(stringMatch("available", obj.status))
    }
}

class specimen_example_serum_jsonTest : DataTests() {
    @Test
    fun `specimen-example-serum Test`() {
        val json = readFile("specimen-example-serum.json")
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("sst", obj.id))
    }
}

class specimen_example_jsonTest : DataTests() {
    @Test
    fun `specimen-example Test`() {
        val json = readFile("specimen-example.json")
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("available", obj.status))
    }
}
