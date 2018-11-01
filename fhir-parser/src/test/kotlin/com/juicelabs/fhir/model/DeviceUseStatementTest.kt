package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class deviceusestatement_example_jsonTest : DataTests() {
    @Test
    fun `deviceusestatement-example Test`() {
        val json = readFile("deviceusestatement-example.json")
        val obj = mapper.fromJson(json, DeviceUseStatement::class.java)
        assertTrue(stringMatch("DeviceUseStatement", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
