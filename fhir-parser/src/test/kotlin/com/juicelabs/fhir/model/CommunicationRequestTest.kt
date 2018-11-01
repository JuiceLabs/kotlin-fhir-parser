package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class communicationrequest_example_jsonTest : DataTests() {
    @Test
    fun `communicationrequest-example Test`() {
        val json = readFile("communicationrequest-example.json")
        val obj = mapper.fromJson(json, CommunicationRequest::class.java)
        assertTrue(stringMatch("CommunicationRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class communicationrequest_example_fm_solicit_attachment_jsonTest : DataTests() {
    @Test
    fun `communicationrequest-example-fm-solicit-attachment Test`() {
        val json = readFile("communicationrequest-example-fm-solicit-attachment.json")
        val obj = mapper.fromJson(json, CommunicationRequest::class.java)
        assertTrue(stringMatch("CommunicationRequest", obj.resourceType))
        assertTrue(stringMatch("fm-solicit", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("routine", obj.priority))
    }
}
