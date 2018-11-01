package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class expansionprofile_example_jsonTest : DataTests() {
    @Test
    fun `expansionprofile-example Test`() {
        val json = readFile("expansionprofile-example.json")
        val obj = mapper.fromJson(json, ExpansionProfile::class.java)
        assertTrue(stringMatch("ExpansionProfile", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("0.1", obj.version))
        assertTrue(stringMatch("Example Expansion Profile", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertEquals(true, if (obj.excludeNested != null) obj.excludeNested else false, "Field: excludeNested")
    }
}
