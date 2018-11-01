package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class location_example_jsonTest : DataTests() {
    @Test
    fun `location-example Test`() {
        val json = readFile("location-example.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("South Wing, second floor", obj.name))
        assertTrue(stringMatch("Second floor of the Old Sout", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
    }
}

class location_example_room_jsonTest : DataTests() {
    @Test
    fun `location-example-room Test`() {
        val json = readFile("location-example-room.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("suspended", obj.status))
        assertTrue(stringMatch("South Wing Neuro OR 1", obj.name))
        assertTrue(stringMatch("Old South Wing, Neuro Radiol", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
    }
}

class location_example_ambulance_jsonTest : DataTests() {
    @Test
    fun `location-example-ambulance Test`() {
        val json = readFile("location-example-ambulance.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("amb", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("BUMC Ambulance", obj.name))
        assertTrue(stringMatch("Ambulance provided by Burger", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
    }
}

class location_example_ukpharmacy_jsonTest : DataTests() {
    @Test
    fun `location-example-ukpharmacy Test`() {
        val json = readFile("location-example-ukpharmacy.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("ukp", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("UK Pharmacies", obj.name))
        assertTrue(stringMatch("All Pharmacies in the United", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
    }
}

class location_example_patients_home_jsonTest : DataTests() {
    @Test
    fun `location-example-patients-home Test`() {
        val json = readFile("location-example-patients-home.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("ph", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient's Home", obj.name))
        assertTrue(stringMatch("Patient's Home", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
    }
}

class location_example_hl7hq_jsonTest : DataTests() {
    @Test
    fun `location-example-hl7hq Test`() {
        val json = readFile("location-example-hl7hq.json")
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("hl7", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Health Level Seven Internati", obj.name))
        assertTrue(stringMatch("HL7 Headquarters", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
    }
}
