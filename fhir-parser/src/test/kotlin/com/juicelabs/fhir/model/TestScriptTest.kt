package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class testscript_example_multisystem_jsonTest : DataTests() {
    @Test
    fun `testscript-example-multisystem Test`() {
        val json = readFile("testscript-example-multisystem.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-multisyst", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("testscript-example-multisyst", obj.name))
        assertTrue(stringMatch("Multisystem Test Script", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_history_jsonTest : DataTests() {
    @Test
    fun `testscript-example-history Test`() {
        val json = readFile("testscript-example-history.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-history", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example History", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_update_jsonTest : DataTests() {
    @Test
    fun `testscript-example-update Test`() {
        val json = readFile("testscript-example-update.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-update", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example Update", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_rule_jsonTest : DataTests() {
    @Test
    fun `testscript-example-rule Test`() {
        val json = readFile("testscript-example-rule.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-rule", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_search_jsonTest : DataTests() {
    @Test
    fun `testscript-example-search Test`() {
        val json = readFile("testscript-example-search.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-search", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example Search", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_jsonTest : DataTests() {
    @Test
    fun `testscript-example Test`() {
        val json = readFile("testscript-example.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}

class testscript_example_readtest_jsonTest : DataTests() {
    @Test
    fun `testscript-example-readtest Test`() {
        val json = readFile("testscript-example-readtest.json")
        val obj = mapper.fromJson(json, TestScript::class.java)
        assertTrue(stringMatch("TestScript", obj.resourceType))
        assertTrue(stringMatch("testscript-example-readtest", obj.id))
        assertTrue(stringMatch("1.0", obj.version))
        assertTrue(stringMatch("TestScript Example Read Test", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("HL7", obj.publisher))
    }
}
