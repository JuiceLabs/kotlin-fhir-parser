package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class group_example_jsonTest : DataTests() {
    @Test
    fun `group-example Test`() {
        val json = readFile("group-example.json")
        val obj = mapper.fromJson(json, Group::class.java)
        assertTrue(stringMatch("Group", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("animal", obj.type))
        assertEquals(true, if (obj.actual != null) obj.actual else false, "Field: actual")
        assertTrue(stringMatch("John's herd", obj.name))
    }
}

class group_example_member_jsonTest : DataTests() {
    @Test
    fun `group-example-member Test`() {
        val json = readFile("group-example-member.json")
        val obj = mapper.fromJson(json, Group::class.java)
        assertTrue(stringMatch("Group", obj.resourceType))
        assertTrue(stringMatch("102", obj.id))
        assertTrue(stringMatch("person", obj.type))
        assertEquals(true, if (obj.actual != null) obj.actual else false, "Field: actual")
    }
}
