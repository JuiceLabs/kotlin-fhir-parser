package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class paymentreconciliation_example_jsonTest : DataTests() {
    @Test
    fun `paymentreconciliation-example Test`() {
        val json = readFile("paymentreconciliation-example.json")
        val obj = mapper.fromJson(json, PaymentReconciliation::class.java)
        assertTrue(stringMatch("PaymentReconciliation", obj.resourceType))
        assertTrue(stringMatch("ER2500", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014 August mid-month settle", obj.disposition))
    }
}
