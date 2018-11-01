package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class riskassessment_example_population_jsonTest : DataTests() {
    @Test
    fun `riskassessment-example-population Test`() {
        val json = readFile("riskassessment-example-population.json")
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("population", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class riskassessment_example_cardiac_jsonTest : DataTests() {
    @Test
    fun `riskassessment-example-cardiac Test`() {
        val json = readFile("riskassessment-example-cardiac.json")
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("cardiac", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class riskassessment_example_jsonTest : DataTests() {
    @Test
    fun `riskassessment-example Test`() {
        val json = readFile("riskassessment-example.json")
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("genetic", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("High degree of certainty", obj.comment))
    }
}

class riskassessment_example_prognosis_jsonTest : DataTests() {
    @Test
    fun `riskassessment-example-prognosis Test`() {
        val json = readFile("riskassessment-example-prognosis.json")
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("prognosis", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}
