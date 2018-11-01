package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class immunizationrecommendation_example_jsonTest : DataTests() {
    @Test
    fun `immunizationrecommendation-example Test`() {
        val json = readFile("immunizationrecommendation-example.json")
        val obj = mapper.fromJson(json, ImmunizationRecommendation::class.java)
        assertTrue(stringMatch("ImmunizationRecommendation", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}

class immunizationrecommendation_target_disease_example_jsonTest : DataTests() {
    @Test
    fun `immunizationrecommendation-target-disease-example Test`() {
        val json = readFile("immunizationrecommendation-target-disease-example.json")
        val obj = mapper.fromJson(json, ImmunizationRecommendation::class.java)
        assertTrue(stringMatch("ImmunizationRecommendation", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
    }
}
