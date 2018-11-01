package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class xds_example_jsonTest : DataTests() {
    @Test
    fun `xds-example Test`() {
        val json = readFile("xds-example.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("xds", obj.id))
        assertTrue(stringMatch("transaction", obj.type))
    }
}

class practitioner_examples_general_jsonTest : DataTests() {
    @Test
    fun `practitioner-examples-general Test`() {
        val json = readFile("practitioner-examples-general.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("3ad0687e-f477-468c-afd5-fcc2", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class diagnosticreport_hla_genetics_results_example_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-hla-genetics-results-example Test`() {
        val json = readFile("diagnosticreport-hla-genetics-results-example.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("hla-1", obj.id))
        assertTrue(stringMatch("transaction", obj.type))
    }
}

class practitionerrole_examples_general_jsonTest : DataTests() {
    @Test
    fun `practitionerrole-examples-general Test`() {
        val json = readFile("practitionerrole-examples-general.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("3ad0687e-f477-468c-afd5-fcc2", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class document_example_dischargesummary_jsonTest : DataTests() {
    @Test
    fun `document-example-dischargesummary Test`() {
        val json = readFile("document-example-dischargesummary.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("father", obj.id))
        assertTrue(stringMatch("document", obj.type))
    }
}

class location_examples_general_jsonTest : DataTests() {
    @Test
    fun `location-examples-general Test`() {
        val json = readFile("location-examples-general.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("3ad0687e-f477-468c-afd5-fcc2", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class questionnaire_profile_example_ussg_fht_jsonTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht Test`() {
        val json = readFile("questionnaire-profile-example-ussg-fht.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("ussg-fht", obj.id))
        assertTrue(stringMatch("transaction", obj.type))
    }
}

class endpoint_examples_general_template_jsonTest : DataTests() {
    @Test
    fun `endpoint-examples-general-template Test`() {
        val json = readFile("endpoint-examples-general-template.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("b0a5e4277-83c4-4adb-87e2-e3e", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class patient_examples_cypress_template_jsonTest : DataTests() {
    @Test
    fun `patient-examples-cypress-template Test`() {
        val json = readFile("patient-examples-cypress-template.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("b0a5e4277-83c4-4adb-87e2-e3e", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class bundle_example_jsonTest : DataTests() {
    @Test
    fun `bundle-example Test`() {
        val json = readFile("bundle-example.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("bundle-example", obj.id))
        assertTrue(stringMatch("searchset", obj.type))
    }
}

class diagnosticreport_examples_general_jsonTest : DataTests() {
    @Test
    fun `diagnosticreport-examples-general Test`() {
        val json = readFile("diagnosticreport-examples-general.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("72ac8493-52ac-41bd-8d5d-7258", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}

class patient_examples_general_jsonTest : DataTests() {
    @Test
    fun `patient-examples-general Test`() {
        val json = readFile("patient-examples-general.json")
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("Bundle", obj.resourceType))
        assertTrue(stringMatch("b248b1b2-1686-4b94-9936-37d7", obj.id))
        assertTrue(stringMatch("collection", obj.type))
    }
}
