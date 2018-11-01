package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class media_example_jsonTest : DataTests() {
    @Test
    fun `media-example Test`() {
        val json = readFile("media-example.json")
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("photo", obj.type))
    }
}

class media_example_dicom_jsonTest : DataTests() {
    @Test
    fun `media-example-dicom Test`() {
        val json = readFile("media-example-dicom.json")
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("1.2.840.11361907579238403408", obj.id))
        assertTrue(stringMatch("photo", obj.type))
    }
}

class media_example_xray_jsonTest : DataTests() {
    @Test
    fun `media-example-xray Test`() {
        val json = readFile("media-example-xray.json")
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("xray", obj.id))
        assertTrue(stringMatch("photo", obj.type))
    }
}

class media_example_sound_jsonTest : DataTests() {
    @Test
    fun `media-example-sound Test`() {
        val json = readFile("media-example-sound.json")
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("sound", obj.id))
        assertTrue(stringMatch("video", obj.type))
    }
}
