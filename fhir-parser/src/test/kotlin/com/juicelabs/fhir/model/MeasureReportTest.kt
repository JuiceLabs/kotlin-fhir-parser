package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class measurereport_cms146_cat1_example_jsonTest : DataTests() {
    @Test
    fun `measurereport-cms146-cat1-example Test`() {
        val json = readFile("measurereport-cms146-cat1-example.json")
        val obj = mapper.fromJson(json, MeasureReport::class.java)
        assertTrue(stringMatch("MeasureReport", obj.resourceType))
        assertTrue(stringMatch("measurereport-cms146-cat1-ex", obj.id))
        assertTrue(stringMatch("complete", obj.status))
        assertTrue(stringMatch("individual", obj.type))
    }
}

class measurereport_cms146_cat2_example_jsonTest : DataTests() {
    @Test
    fun `measurereport-cms146-cat2-example Test`() {
        val json = readFile("measurereport-cms146-cat2-example.json")
        val obj = mapper.fromJson(json, MeasureReport::class.java)
        assertTrue(stringMatch("MeasureReport", obj.resourceType))
        assertTrue(stringMatch("measurereport-cms146-cat2-ex", obj.id))
        assertTrue(stringMatch("complete", obj.status))
        assertTrue(stringMatch("patient-list", obj.type))
    }
}

class measurereport_cms146_cat3_example_jsonTest : DataTests() {
    @Test
    fun `measurereport-cms146-cat3-example Test`() {
        val json = readFile("measurereport-cms146-cat3-example.json")
        val obj = mapper.fromJson(json, MeasureReport::class.java)
        assertTrue(stringMatch("MeasureReport", obj.resourceType))
        assertTrue(stringMatch("measurereport-cms146-cat3-ex", obj.id))
        assertTrue(stringMatch("complete", obj.status))
        assertTrue(stringMatch("summary", obj.type))
    }
}
