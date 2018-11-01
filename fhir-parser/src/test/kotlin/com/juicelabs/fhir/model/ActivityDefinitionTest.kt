package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class activitydefinition_predecessor_example_jsonTest : DataTests() {
    @Test
    fun `activitydefinition-predecessor-example Test`() {
        val json = readFile("activitydefinition-predecessor-example.json")
        val obj = mapper.fromJson(json, ActivityDefinition::class.java)
        assertTrue(stringMatch("ActivityDefinition", obj.resourceType))
        assertTrue(stringMatch("referralPrimaryCareMentalHea", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("ReferralPrimaryCareMentalHea", obj.name))
        assertTrue(stringMatch("Referral to Primary Care Men", obj.title))
        assertTrue(stringMatch("retired", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Motive Medical Intelligence", obj.publisher))
        assertTrue(stringMatch("This activity definition is ", obj.usage))
        assertTrue(stringMatch("ReferralRequest", obj.kind))
    }
}

class activitydefinition_procedurerequest_example_jsonTest : DataTests() {
    @Test
    fun `activitydefinition-procedurerequest-example Test`() {
        val json = readFile("activitydefinition-procedurerequest-example.json")
        val obj = mapper.fromJson(json, ActivityDefinition::class.java)
        assertTrue(stringMatch("ActivityDefinition", obj.resourceType))
        assertTrue(stringMatch("heart-valve-replacement", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("This activity definition is ", obj.usage))
        assertTrue(stringMatch("ProcedureRequest", obj.kind))
    }
}

class activitydefinition_medicationorder_example_jsonTest : DataTests() {
    @Test
    fun `activitydefinition-medicationorder-example Test`() {
        val json = readFile("activitydefinition-medicationorder-example.json")
        val obj = mapper.fromJson(json, ActivityDefinition::class.java)
        assertTrue(stringMatch("ActivityDefinition", obj.resourceType))
        assertTrue(stringMatch("citalopramPrescription", obj.id))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("CitalopramPrescription", obj.name))
        assertTrue(stringMatch("Citalopram Prescription", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Motive Medical Intelligence", obj.publisher))
        assertTrue(stringMatch("This activity definition is ", obj.usage))
        assertTrue(stringMatch("MedicationRequest", obj.kind))
    }
}

class activitydefinition_example_jsonTest : DataTests() {
    @Test
    fun `activitydefinition-example Test`() {
        val json = readFile("activitydefinition-example.json")
        val obj = mapper.fromJson(json, ActivityDefinition::class.java)
        assertTrue(stringMatch("ActivityDefinition", obj.resourceType))
        assertTrue(stringMatch("referralPrimaryCareMentalHea", obj.id))
        assertTrue(stringMatch("1.1.0", obj.version))
        assertTrue(stringMatch("ReferralPrimaryCareMentalHea", obj.name))
        assertTrue(stringMatch("Referral to Primary Care Men", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: experimental")
        assertTrue(stringMatch("Motive Medical Intelligence", obj.publisher))
        assertTrue(stringMatch("This activity definition is ", obj.usage))
        assertTrue(stringMatch("ReferralRequest", obj.kind))
    }
}

class activitydefinition_supplyrequest_example_jsonTest : DataTests() {
    @Test
    fun `activitydefinition-supplyrequest-example Test`() {
        val json = readFile("activitydefinition-supplyrequest-example.json")
        val obj = mapper.fromJson(json, ActivityDefinition::class.java)
        assertTrue(stringMatch("ActivityDefinition", obj.resourceType))
        assertTrue(stringMatch("blood-tubes-supply", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("This activity definition is ", obj.usage))
        assertTrue(stringMatch("SupplyRequest", obj.kind))
    }
}
