package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class researchstudy_example_jsonTest : DataTests() {
    @Test
    fun `researchstudy-example Test`() {
        val json = readFile("researchstudy-example.json")
        val obj = mapper.fromJson(json, ResearchStudy::class.java)
        assertTrue(stringMatch("ResearchStudy", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("draft", obj.status))
    }
}
