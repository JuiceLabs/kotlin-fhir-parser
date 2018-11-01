package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class implementationguide_example_jsonTest : DataTests() {
    @Test
    fun `implementationguide-example Test`() {
        val json = readFile("implementationguide-example.json")
        val obj = mapper.fromJson(json, ImplementationGuide::class.java)
        assertTrue(stringMatch("ImplementationGuide", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("0", obj.version))
        assertTrue(stringMatch("Data Access Framework (DAF)", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(false, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("ONC / HL7 Joint project", obj.publisher))
    }
}
