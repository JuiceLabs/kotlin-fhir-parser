package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class paymentnotice_example_jsonTest : DataTests() {
    @Test
    fun `paymentnotice-example Test`() {
        val json = readFile("paymentnotice-example.json")
        val obj = mapper.fromJson(json, PaymentNotice::class.java)
        assertTrue(stringMatch("PaymentNotice", obj.resourceType))
        assertTrue(stringMatch("77654", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
