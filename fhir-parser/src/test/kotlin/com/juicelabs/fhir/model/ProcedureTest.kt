package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class procedure_example_f201_tpf_jsonTest : DataTests() {
    @Test
    fun `procedure-example-f201-tpf Test`() {
        val json = readFile("procedure-example-f201-tpf.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_ambulation_jsonTest : DataTests() {
    @Test
    fun `procedure-example-ambulation Test`() {
        val json = readFile("procedure-example-ambulation.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("ambulation", obj.id))
        assertTrue(stringMatch("suspended", obj.status))
        assertEquals(true, if (obj.notDone != null) obj.notDone else false, "Field: notDone")
    }
}

class procedure_example_implant_jsonTest : DataTests() {
    @Test
    fun `procedure-example-implant Test`() {
        val json = readFile("procedure-example-implant.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("example-implant", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_colon_biopsy_jsonTest : DataTests() {
    @Test
    fun `procedure-example-colon-biopsy Test`() {
        val json = readFile("procedure-example-colon-biopsy.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("colon-biopsy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: notDone")
    }
}

class procedure_example_f004_tracheotomy_jsonTest : DataTests() {
    @Test
    fun `procedure-example-f004-tracheotomy Test`() {
        val json = readFile("procedure-example-f004-tracheotomy.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f004", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_education_jsonTest : DataTests() {
    @Test
    fun `procedure-example-education Test`() {
        val json = readFile("procedure-example-education.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("education", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_colonoscopy_jsonTest : DataTests() {
    @Test
    fun `procedure-example-colonoscopy Test`() {
        val json = readFile("procedure-example-colonoscopy.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("colonoscopy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: notDone")
    }
}

class procedure_example_physical_therapy_jsonTest : DataTests() {
    @Test
    fun `procedure-example-physical-therapy Test`() {
        val json = readFile("procedure-example-physical-therapy.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("physical-therapy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_f003_abscess_jsonTest : DataTests() {
    @Test
    fun `procedure-example-f003-abscess Test`() {
        val json = readFile("procedure-example-f003-abscess.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_jsonTest : DataTests() {
    @Test
    fun `procedure-example Test`() {
        val json = readFile("procedure-example.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_appendectomy_narrative_jsonTest : DataTests() {
    @Test
    fun `procedure-example-appendectomy-narrative Test`() {
        val json = readFile("procedure-example-appendectomy-narrative.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("appendectomy-narrative", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_f001_heart_jsonTest : DataTests() {
    @Test
    fun `procedure-example-f001-heart Test`() {
        val json = readFile("procedure-example-f001-heart.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_f002_lung_jsonTest : DataTests() {
    @Test
    fun `procedure-example-f002-lung Test`() {
        val json = readFile("procedure-example-f002-lung.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_biopsy_jsonTest : DataTests() {
    @Test
    fun `procedure-example-biopsy Test`() {
        val json = readFile("procedure-example-biopsy.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("biopsy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class procedure_example_ob_jsonTest : DataTests() {
    @Test
    fun `procedure-example-ob Test`() {
        val json = readFile("procedure-example-ob.json")
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("ob", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}
