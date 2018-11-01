package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class structuredefinition_example_jsonTest : DataTests() {
    @Test
    fun `structuredefinition-example Test`() {
        val json = readFile("structuredefinition-example.json")
        val obj = mapper.fromJson(json, StructureDefinition::class.java)
        assertTrue(stringMatch("StructureDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("2", obj.version))
        assertTrue(stringMatch("LipidProfileExample", obj.name))
        assertTrue(stringMatch("Example Lipid Profile", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Intersections Pty Ltd", obj.publisher))
        assertTrue(stringMatch("resource", obj.kind))
        assertEquals(false, if (obj.abstract != null) obj.abstract else false, "Field: abstract")
        assertTrue(stringMatch("DiagnosticReport", obj.type))
        assertTrue(stringMatch("constraint", obj.derivation))
    }
}
