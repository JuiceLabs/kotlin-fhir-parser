package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class provenance_example_sig_jsonTest : DataTests() {
    @Test
    fun `provenance-example-sig Test`() {
        val json = readFile("provenance-example-sig.json")
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("signature", obj.id))
    }
}

class provenance_example_cwl_jsonTest : DataTests() {
    @Test
    fun `provenance-example-cwl Test`() {
        val json = readFile("provenance-example-cwl.json")
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example-cwl", obj.id))
    }
}

class provenance_example_biocompute_object_jsonTest : DataTests() {
    @Test
    fun `provenance-example-biocompute-object Test`() {
        val json = readFile("provenance-example-biocompute-object.json")
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example-biocompute-object", obj.id))
    }
}

class provenance_example_jsonTest : DataTests() {
    @Test
    fun `provenance-example Test`() {
        val json = readFile("provenance-example.json")
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}
