package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class requestgroup_kdn5_example_jsonTest : DataTests() {
    @Test
    fun `requestgroup-kdn5-example Test`() {
        val json = readFile("requestgroup-kdn5-example.json")
        val obj = mapper.fromJson(json, RequestGroup::class.java)
        assertTrue(stringMatch("RequestGroup", obj.resourceType))
        assertTrue(stringMatch("kdn5-example", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
    }
}

class requestgroup_example_jsonTest : DataTests() {
    @Test
    fun `requestgroup-example Test`() {
        val json = readFile("requestgroup-example.json")
        val obj = mapper.fromJson(json, RequestGroup::class.java)
        assertTrue(stringMatch("RequestGroup", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
    }
}
