package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class basic_example2_jsonTest : DataTests() {
    @Test
    fun `basic-example2 Test`() {
        val json = readFile("basic-example2.json")
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("classModel", obj.id))
    }
}

class basic_example_narrative_jsonTest : DataTests() {
    @Test
    fun `basic-example-narrative Test`() {
        val json = readFile("basic-example-narrative.json")
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("basic-example-narrative", obj.id))
    }
}

class basic_example_jsonTest : DataTests() {
    @Test
    fun `basic-example Test`() {
        val json = readFile("basic-example.json")
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("referral", obj.id))
    }
}
