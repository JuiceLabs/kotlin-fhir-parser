package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class bodysite_example_fetus_jsonTest : DataTests() {
    @Test
    fun `bodysite-example-fetus Test`() {
        val json = readFile("bodysite-example-fetus.json")
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("fetus", obj.id))
        assertTrue(stringMatch("EDD 1/1/2017 confirmation by", obj.description))
    }
}

class bodysite_example_tumor_jsonTest : DataTests() {
    @Test
    fun `bodysite-example-tumor Test`() {
        val json = readFile("bodysite-example-tumor.json")
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("tumor", obj.id))
        assertTrue(stringMatch("7 cm maximum diameter", obj.description))
    }
}

class bodysite_example_skin_patch_jsonTest : DataTests() {
    @Test
    fun `bodysite-example-skin-patch Test`() {
        val json = readFile("bodysite-example-skin-patch.json")
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("skin-patch", obj.id))
        assertEquals(false, if (obj.active != null) obj.active else false, "Field: active")
        assertTrue(stringMatch("inner surface (volar) of the", obj.description))
    }
}
