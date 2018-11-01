package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class encounter_example_home_jsonTest : DataTests() {
    @Test
    fun `encounter-example-home Test`() {
        val json = readFile("encounter-example-home.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("home", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_f201_20130404_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f201-20130404 Test`() {
        val json = readFile("encounter-example-f201-20130404.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_f003_abscess_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f003-abscess Test`() {
        val json = readFile("encounter-example-f003-abscess.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_jsonTest : DataTests() {
    @Test
    fun `encounter-example Test`() {
        val json = readFile("encounter-example.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
    }
}

class encounter_example_f002_lung_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f002-lung Test`() {
        val json = readFile("encounter-example-f002-lung.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_f203_20130311_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f203-20130311 Test`() {
        val json = readFile("encounter-example-f203-20130311.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_xcda_jsonTest : DataTests() {
    @Test
    fun `encounter-example-xcda Test`() {
        val json = readFile("encounter-example-xcda.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("xcda", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_f202_20130128_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f202-20130128 Test`() {
        val json = readFile("encounter-example-f202-20130128.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}

class encounter_example_emerg_jsonTest : DataTests() {
    @Test
    fun `encounter-example-emerg Test`() {
        val json = readFile("encounter-example-emerg.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("emerg", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
    }
}

class encounter_example_f001_heart_jsonTest : DataTests() {
    @Test
    fun `encounter-example-f001-heart Test`() {
        val json = readFile("encounter-example-f001-heart.json")
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("finished", obj.status))
    }
}
