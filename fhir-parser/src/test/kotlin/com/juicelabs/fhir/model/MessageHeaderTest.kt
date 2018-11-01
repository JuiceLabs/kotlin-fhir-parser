package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class messageheader_example_jsonTest : DataTests() {
    @Test
    fun `messageheader-example Test`() {
        val json = readFile("messageheader-example.json")
        val obj = mapper.fromJson(json, MessageHeader::class.java)
        assertTrue(stringMatch("MessageHeader", obj.resourceType))
        assertTrue(stringMatch("1cbdfb97-5859-48a4-8301-d54e", obj.id))
    }
}
