package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class imagingmanifest_example_jsonTest : DataTests() {
    @Test
    fun `imagingmanifest-example Test`() {
        val json = readFile("imagingmanifest-example.json")
        val obj = mapper.fromJson(json, ImagingManifest::class.java)
        assertTrue(stringMatch("ImagingManifest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("1 SC image (screen snapshot)", obj.description))
    }
}
