package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class processrequest_example_poll_exclusive_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-poll-exclusive Test`() {
        val json = readFile("processrequest-example-poll-exclusive.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1113", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_poll_eob_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-poll-eob Test`() {
        val json = readFile("processrequest-example-poll-eob.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1115", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_poll_specific_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-poll-specific Test`() {
        val json = readFile("processrequest-example-poll-specific.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1111", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_poll_inclusive_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-poll-inclusive Test`() {
        val json = readFile("processrequest-example-poll-inclusive.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1112", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_poll_payrec_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-poll-payrec Test`() {
        val json = readFile("processrequest-example-poll-payrec.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1114", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_jsonTest : DataTests() {
    @Test
    fun `processrequest-example Test`() {
        val json = readFile("processrequest-example.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1110", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
    }
}

class processrequest_example_reverse_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-reverse Test`() {
        val json = readFile("processrequest-example-reverse.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87654", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("cancel", obj.action))
        assertEquals(false, if (obj.nullify != null) obj.nullify else false, "Field: nullify")
    }
}

class processrequest_example_reprocess_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-reprocess Test`() {
        val json = readFile("processrequest-example-reprocess.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("44654", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("reprocess", obj.action))
        assertTrue(stringMatch("ABC12345G", obj.reference))
    }
}

class processrequest_example_status_jsonTest : DataTests() {
    @Test
    fun `processrequest-example-status Test`() {
        val json = readFile("processrequest-example-status.json")
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87655", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("status", obj.action))
    }
}
