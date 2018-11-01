package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class audit_event_example_search_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-search Test`() {
        val json = readFile("audit-event-example-search.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-search", obj.id))
        assertTrue(stringMatch("E", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class audit_event_example_logout_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-logout Test`() {
        val json = readFile("audit-event-example-logout.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-logout", obj.id))
        assertTrue(stringMatch("E", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class audit_event_example_vread_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-vread Test`() {
        val json = readFile("audit-event-example-vread.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-rest", obj.id))
        assertTrue(stringMatch("R", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class audit_event_example_media_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-media Test`() {
        val json = readFile("audit-event-example-media.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-media", obj.id))
        assertTrue(stringMatch("R", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class audit_event_example_login_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-login Test`() {
        val json = readFile("audit-event-example-login.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-login", obj.id))
        assertTrue(stringMatch("E", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class audit_event_example_pixQuery_jsonTest : DataTests() {
    @Test
    fun `audit-event-example-pixQuery Test`() {
        val json = readFile("audit-event-example-pixQuery.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-pixQuery", obj.id))
        assertTrue(stringMatch("E", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class auditevent_example_jsonTest : DataTests() {
    @Test
    fun `auditevent-example Test`() {
        val json = readFile("auditevent-example.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("E", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
    }
}

class auditevent_example_disclosure_jsonTest : DataTests() {
    @Test
    fun `auditevent-example-disclosure Test`() {
        val json = readFile("auditevent-example-disclosure.json")
        val obj = mapper.fromJson(json, AuditEvent::class.java)
        assertTrue(stringMatch("AuditEvent", obj.resourceType))
        assertTrue(stringMatch("example-disclosure", obj.id))
        assertTrue(stringMatch("R", obj.action))
        assertTrue(stringMatch("0", obj.outcome))
        assertTrue(stringMatch("Successful  Disclosure", obj.outcomeDesc))
    }
}
