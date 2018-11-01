package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class adverseevent_example_jsonTest : DataTests() {
    @Test
    fun `adverseevent-example Test`() {
        val json = readFile("adverseevent-example.json")
        val obj = mapper.fromJson(json, AdverseEvent::class.java)
        assertTrue(stringMatch("AdverseEvent", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("AE", obj.category))
        assertTrue(stringMatch("This was a mild rash on the ", obj.description))
    }
}
