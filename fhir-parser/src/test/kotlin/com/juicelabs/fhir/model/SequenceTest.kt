package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class sequence_graphic_example_1_jsonTest : DataTests() {
    @Test
    fun `sequence-graphic-example-1 Test`() {
        val json = readFile("sequence-graphic-example-1.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-1", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_example_fda_vcfeval_jsonTest : DataTests() {
    @Test
    fun `sequence-example-fda-vcfeval Test`() {
        val json = readFile("sequence-example-fda-vcfeval.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-vcfeval-comparison", obj.id))
    }
}

class sequence_example_TPMT_one_jsonTest : DataTests() {
    @Test
    fun `sequence-example-TPMT-one Test`() {
        val json = readFile("sequence-example-TPMT-one.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-one", obj.id))
        assertTrue(stringMatch("dna", obj.type))
        assertTrue(stringMatch("T-C-C-C-A-C-C-C", obj.observedSeq))
    }
}

class sequence_example_pgx_2_jsonTest : DataTests() {
    @Test
    fun `sequence-example-pgx-2 Test`() {
        val json = readFile("sequence-example-pgx-2.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-pgx-2", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_example_jsonTest : DataTests() {
    @Test
    fun `sequence-example Test`() {
        val json = readFile("sequence-example.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_example_fda_jsonTest : DataTests() {
    @Test
    fun `sequence-example-fda Test`() {
        val json = readFile("sequence-example-fda.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-example", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class coord_1base_example_jsonTest : DataTests() {
    @Test
    fun `coord-1base-example Test`() {
        val json = readFile("coord-1base-example.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("coord-1-base", obj.id))
        assertTrue(stringMatch("dna", obj.type))
        assertTrue(stringMatch("ACATGGTAGC", obj.observedSeq))
    }
}

class sequence_graphic_example_4_jsonTest : DataTests() {
    @Test
    fun `sequence-graphic-example-4 Test`() {
        val json = readFile("sequence-graphic-example-4.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-4", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_graphic_example_5_jsonTest : DataTests() {
    @Test
    fun `sequence-graphic-example-5 Test`() {
        val json = readFile("sequence-graphic-example-5.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-5", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_example_TPMT_two_jsonTest : DataTests() {
    @Test
    fun `sequence-example-TPMT-two Test`() {
        val json = readFile("sequence-example-TPMT-two.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-two", obj.id))
        assertTrue(stringMatch("dna", obj.type))
        assertTrue(stringMatch("T-C-T-C-G-C-C-C", obj.observedSeq))
    }
}

class sequence_example_pgx_1_jsonTest : DataTests() {
    @Test
    fun `sequence-example-pgx-1 Test`() {
        val json = readFile("sequence-example-pgx-1.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-pgx-1", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_example_fda_comparisons_jsonTest : DataTests() {
    @Test
    fun `sequence-example-fda-comparisons Test`() {
        val json = readFile("sequence-example-fda-comparisons.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-vcf-comparison", obj.id))
    }
}

class coord_0base_example_jsonTest : DataTests() {
    @Test
    fun `coord-0base-example Test`() {
        val json = readFile("coord-0base-example.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("coord-0-base", obj.id))
        assertTrue(stringMatch("dna", obj.type))
        assertTrue(stringMatch("ACATGGTAGC", obj.observedSeq))
    }
}

class sequence_graphic_example_2_jsonTest : DataTests() {
    @Test
    fun `sequence-graphic-example-2 Test`() {
        val json = readFile("sequence-graphic-example-2.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-2", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}

class sequence_graphic_example_3_jsonTest : DataTests() {
    @Test
    fun `sequence-graphic-example-3 Test`() {
        val json = readFile("sequence-graphic-example-3.json")
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-3", obj.id))
        assertTrue(stringMatch("dna", obj.type))
    }
}
