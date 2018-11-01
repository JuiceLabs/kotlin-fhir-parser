package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class diagnosticreport_example_f202_bloodculture_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-f202-bloodculture Test`() {
        val json = readFile("diagnosticreport-example-f202-bloodculture.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Blood culture tested positiv", obj.conclusion))
    }
}

class diagnosticreport_example_ghp_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-ghp Test`() {
        val json = readFile("diagnosticreport-example-ghp.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("ghp", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_lipids_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-lipids Test`() {
        val json = readFile("diagnosticreport-example-lipids.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("lipids", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_f001_bloodexam_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-f001-bloodexam Test`() {
        val json = readFile("diagnosticreport-example-f001-bloodexam.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Core lab", obj.conclusion))
    }
}

class diagnosticreport_example_ultrasound_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-ultrasound Test`() {
        val json = readFile("diagnosticreport-example-ultrasound.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("ultrasound", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Unremarkable study", obj.conclusion))
    }
}

class diagnosticreport_example_f201_brainct_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-f201-brainct Test`() {
        val json = readFile("diagnosticreport-example-f201-brainct.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("CT brains: large tumor sphen", obj.conclusion))
    }
}

class diagnosticreport_genetics_example_2_familyhistory_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-genetics-example-2-familyhistory Test`() {
        val json = readFile("diagnosticreport-genetics-example-2-familyhistory.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("dg2", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example Test`() {
        val json = readFile("diagnosticreport-example.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_papsmear_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-papsmear Test`() {
        val json = readFile("diagnosticreport-example-papsmear.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("pap", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_gingival_mass_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-gingival-mass Test`() {
        val json = readFile("diagnosticreport-example-gingival-mass.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("gingival-mass", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_pgx_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-pgx Test`() {
        val json = readFile("diagnosticreport-example-pgx.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("example-pgx", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class diagnosticreport_example_dxa_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-example-dxa Test`() {
        val json = readFile("diagnosticreport-example-dxa.json")
        val obj = mapper.fromJson(json, DiagnosticReport::class.java)
        assertTrue(stringMatch("DiagnosticReport", obj.resourceType))
        assertTrue(stringMatch("102", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}
