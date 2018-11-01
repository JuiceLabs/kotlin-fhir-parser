package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class operationdefinition_example_jsonTest : DataTests() {
    @Test
    fun `operationdefinition-example Test`() {
        val json = readFile("operationdefinition-example.json")
        val obj = mapper.fromJson(json, OperationDefinition::class.java)
        assertTrue(stringMatch("OperationDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("B", obj.version))
        assertTrue(stringMatch("Populate Questionnaire", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("operation", obj.kind))
        assertTrue(stringMatch("Acme Healthcare Services", obj.publisher))
        assertTrue(stringMatch("populate", obj.code))
        assertTrue(stringMatch("Only implemented for Labs an", obj.comment))
        assertEquals(false, if (obj.system != null) obj.system else false, "Field: system")
        assertEquals(false, if (obj.type != null) obj.type else false, "Field: type")
        assertEquals(true, if (obj.instance != null) obj.instance else false, "Field: instance")
    }
}
