package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class claim_example_institutional_rich_jsonTest : DataTests() {
    @Test
    fun `claim-example-institutional-rich Test`() {
        val json = readFile("claim-example-institutional-rich.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("960151", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_professional_jsonTest : DataTests() {
    @Test
    fun `claim-example-professional Test`() {
        val json = readFile("claim-example-professional.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("860150", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_jsonTest : DataTests() {
    @Test
    fun `claim-example Test`() {
        val json = readFile("claim-example.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100150", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_vision_jsonTest : DataTests() {
    @Test
    fun `claim-example-vision Test`() {
        val json = readFile("claim-example-vision.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("660150", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_vision_glasses_3tier_jsonTest : DataTests() {
    @Test
    fun `claim-example-vision-glasses-3tier Test`() {
        val json = readFile("claim-example-vision-glasses-3tier.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("660152", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_institutional_jsonTest : DataTests() {
    @Test
    fun `claim-example-institutional Test`() {
        val json = readFile("claim-example-institutional.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("960150", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_oral_contained_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-contained Test`() {
        val json = readFile("claim-example-oral-contained.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100152", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_pharmacy_medication_jsonTest : DataTests() {
    @Test
    fun `claim-example-pharmacy-medication Test`() {
        val json = readFile("claim-example-pharmacy-medication.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("760151", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_oral_orthoplan_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-orthoplan Test`() {
        val json = readFile("claim-example-oral-orthoplan.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100153", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("proposed", obj.use))
    }
}

class claim_example_oral_average_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-average Test`() {
        val json = readFile("claim-example-oral-average.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100151", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_vision_glasses_jsonTest : DataTests() {
    @Test
    fun `claim-example-vision-glasses Test`() {
        val json = readFile("claim-example-vision-glasses.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("660151", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_oral_identifier_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-identifier Test`() {
        val json = readFile("claim-example-oral-identifier.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100154", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_pharmacy_jsonTest : DataTests() {
    @Test
    fun `claim-example-pharmacy Test`() {
        val json = readFile("claim-example-pharmacy.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("760150", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_oral_contained_identifier_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-contained-identifier Test`() {
        val json = readFile("claim-example-oral-contained-identifier.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100155", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_oral_bridge_jsonTest : DataTests() {
    @Test
    fun `claim-example-oral-bridge Test`() {
        val json = readFile("claim-example-oral-bridge.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("100156", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}

class claim_example_pharmacy_compound_jsonTest : DataTests() {
    @Test
    fun `claim-example-pharmacy-compound Test`() {
        val json = readFile("claim-example-pharmacy-compound.json")
        val obj = mapper.fromJson(json, Claim::class.java)
        assertTrue(stringMatch("Claim", obj.resourceType))
        assertTrue(stringMatch("760152", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("complete", obj.use))
    }
}
