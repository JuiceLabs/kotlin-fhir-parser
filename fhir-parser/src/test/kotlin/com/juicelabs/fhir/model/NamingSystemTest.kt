package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class namingsystem_example_id_jsonTest : DataTests() {
    @Test
    fun `namingsystem-example-id Test`() {
        val json = readFile("namingsystem-example-id.json")
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example-id", obj.id))
        assertTrue(stringMatch("Austalian Healthcare Identif", obj.name))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("identifier", obj.kind))
        assertTrue(stringMatch("HL7 Australia on behalf of N", obj.publisher))
        assertTrue(stringMatch("HI Service Operator / NEHTA", obj.responsible))
        assertTrue(stringMatch("Used in Australia for identi", obj.usage))
    }
}

class namingsystem_example_replaced_jsonTest : DataTests() {
    @Test
    fun `namingsystem-example-replaced Test`() {
        val json = readFile("namingsystem-example-replaced.json")
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example-replaced", obj.id))
        assertTrue(stringMatch("SNOMED CT Spanish", obj.name))
        assertTrue(stringMatch("retired", obj.status))
        assertTrue(stringMatch("codesystem", obj.kind))
        assertTrue(stringMatch("Not HL7!", obj.publisher))
    }
}

class namingsystem_example_jsonTest : DataTests() {
    @Test
    fun `namingsystem-example Test`() {
        val json = readFile("namingsystem-example.json")
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("SNOMED CT", obj.name))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("codesystem", obj.kind))
        assertTrue(stringMatch("HL7 International on behalf ", obj.publisher))
        assertTrue(stringMatch("IHTSDO & affiliates", obj.responsible))
    }
}
