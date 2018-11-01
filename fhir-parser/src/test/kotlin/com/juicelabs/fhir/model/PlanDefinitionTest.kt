package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class plandefinition_example_kdn5_simplified_jsonTest : DataTests() {
    @Test
    fun `plandefinition-example-kdn5-simplified Test`() {
        val json = readFile("plandefinition-example-kdn5-simplified.json")
        val obj = mapper.fromJson(json, PlanDefinition::class.java)
        assertTrue(stringMatch("PlanDefinition", obj.resourceType))
        assertTrue(stringMatch("KDN5", obj.id))
        assertTrue(stringMatch("1", obj.version))
        assertTrue(stringMatch("Gemcitabine/CARBOplatin", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("National Comprehensive Cance", obj.publisher))
    }
}

class plandefinition_options_example_jsonTest : DataTests() {
    @Test
    fun `plandefinition-options-example Test`() {
        val json = readFile("plandefinition-options-example.json")
        val obj = mapper.fromJson(json, PlanDefinition::class.java)
        assertTrue(stringMatch("PlanDefinition", obj.resourceType))
        assertTrue(stringMatch("options-example", obj.id))
        assertTrue(stringMatch("This example illustrates rel", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class plandefinition_protocol_example_jsonTest : DataTests() {
    @Test
    fun `plandefinition-protocol-example Test`() {
        val json = readFile("plandefinition-protocol-example.json")
        val obj = mapper.fromJson(json, PlanDefinition::class.java)
        assertTrue(stringMatch("PlanDefinition", obj.resourceType))
        assertTrue(stringMatch("protocol-example", obj.id))
        assertTrue(stringMatch("Obesity Assessment Protocol", obj.title))
        assertTrue(stringMatch("draft", obj.status))
    }
}

class plandefinition_example_jsonTest : DataTests() {
    @Test
    fun `plandefinition-example Test`() {
        val json = readFile("plandefinition-example.json")
        val obj = mapper.fromJson(json, PlanDefinition::class.java)
        assertTrue(stringMatch("PlanDefinition", obj.resourceType))
        assertTrue(stringMatch("low-suicide-risk-order-set", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("LowSuicideRiskOrderSet", obj.name))
        assertTrue(stringMatch("Low Suicide Risk Order Set", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Motive Medical Intelligence", obj.publisher))
        assertTrue(stringMatch("This order set should be app", obj.usage))
    }
}

class plandefinition_predecessor_example_jsonTest : DataTests() {
    @Test
    fun `plandefinition-predecessor-example Test`() {
        val json = readFile("plandefinition-predecessor-example.json")
        val obj = mapper.fromJson(json, PlanDefinition::class.java)
        assertTrue(stringMatch("PlanDefinition", obj.resourceType))
        assertTrue(stringMatch("zika-virus-intervention-init", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("Example Zika Virus Intervent", obj.title))
        assertTrue(stringMatch("active", obj.status))
    }
}
