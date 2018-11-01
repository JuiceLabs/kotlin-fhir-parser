package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class messagedefinition_example_jsonTest : DataTests() {
    @Test
    fun `messagedefinition-example Test`() {
        val json = readFile("messagedefinition-example.json")
        val obj = mapper.fromJson(json, MessageDefinition::class.java)
        assertTrue(stringMatch("MessageDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("EXAMPLE", obj.name))
        assertTrue(stringMatch("Message definition base exam", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Level Seven, Int'l", obj.publisher))
        assertTrue(stringMatch("Notification", obj.category))
        assertEquals(false, if (obj.responseRequired != null) obj.responseRequired else false, "Field: responseRequired")
    }
}
