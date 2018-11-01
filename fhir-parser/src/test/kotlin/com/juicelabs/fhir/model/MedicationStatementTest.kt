package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class medicationstatementexample5_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample5 Test`() {
        val json = readFile("medicationstatementexample5.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example005", obj.id))
        assertTrue(stringMatch("entered-in-error", obj.status))
        assertTrue(stringMatch("unk", obj.taken))
    }
}

class medicationstatementexample4_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample4 Test`() {
        val json = readFile("medicationstatementexample4.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example004", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("y", obj.taken))
    }
}

class medicationstatementexample3_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample3 Test`() {
        val json = readFile("medicationstatementexample3.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example003", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("y", obj.taken))
    }
}

class medicationstatementexample2_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample2 Test`() {
        val json = readFile("medicationstatementexample2.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example002", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("n", obj.taken))
    }
}

class medicationstatementexample1_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample1 Test`() {
        val json = readFile("medicationstatementexample1.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example001", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("n", obj.taken))
    }
}

class medicationstatementexample7_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample7 Test`() {
        val json = readFile("medicationstatementexample7.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example007", obj.id))
        assertTrue(stringMatch("intended", obj.status))
        assertTrue(stringMatch("y", obj.taken))
    }
}

class medicationstatementexample6_jsonTest : DataTests() {
    @Test
    fun `medicationstatementexample6 Test`() {
        val json = readFile("medicationstatementexample6.json")
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example006", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("n", obj.taken))
    }
}
