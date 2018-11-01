package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class goal_example_jsonTest : DataTests() {
    @Test
    fun `goal-example Test`() {
        val json = readFile("goal-example.json")
        val obj = mapper.fromJson(json, Goal::class.java)
        assertTrue(stringMatch("Goal", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("on-hold", obj.status))
        assertTrue(stringMatch("Patient wants to defer weigh", obj.statusReason))
    }
}

class goal_example_stop_smoking_jsonTest : DataTests() {
    @Test
    fun `goal-example-stop-smoking Test`() {
        val json = readFile("goal-example-stop-smoking.json")
        val obj = mapper.fromJson(json, Goal::class.java)
        assertTrue(stringMatch("Goal", obj.resourceType))
        assertTrue(stringMatch("stop-smoking", obj.id))
        assertTrue(stringMatch("achieved", obj.status))
    }
}
