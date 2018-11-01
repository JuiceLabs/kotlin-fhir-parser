package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class procedurerequest_example_lipid_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-lipid Test`() {
        val json = readFile("procedurerequest-example-lipid.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("lipid", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
    }
}

class procedurerequest_example4_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example4 Test`() {
        val json = readFile("procedurerequest-example4.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("benchpress", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
    }
}

class procedurerequest_example_edu_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-edu Test`() {
        val json = readFile("procedurerequest-example-edu.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("education", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_pt_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-pt Test`() {
        val json = readFile("procedurerequest-example-pt.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("physical-therapy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_genetics_example_1_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-genetics-example-1 Test`() {
        val json = readFile("procedurerequest-genetics-example-1.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("og-example1", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
    }
}

class procedurerequest_example_di_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-di Test`() {
        val json = readFile("procedurerequest-example-di.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("di", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
    }
}

class procedurerequest_example_subrequest_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-subrequest Test`() {
        val json = readFile("procedurerequest-example-subrequest.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("subrequest", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("instance-order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
    }
}

class procedurerequest_example2_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example2 Test`() {
        val json = readFile("procedurerequest-example2.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("physiotherapy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example3_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example3 Test`() {
        val json = readFile("procedurerequest-example3.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("do-not-turn", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("stat", obj.priority))
        assertEquals(true, if (obj.doNotPerform != null) obj.doNotPerform else false, "Field: doNotPerform")
    }
}

class procedurerequest_example_ambulation_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-ambulation Test`() {
        val json = readFile("procedurerequest-example-ambulation.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ambulation", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_implant_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-implant Test`() {
        val json = readFile("procedurerequest-example-implant.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example-implant", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_colonoscopy_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-colonoscopy Test`() {
        val json = readFile("procedurerequest-example-colonoscopy.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("colonoscopy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_colonoscopy_bx_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-colonoscopy-bx Test`() {
        val json = readFile("procedurerequest-example-colonoscopy-bx.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("colon-biopsy", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_appendectomy_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-appendectomy Test`() {
        val json = readFile("procedurerequest-example-appendectomy.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("appendectomy-narrative", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example Test`() {
        val json = readFile("procedurerequest-example.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_ft4_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-ft4 Test`() {
        val json = readFile("procedurerequest-example-ft4.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ft4", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("reflex-order", obj.intent))
    }
}

class procedurerequest_example_ob_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-ob Test`() {
        val json = readFile("procedurerequest-example-ob.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ob", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class procedurerequest_example_pgx_jsonTest : DataTests() {
    @Test
    fun `procedurerequest-example-pgx Test`() {
        val json = readFile("procedurerequest-example-pgx.json")
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example-pgx", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
    }
}
