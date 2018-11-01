package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class parameters_example_jsonTest : DataTests() {
    @Test
    fun `parameters-example Test`() {
        val json = readFile("parameters-example.json")
        val obj = mapper.fromJson(json, Parameters::class.java)
        assertTrue(stringMatch("Parameters", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}
