package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class pcd_example_notOrg_jsonTest : DataTests() {
    @Test
    fun `pcd-example-notOrg Test`() {
        val json = readFile("pcd-example-notOrg.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notOrg", obj.id))
    }
}

class contract_example_42cfr_part2_jsonTest : DataTests() {
    @Test
    fun `contract-example-42cfr-part2 Test`() {
        val json = readFile("contract-example-42cfr-part2.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("C-2121", obj.id))
    }
}

class pcd_example_notLabs_jsonTest : DataTests() {
    @Test
    fun `pcd-example-notLabs Test`() {
        val json = readFile("pcd-example-notLabs.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notLabs", obj.id))
    }
}

class pcd_example_notThem_jsonTest : DataTests() {
    @Test
    fun `pcd-example-notThem Test`() {
        val json = readFile("pcd-example-notThem.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notThem", obj.id))
    }
}

class pcd_example_notAuthor_jsonTest : DataTests() {
    @Test
    fun `pcd-example-notAuthor Test`() {
        val json = readFile("pcd-example-notAuthor.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notAuthor", obj.id))
    }
}

class contract_example_jsonTest : DataTests() {
    @Test
    fun `contract-example Test`() {
        val json = readFile("contract-example.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("C-123", obj.id))
    }
}

class pcd_example_notThis_jsonTest : DataTests() {
    @Test
    fun `pcd-example-notThis Test`() {
        val json = readFile("pcd-example-notThis.json")
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notThis", obj.id))
    }
}
