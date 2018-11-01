package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class careplan_example_f002_lung_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f002-lung Test`() {
        val json = readFile("careplan-example-f002-lung.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_f202_malignancy_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f202-malignancy Test`() {
        val json = readFile("careplan-example-f202-malignancy.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_obesity_narrative_jsonTest : DataTests() {
    @Test
    fun `careplan-example-obesity-narrative Test`() {
        val json = readFile("careplan-example-obesity-narrative.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("obesity-narrative", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_jsonTest : DataTests() {
    @Test
    fun `careplan-example Test`() {
        val json = readFile("careplan-example.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
        assertTrue(stringMatch("Manage obesity and weight lo", obj.description))
    }
}

class careplan_example_f201_renal_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f201-renal Test`() {
        val json = readFile("careplan-example-f201-renal.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("proposal", obj.intent))
    }
}

class careplan_example_GPVisit_jsonTest : DataTests() {
    @Test
    fun `careplan-example-GPVisit Test`() {
        val json = readFile("careplan-example-GPVisit.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("gpvisit", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_integrated_jsonTest : DataTests() {
    @Test
    fun `careplan-example-integrated Test`() {
        val json = readFile("careplan-example-integrated.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("integrate", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_f003_pharynx_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f003-pharynx Test`() {
        val json = readFile("careplan-example-f003-pharynx.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_f001_heart_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f001-heart Test`() {
        val json = readFile("careplan-example-f001-heart.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_pregnancy_jsonTest : DataTests() {
    @Test
    fun `careplan-example-pregnancy Test`() {
        val json = readFile("careplan-example-pregnancy.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("preg", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class careplan_example_f203_sepsis_jsonTest : DataTests() {
    @Test
    fun `careplan-example-f203-sepsis Test`() {
        val json = readFile("careplan-example-f203-sepsis.json")
        val obj = mapper.fromJson(json, CarePlan::class.java)
        assertTrue(stringMatch("CarePlan", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}
