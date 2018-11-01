package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class organization_example_jsonTest : DataTests() {
    @Test
    fun `organization-example Test`() {
        val json = readFile("organization-example.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("hl7", obj.id))
        assertTrue(stringMatch("Health Level Seven Internati", obj.name))
    }
}

class organization_example_mmanu_jsonTest : DataTests() {
    @Test
    fun `organization-example-mmanu Test`() {
        val json = readFile("organization-example-mmanu.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("mmanu", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Acme Corporation", obj.name))
    }
}

class organization_example_gastro_jsonTest : DataTests() {
    @Test
    fun `organization-example-gastro Test`() {
        val json = readFile("organization-example-gastro.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("Gastroenterology", obj.name))
    }
}

class organization_example_lab_jsonTest : DataTests() {
    @Test
    fun `organization-example-lab Test`() {
        val json = readFile("organization-example-lab.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("1832473e-2fe0-452d-abe9-3cdb", obj.id))
        assertTrue(stringMatch("Clinical Lab", obj.name))
    }
}

class organization_example_f002_burgers_card_jsonTest : DataTests() {
    @Test
    fun `organization-example-f002-burgers-card Test`() {
        val json = readFile("organization-example-f002-burgers-card.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Burgers UMC Cardiology unit", obj.name))
    }
}

class organization_example_f201_aumc_jsonTest : DataTests() {
    @Test
    fun `organization-example-f201-aumc Test`() {
        val json = readFile("organization-example-f201-aumc.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Artis University Medical Cen", obj.name))
    }
}

class organization_example_good_health_care_jsonTest : DataTests() {
    @Test
    fun `organization-example-good-health-care Test`() {
        val json = readFile("organization-example-good-health-care.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("2.16.840.1.113883.19.5", obj.id))
        assertTrue(stringMatch("Good Health Clinic", obj.name))
    }
}

class organization_example_f001_burgers_jsonTest : DataTests() {
    @Test
    fun `organization-example-f001-burgers Test`() {
        val json = readFile("organization-example-f001-burgers.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("Burgers University Medical C", obj.name))
    }
}

class organization_example_insurer_jsonTest : DataTests() {
    @Test
    fun `organization-example-insurer Test`() {
        val json = readFile("organization-example-insurer.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("XYZ Insurance", obj.name))
    }
}

class organization_example_f203_bumc_jsonTest : DataTests() {
    @Test
    fun `organization-example-f203-bumc Test`() {
        val json = readFile("organization-example-f203-bumc.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Blijdorp Medisch Centrum (BU", obj.name))
    }
}

class organization_example_f003_burgers_ENT_jsonTest : DataTests() {
    @Test
    fun `organization-example-f003-burgers-ENT Test`() {
        val json = readFile("organization-example-f003-burgers-ENT.json")
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("Burgers UMC Ear,Nose,Throat ", obj.name))
    }
}
