package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class patient_example_xds_jsonTest : DataTests() {
    @Test
    fun `patient-example-xds Test`() {
        val json = readFile("patient-example-xds.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("xds", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class patient_example_f001_pieter_jsonTest : DataTests() {
    @Test
    fun `patient-example-f001-pieter Test`() {
        val json = readFile("patient-example-f001-pieter.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
        assertEquals(true, if (obj.multipleBirthBoolean != null) obj.multipleBirthBoolean else false, "Field: multipleBirthBoolean")
    }
}

class patient_example_d_jsonTest : DataTests() {
    @Test
    fun `patient-example-d Test`() {
        val json = readFile("patient-example-d.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat4", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("female", obj.gender))
        assertEquals(true, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
    }
}

class patient_genetics_example1_jsonTest : DataTests() {
    @Test
    fun `patient-genetics-example1 Test`() {
        val json = readFile("patient-genetics-example1.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("genetics-example1", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("female", obj.gender))
    }
}

class patient_example_b_jsonTest : DataTests() {
    @Test
    fun `patient-example-b Test`() {
        val json = readFile("patient-example-b.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat2", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("other", obj.gender))
    }
}

class patient_example_c_jsonTest : DataTests() {
    @Test
    fun `patient-example-c Test`() {
        val json = readFile("patient-example-c.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat3", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class patient_example_ihe_pcd_jsonTest : DataTests() {
    @Test
    fun `patient-example-ihe-pcd Test`() {
        val json = readFile("patient-example-ihe-pcd.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("ihe-pcd", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
    }
}

class patient_example_jsonTest : DataTests() {
    @Test
    fun `patient-example Test`() {
        val json = readFile("patient-example.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
    }
}

class patient_example_proband_jsonTest : DataTests() {
    @Test
    fun `patient-example-proband Test`() {
        val json = readFile("patient-example-proband.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("proband", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("female", obj.gender))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
    }
}

class patient_example_f201_roel_jsonTest : DataTests() {
    @Test
    fun `patient-example-f201-roel Test`() {
        val json = readFile("patient-example-f201-roel.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
        assertEquals(false, if (obj.multipleBirthBoolean != null) obj.multipleBirthBoolean else false, "Field: multipleBirthBoolean")
    }
}

class patient_example_xcda_jsonTest : DataTests() {
    @Test
    fun `patient-example-xcda Test`() {
        val json = readFile("patient-example-xcda.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("xcda", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class patient_example_a_jsonTest : DataTests() {
    @Test
    fun `patient-example-a Test`() {
        val json = readFile("patient-example-a.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat1", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class patient_example_dicom_jsonTest : DataTests() {
    @Test
    fun `patient-example-dicom Test`() {
        val json = readFile("patient-example-dicom.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("dicom", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class patient_example_animal_jsonTest : DataTests() {
    @Test
    fun `patient-example-animal Test`() {
        val json = readFile("patient-example-animal.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("animal", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("female", obj.gender))
    }
}

class patient_example_chinese_jsonTest : DataTests() {
    @Test
    fun `patient-example-chinese Test`() {
        val json = readFile("patient-example-chinese.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("ch-example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: deceasedBoolean")
    }
}

class patient_glossy_example_jsonTest : DataTests() {
    @Test
    fun `patient-glossy-example Test`() {
        val json = readFile("patient-glossy-example.json")
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("glossy", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}
