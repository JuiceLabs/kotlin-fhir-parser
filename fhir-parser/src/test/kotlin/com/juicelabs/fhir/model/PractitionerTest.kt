package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class practitioner_example_f203_jvg_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f203-jvg Test`() {
        val json = readFile("practitioner-example-f203-jvg.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_f201_ab_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f201-ab Test`() {
        val json = readFile("practitioner-example-f201-ab.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_f202_lm_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f202-lm Test`() {
        val json = readFile("practitioner-example-f202-lm.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_xcda_author_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-xcda-author Test`() {
        val json = readFile("practitioner-example-xcda-author.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("xcda-author", obj.id))
    }
}

class practitioner_example_f003_mv_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f003-mv Test`() {
        val json = readFile("practitioner-example-f003-mv.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_f002_pv_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f002-pv Test`() {
        val json = readFile("practitioner-example-f002-pv.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_jsonTest : DataTests() {
    @Test
    fun `practitioner-example Test`() {
        val json = readFile("practitioner-example.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: active")
    }
}

class practitioner_example_f007_sh_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f007-sh Test`() {
        val json = readFile("practitioner-example-f007-sh.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f007", obj.id))
        assertTrue(stringMatch("female", obj.gender))
    }
}

class practitioner_example_f204_ce_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f204-ce Test`() {
        val json = readFile("practitioner-example-f204-ce.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("female", obj.gender))
    }
}

class practitioner_example_xcda1_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-xcda1 Test`() {
        val json = readFile("practitioner-example-xcda1.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("xcda1", obj.id))
    }
}

class practitioner_example_f005_al_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f005-al Test`() {
        val json = readFile("practitioner-example-f005-al.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f005", obj.id))
        assertTrue(stringMatch("female", obj.gender))
    }
}

class practitioner_example_f004_rb_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f004-rb Test`() {
        val json = readFile("practitioner-example-f004-rb.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f004", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_f006_rvdb_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f006-rvdb Test`() {
        val json = readFile("practitioner-example-f006-rvdb.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f006", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}

class practitioner_example_f001_evdb_jsonTest : DataTests() {
    @Test
    fun `practitioner-example-f001-evdb Test`() {
        val json = readFile("practitioner-example-f001-evdb.json")
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("male", obj.gender))
    }
}
