package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class condition_example_f003_abscess_jsonTest : DataTests() {
    @Test
    fun `condition-example-f003-abscess Test`() {
        val json = readFile("condition-example-f003-abscess.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_f203_sepsis_jsonTest : DataTests() {
    @Test
    fun `condition-example-f203-sepsis Test`() {
        val json = readFile("condition-example-f203-sepsis.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_stroke_jsonTest : DataTests() {
    @Test
    fun `condition-example-stroke Test`() {
        val json = readFile("condition-example-stroke.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("stroke", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_family_history_jsonTest : DataTests() {
    @Test
    fun `condition-example-family-history Test`() {
        val json = readFile("condition-example-family-history.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("family-history", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
    }
}

class condition_example_f002_lung_jsonTest : DataTests() {
    @Test
    fun `condition-example-f002-lung Test`() {
        val json = readFile("condition-example-f002-lung.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_f205_infection_jsonTest : DataTests() {
    @Test
    fun `condition-example-f205-infection Test`() {
        val json = readFile("condition-example-f205-infection.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f205", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("differential", obj.verificationStatus))
    }
}

class condition_example_f204_renal_jsonTest : DataTests() {
    @Test
    fun `condition-example-f204-renal Test`() {
        val json = readFile("condition-example-f204-renal.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("differential", obj.verificationStatus))
    }
}

class condition_example2_jsonTest : DataTests() {
    @Test
    fun `condition-example2 Test`() {
        val json = readFile("condition-example2.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("example2", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("approximately November 2012", obj.onsetString))
    }
}

class condition_example_f202_malignancy_jsonTest : DataTests() {
    @Test
    fun `condition-example-f202-malignancy Test`() {
        val json = readFile("condition-example-f202-malignancy.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("resolved", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_f201_fever_jsonTest : DataTests() {
    @Test
    fun `condition-example-f201-fever Test`() {
        val json = readFile("condition-example-f201-fever.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("resolved", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("around April 9, 2013", obj.abatementString))
    }
}

class condition_example_jsonTest : DataTests() {
    @Test
    fun `condition-example Test`() {
        val json = readFile("condition-example.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}

class condition_example_f001_heart_jsonTest : DataTests() {
    @Test
    fun `condition-example-f001-heart Test`() {
        val json = readFile("condition-example-f001-heart.json")
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
    }
}
