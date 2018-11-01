package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class account_example_jsonTest : DataTests() {
    @Test
    fun `account-example Test`() {
        val json = readFile("account-example.json")
        val obj = mapper.fromJson(json, Account::class.java)
        assertTrue(stringMatch("Account", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("HACC Funded Billing for Pete", obj.name))
        assertTrue(stringMatch("Hospital charges", obj.description))
    }
}

class account_example_with_guarantor_jsonTest : DataTests() {
    @Test
    fun `account-example-with-guarantor Test`() {
        val json = readFile("account-example-with-guarantor.json")
        val obj = mapper.fromJson(json, Account::class.java)
        assertTrue(stringMatch("Account", obj.resourceType))
        assertTrue(stringMatch("ewg", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Inpatient: Peter James Chalm", obj.name))
        assertTrue(stringMatch("Hospital charges", obj.description))
    }
}
