package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class questionnaireresponse_example_jsonTest : DataTests() {
    @Test
    fun `questionnaireresponse-example Test`() {
        val json = readFile("questionnaireresponse-example.json")
        val obj = mapper.fromJson(json, QuestionnaireResponse::class.java)
        assertTrue(stringMatch("QuestionnaireResponse", obj.resourceType))
        assertTrue(stringMatch("3141", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class questionnaireresponse_example_ussg_fht_answers_jsonTest : DataTests() {
    @Test
    fun `questionnaireresponse-example-ussg-fht-answers Test`() {
        val json = readFile("questionnaireresponse-example-ussg-fht-answers.json")
        val obj = mapper.fromJson(json, QuestionnaireResponse::class.java)
        assertTrue(stringMatch("QuestionnaireResponse", obj.resourceType))
        assertTrue(stringMatch("ussg-fht-answers", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
    }
}

class questionnaireresponse_example_f201_lifelines_jsonTest : DataTests() {
    @Test
    fun `questionnaireresponse-example-f201-lifelines Test`() {
        val json = readFile("questionnaireresponse-example-f201-lifelines.json")
        val obj = mapper.fromJson(json, QuestionnaireResponse::class.java)
        assertTrue(stringMatch("QuestionnaireResponse", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class questionnaireresponse_example_bluebook_jsonTest : DataTests() {
    @Test
    fun `questionnaireresponse-example-bluebook Test`() {
        val json = readFile("questionnaireresponse-example-bluebook.json")
        val obj = mapper.fromJson(json, QuestionnaireResponse::class.java)
        assertTrue(stringMatch("QuestionnaireResponse", obj.resourceType))
        assertTrue(stringMatch("bb", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class questionnaireresponse_example_gcs_jsonTest : DataTests() {
    @Test
    fun `questionnaireresponse-example-gcs Test`() {
        val json = readFile("questionnaireresponse-example-gcs.json")
        val obj = mapper.fromJson(json, QuestionnaireResponse::class.java)
        assertTrue(stringMatch("QuestionnaireResponse", obj.resourceType))
        assertTrue(stringMatch("gcs", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
