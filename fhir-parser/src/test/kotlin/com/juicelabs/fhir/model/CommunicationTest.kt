package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class communication_example_fm_attachment_jsonTest : DataTests() {
    @Test
    fun `communication-example-fm-attachment Test`() {
        val json = readFile("communication-example-fm-attachment.json")
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("fm-attachment", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class communication_example_fm_solicited_attachment_jsonTest : DataTests() {
    @Test
    fun `communication-example-fm-solicited-attachment Test`() {
        val json = readFile("communication-example-fm-solicited-attachment.json")
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("fm-solicited", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class communication_example_jsonTest : DataTests() {
    @Test
    fun `communication-example Test`() {
        val json = readFile("communication-example.json")
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
