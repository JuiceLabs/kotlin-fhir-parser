package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class questionnaire_example_jsonTest : DataTests() {
    @Test
    fun `questionnaire-example Test`() {
        val json = readFile("questionnaire-example.json")
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("3141", obj.id))
        assertTrue(stringMatch("Cancer Quality Forum Questio", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class questionnaire_example_f201_lifelines_jsonTest : DataTests() {
    @Test
    fun `questionnaire-example-f201-lifelines Test`() {
        val json = readFile("questionnaire-example-f201-lifelines.json")
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class questionnaire_example_gcs_jsonTest : DataTests() {
    @Test
    fun `questionnaire-example-gcs Test`() {
        val json = readFile("questionnaire-example-gcs.json")
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("gcs", obj.id))
        assertTrue(stringMatch("Glasgow Coma Score", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("FHIR Project team", obj.publisher))
    }
}

class questionnaire_example_bluebook_jsonTest : DataTests() {
    @Test
    fun `questionnaire-example-bluebook Test`() {
        val json = readFile("questionnaire-example-bluebook.json")
        val obj = mapper.fromJson(json, Questionnaire::class.java)
        assertTrue(stringMatch("Questionnaire", obj.resourceType))
        assertTrue(stringMatch("bb", obj.id))
        assertTrue(stringMatch("NSW Government My Personal H", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("New South Wales Department o", obj.publisher))
    }
}
