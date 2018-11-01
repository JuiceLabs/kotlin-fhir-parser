package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class supplydelivery_example_jsonTest : DataTests() {
    @Test
    fun `supplydelivery-example Test`() {
        val json = readFile("supplydelivery-example.json")
        val obj = mapper.fromJson(json, SupplyDelivery::class.java)
        assertTrue(stringMatch("SupplyDelivery", obj.resourceType))
        assertTrue(stringMatch("simpledelivery", obj.id))
        assertTrue(stringMatch("completed", obj.status))
    }
}

class supplydelivery_example_pumpdelivery_jsonTest : DataTests() {
    @Test
    fun `supplydelivery-example-pumpdelivery Test`() {
        val json = readFile("supplydelivery-example-pumpdelivery.json")
        val obj = mapper.fromJson(json, SupplyDelivery::class.java)
        assertTrue(stringMatch("SupplyDelivery", obj.resourceType))
        assertTrue(stringMatch("pumpdelivery", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
    }
}
