package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class chargeitem_example_jsonTest : DataTests() {
    @Test
    fun `chargeitem-example Test`() {
        val json = readFile("chargeitem-example.json")
        val obj = mapper.fromJson(json, ChargeItem::class.java)
        assertTrue(stringMatch("ChargeItem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("billable", obj.status))
        assertTrue(stringMatch("Patient is Cardiologist's go", obj.overrideReason))
    }
}
