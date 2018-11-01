package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class careteam_example_jsonTest : DataTests() {
    @Test
    fun `careteam-example Test`() {
        val json = readFile("careteam-example.json")
        val obj = mapper.fromJson(json, CareTeam::class.java)
        assertTrue(stringMatch("CareTeam", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Peter James Charlmers Care P", obj.name))
    }
}
