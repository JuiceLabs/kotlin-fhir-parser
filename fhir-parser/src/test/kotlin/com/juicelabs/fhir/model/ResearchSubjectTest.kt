package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class researchsubject_example_jsonTest : DataTests() {
    @Test
    fun `researchsubject-example Test`() {
        val json = readFile("researchsubject-example.json")
        val obj = mapper.fromJson(json, ResearchSubject::class.java)
        assertTrue(stringMatch("ResearchSubject", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("candidate", obj.status))
    }
}
