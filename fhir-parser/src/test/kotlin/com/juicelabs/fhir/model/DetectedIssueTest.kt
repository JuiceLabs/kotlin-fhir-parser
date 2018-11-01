package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class detectedissue_example_allergy_jsonTest : DataTests() {
    @Test
    fun `detectedissue-example-allergy Test`() {
        val json = readFile("detectedissue-example-allergy.json")
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("allergy", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class detectedissue_example_dup_jsonTest : DataTests() {
    @Test
    fun `detectedissue-example-dup Test`() {
        val json = readFile("detectedissue-example-dup.json")
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("duplicate", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Similar test was performed w", obj.detail))
    }
}

class detectedissue_example_jsonTest : DataTests() {
    @Test
    fun `detectedissue-example Test`() {
        val json = readFile("detectedissue-example.json")
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("ddi", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("high", obj.severity))
        assertTrue(stringMatch("Risk of internal bleeding.  ", obj.detail))
    }
}

class detectedissue_example_lab_jsonTest : DataTests() {
    @Test
    fun `detectedissue-example-lab Test`() {
        val json = readFile("detectedissue-example-lab.json")
        val obj = mapper.fromJson(json, DetectedIssue::class.java)
        assertTrue(stringMatch("DetectedIssue", obj.resourceType))
        assertTrue(stringMatch("lab", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}
