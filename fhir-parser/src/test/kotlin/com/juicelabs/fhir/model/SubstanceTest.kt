package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class substance_example_silver_nitrate_product_jsonTest : DataTests() {
    @Test
    fun `substance-example-silver-nitrate-product Test`() {
        val json = readFile("substance-example-silver-nitrate-product.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("Solution for silver nitrate ", obj.description))
    }
}

class substance_example_amoxicillin_clavulanate_jsonTest : DataTests() {
    @Test
    fun `substance-example-amoxicillin-clavulanate Test`() {
        val json = readFile("substance-example-amoxicillin-clavulanate.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f205", obj.id))
        assertTrue(stringMatch("Augmentin 875", obj.description))
    }
}

class substance_example_f203_potassium_jsonTest : DataTests() {
    @Test
    fun `substance-example-f203-potassium Test`() {
        val json = readFile("substance-example-f203-potassium.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
    }
}

class substance_example_f201_dust_jsonTest : DataTests() {
    @Test
    fun `substance-example-f201-dust Test`() {
        val json = readFile("substance-example-f201-dust.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
    }
}

class substance_example_jsonTest : DataTests() {
    @Test
    fun `substance-example Test`() {
        val json = readFile("substance-example.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class substance_example_f202_staphylococcus_jsonTest : DataTests() {
    @Test
    fun `substance-example-f202-staphylococcus Test`() {
        val json = readFile("substance-example-f202-staphylococcus.json")
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
    }
}
