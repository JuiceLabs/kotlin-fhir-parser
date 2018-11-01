package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class measure_component_b_example_jsonTest : DataTests() {
    @Test
    fun `measure-component-b-example Test`() {
        val json = readFile("measure-component-b-example.json")
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("component-b-example", obj.id))
        assertTrue(stringMatch("Screening for Depression", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class measure_predecessor_example_jsonTest : DataTests() {
    @Test
    fun `measure-predecessor-example Test`() {
        val json = readFile("measure-predecessor-example.json")
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("measure-predecessor-example", obj.id))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Exclusive Breastfeeding Meas", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Improvement noted as an incr", obj.improvementNotation))
    }
}

class measure_cms146_example_jsonTest : DataTests() {
    @Test
    fun `measure-cms146-example Test`() {
        val json = readFile("measure-cms146-example.json")
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("measure-cms146-example", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("CMS146", obj.name))
        assertTrue(stringMatch("Appropriate Testing for Chil", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("National Committee for Quali", obj.publisher))
        assertTrue(stringMatch("Higher score indicates bette", obj.improvementNotation))
    }
}

class measure_component_a_example_jsonTest : DataTests() {
    @Test
    fun `measure-component-a-example Test`() {
        val json = readFile("measure-component-a-example.json")
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("component-a-example", obj.id))
        assertTrue(stringMatch("Screening for Alcohol Misuse", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class measure_composite_example_jsonTest : DataTests() {
    @Test
    fun `measure-composite-example Test`() {
        val json = readFile("measure-composite-example.json")
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("composite-example", obj.id))
        assertTrue(stringMatch("Behavioral Assessment Compos", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}
