package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class searchparameter_example_extension_jsonTest : DataTests() {
    @Test
    fun `searchparameter-example-extension Test`() {
        val json = readFile("searchparameter-example-extension.json")
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example-extension", obj.id))
        assertTrue(stringMatch("Example Search Parameter on ", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Level Seven Internati", obj.publisher))
        assertTrue(stringMatch("part-agree", obj.code))
        assertTrue(stringMatch("reference", obj.type))
        assertTrue(stringMatch("DocumentReference.extension(", obj.expression))
        assertTrue(stringMatch("f:DocumentReference/f:extens", obj.xpath))
        assertTrue(stringMatch("normal", obj.xpathUsage))
    }
}

class searchparameter_example_reference_jsonTest : DataTests() {
    @Test
    fun `searchparameter-example-reference Test`() {
        val json = readFile("searchparameter-example-reference.json")
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example-reference", obj.id))
        assertTrue(stringMatch("Example Search Parameter", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Level Seven Internati", obj.publisher))
        assertTrue(stringMatch("subject", obj.code))
        assertTrue(stringMatch("reference", obj.type))
        assertTrue(stringMatch("Condition.subject", obj.expression))
        assertTrue(stringMatch("normal", obj.xpathUsage))
    }
}

class searchparameter_example_jsonTest : DataTests() {
    @Test
    fun `searchparameter-example Test`() {
        val json = readFile("searchparameter-example.json")
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("1", obj.version))
        assertTrue(stringMatch("ID-SEARCH-PARAMETER", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Health Level Seven Internati", obj.publisher))
        assertTrue(stringMatch("_id", obj.code))
        assertTrue(stringMatch("token", obj.type))
        assertTrue(stringMatch("id", obj.expression))
        assertTrue(stringMatch("f:*/f:id", obj.xpath))
        assertTrue(stringMatch("normal", obj.xpathUsage))
    }
}
