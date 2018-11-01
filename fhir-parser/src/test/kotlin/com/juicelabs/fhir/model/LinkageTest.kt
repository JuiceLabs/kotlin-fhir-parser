package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class linkage_example_jsonTest : DataTests() {
    @Test
    fun `linkage-example Test`() {
        val json = readFile("linkage-example.json")
        val obj = mapper.fromJson(json, Linkage::class.java)
        assertTrue(stringMatch("Linkage", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}
