package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class episodeofcare_example_jsonTest : DataTests() {
    @Test
    fun `episodeofcare-example Test`() {
        val json = readFile("episodeofcare-example.json")
        val obj = mapper.fromJson(json, EpisodeOfCare::class.java)
        assertTrue(stringMatch("EpisodeOfCare", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
