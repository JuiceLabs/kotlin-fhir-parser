package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class consent_example_notThis_jsonTest : DataTests() {
    @Test
    fun `consent-example-notThis Test`() {
        val json = readFile("consent-example-notThis.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notThis", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_smartonfhir_jsonTest : DataTests() {
    @Test
    fun `consent-example-smartonfhir Test`() {
        val json = readFile("consent-example-smartonfhir.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-smartonfhir", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_notAuthor_jsonTest : DataTests() {
    @Test
    fun `consent-example-notAuthor Test`() {
        val json = readFile("consent-example-notAuthor.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notAuthor", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_notTime_jsonTest : DataTests() {
    @Test
    fun `consent-example-notTime Test`() {
        val json = readFile("consent-example-notTime.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notTime", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_signature_jsonTest : DataTests() {
    @Test
    fun `consent-example-signature Test`() {
        val json = readFile("consent-example-signature.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-signature", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_notThem_jsonTest : DataTests() {
    @Test
    fun `consent-example-notThem Test`() {
        val json = readFile("consent-example-notThem.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notThem", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_grantor_jsonTest : DataTests() {
    @Test
    fun `consent-example-grantor Test`() {
        val json = readFile("consent-example-grantor.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-grantor", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_notOrg_jsonTest : DataTests() {
    @Test
    fun `consent-example-notOrg Test`() {
        val json = readFile("consent-example-notOrg.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notOrg", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_pkb_jsonTest : DataTests() {
    @Test
    fun `consent-example-pkb Test`() {
        val json = readFile("consent-example-pkb.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-pkb", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_jsonTest : DataTests() {
    @Test
    fun `consent-example Test`() {
        val json = readFile("consent-example.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-basic", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_Emergency_jsonTest : DataTests() {
    @Test
    fun `consent-example-Emergency Test`() {
        val json = readFile("consent-example-Emergency.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-Emergency", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class consent_example_Out_jsonTest : DataTests() {
    @Test
    fun `consent-example-Out Test`() {
        val json = readFile("consent-example-Out.json")
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-Out", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
