package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class observation_example_genetics_1_jsonTest : DataTests() {
    @Test
    fun `observation-example-genetics-1 Test`() {
        val json = readFile("observation-example-genetics-1.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-genetics-1", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_bmd_jsonTest : DataTests() {
    @Test
    fun `observation-example-bmd Test`() {
        val json = readFile("observation-example-bmd.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("bmd", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_respiratory_rate_jsonTest : DataTests() {
    @Test
    fun `observation-example-respiratory-rate Test`() {
        val json = readFile("observation-example-respiratory-rate.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("respiratory-rate", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_jsonTest : DataTests() {
    @Test
    fun `observation-example Test`() {
        val json = readFile("observation-example.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_haplotype2_jsonTest : DataTests() {
    @Test
    fun `observation-example-haplotype2 Test`() {
        val json = readFile("observation-example-haplotype2.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-haplotype2", obj.id))
        assertTrue(stringMatch("unknown", obj.status))
    }
}

class observation_example_mbp_jsonTest : DataTests() {
    @Test
    fun `observation-example-mbp Test`() {
        val json = readFile("observation-example-mbp.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("mbp", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_bmi_jsonTest : DataTests() {
    @Test
    fun `observation-example-bmi Test`() {
        val json = readFile("observation-example-bmi.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("bmi", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_body_height_jsonTest : DataTests() {
    @Test
    fun `observation-example-body-height Test`() {
        val json = readFile("observation-example-body-height.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("body-height", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_eye_color_jsonTest : DataTests() {
    @Test
    fun `observation-example-eye-color Test`() {
        val json = readFile("observation-example-eye-color.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("eye-color", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("blue", obj.valueString))
    }
}

class observation_example_body_temperature_jsonTest : DataTests() {
    @Test
    fun `observation-example-body-temperature Test`() {
        val json = readFile("observation-example-body-temperature.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("body-temperature", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_TPMT_diplotype_jsonTest : DataTests() {
    @Test
    fun `observation-example-TPMT-diplotype Test`() {
        val json = readFile("observation-example-TPMT-diplotype.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-diplotype", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("*1/*4", obj.valueString))
    }
}

class observation_example_f002_excess_jsonTest : DataTests() {
    @Test
    fun `observation-example-f002-excess Test`() {
        val json = readFile("observation-example-f002-excess.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_vitals_panel_jsonTest : DataTests() {
    @Test
    fun `observation-example-vitals-panel Test`() {
        val json = readFile("observation-example-vitals-panel.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("vitals-panel", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_phenotype_jsonTest : DataTests() {
    @Test
    fun `observation-example-phenotype Test`() {
        val json = readFile("observation-example-phenotype.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-phenotype", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_head_circumference_jsonTest : DataTests() {
    @Test
    fun `observation-example-head-circumference Test`() {
        val json = readFile("observation-example-head-circumference.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("head-circumference", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_TPMT_haplotype_two_jsonTest : DataTests() {
    @Test
    fun `observation-example-TPMT-haplotype-two Test`() {
        val json = readFile("observation-example-TPMT-haplotype-two.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-haplotype-two", obj.id))
        assertTrue(stringMatch("unknown", obj.status))
    }
}

class observation_example_f206_staphylococcus_jsonTest : DataTests() {
    @Test
    fun `observation-example-f206-staphylococcus Test`() {
        val json = readFile("observation-example-f206-staphylococcus.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f206", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_bloodpressure_cancel_jsonTest : DataTests() {
    @Test
    fun `observation-example-bloodpressure-cancel Test`() {
        val json = readFile("observation-example-bloodpressure-cancel.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("blood-pressure-cancel", obj.id))
        assertTrue(stringMatch("cancelled", obj.status))
        assertTrue(stringMatch("In this example, the blood p", obj.comment))
    }
}

class observation_example_date_lastmp_jsonTest : DataTests() {
    @Test
    fun `observation-example-date-lastmp Test`() {
        val json = readFile("observation-example-date-lastmp.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("date-lastmp", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_glasgow_jsonTest : DataTests() {
    @Test
    fun `observation-example-glasgow Test`() {
        val json = readFile("observation-example-glasgow.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("glasgow", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_10minute_apgar_score_jsonTest : DataTests() {
    @Test
    fun `observation-example-10minute-apgar-score Test`() {
        val json = readFile("observation-example-10minute-apgar-score.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("10minute-apgar-score", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_satO2_jsonTest : DataTests() {
    @Test
    fun `observation-example-satO2 Test`() {
        val json = readFile("observation-example-satO2.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("satO2", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_glasgow_qa_jsonTest : DataTests() {
    @Test
    fun `observation-example-glasgow-qa Test`() {
        val json = readFile("observation-example-glasgow-qa.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("gcs-qa", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_TPMT_haplotype_one_jsonTest : DataTests() {
    @Test
    fun `observation-example-TPMT-haplotype-one Test`() {
        val json = readFile("observation-example-TPMT-haplotype-one.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-haplotype-one", obj.id))
        assertTrue(stringMatch("unknown", obj.status))
    }
}

class observation_example_f004_erythrocyte_jsonTest : DataTests() {
    @Test
    fun `observation-example-f004-erythrocyte Test`() {
        val json = readFile("observation-example-f004-erythrocyte.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f004", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_genetics_5_jsonTest : DataTests() {
    @Test
    fun `observation-example-genetics-5 Test`() {
        val json = readFile("observation-example-genetics-5.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-genetics-5", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f204_creatinine_jsonTest : DataTests() {
    @Test
    fun `observation-example-f204-creatinine Test`() {
        val json = readFile("observation-example-f204-creatinine.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_genetics_4_jsonTest : DataTests() {
    @Test
    fun `observation-example-genetics-4 Test`() {
        val json = readFile("observation-example-genetics-4.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-genetics-4", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_sample_data_jsonTest : DataTests() {
    @Test
    fun `observation-example-sample-data Test`() {
        val json = readFile("observation-example-sample-data.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("ekg", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f005_hemoglobin_jsonTest : DataTests() {
    @Test
    fun `observation-example-f005-hemoglobin Test`() {
        val json = readFile("observation-example-f005-hemoglobin.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f005", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f003_co2_jsonTest : DataTests() {
    @Test
    fun `observation-example-f003-co2 Test`() {
        val json = readFile("observation-example-f003-co2.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_1minute_apgar_score_jsonTest : DataTests() {
    @Test
    fun `observation-example-1minute-apgar-score Test`() {
        val json = readFile("observation-example-1minute-apgar-score.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("1minute-apgar-score", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_genetics_3_jsonTest : DataTests() {
    @Test
    fun `observation-example-genetics-3 Test`() {
        val json = readFile("observation-example-genetics-3.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-genetics-3", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("The EGFR p.L858R mutation ha", obj.comment))
    }
}

class observation_example_bloodpressure_jsonTest : DataTests() {
    @Test
    fun `observation-example-bloodpressure Test`() {
        val json = readFile("observation-example-bloodpressure.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("blood-pressure", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_haplotype1_jsonTest : DataTests() {
    @Test
    fun `observation-example-haplotype1 Test`() {
        val json = readFile("observation-example-haplotype1.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-haplotype1", obj.id))
        assertTrue(stringMatch("unknown", obj.status))
    }
}

class observation_example_body_length_jsonTest : DataTests() {
    @Test
    fun `observation-example-body-length Test`() {
        val json = readFile("observation-example-body-length.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("body-length", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_5minute_apgar_score_jsonTest : DataTests() {
    @Test
    fun `observation-example-5minute-apgar-score Test`() {
        val json = readFile("observation-example-5minute-apgar-score.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("5minute-apgar-score", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_diplotype1_jsonTest : DataTests() {
    @Test
    fun `observation-example-diplotype1 Test`() {
        val json = readFile("observation-example-diplotype1.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-diplotype1", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_heart_rate_jsonTest : DataTests() {
    @Test
    fun `observation-example-heart-rate Test`() {
        val json = readFile("observation-example-heart-rate.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("heart-rate", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_bloodpressure_dar_jsonTest : DataTests() {
    @Test
    fun `observation-example-bloodpressure-dar Test`() {
        val json = readFile("observation-example-bloodpressure-dar.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("blood-pressure-dar", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f202_temperature_jsonTest : DataTests() {
    @Test
    fun `observation-example-f202-temperature Test`() {
        val json = readFile("observation-example-f202-temperature.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("entered-in-error", obj.status))
    }
}

class observation_example_20minute_apgar_score_jsonTest : DataTests() {
    @Test
    fun `observation-example-20minute-apgar-score Test`() {
        val json = readFile("observation-example-20minute-apgar-score.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("20minute-apgar-score", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f001_glucose_jsonTest : DataTests() {
    @Test
    fun `observation-example-f001-glucose Test`() {
        val json = readFile("observation-example-f001-glucose.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f203_bicarbonate_jsonTest : DataTests() {
    @Test
    fun `observation-example-f203-bicarbonate Test`() {
        val json = readFile("observation-example-f203-bicarbonate.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_unsat_jsonTest : DataTests() {
    @Test
    fun `observation-example-unsat Test`() {
        val json = readFile("observation-example-unsat.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("unsat", obj.id))
        assertTrue(stringMatch("cancelled", obj.status))
        assertTrue(stringMatch("Tube broken in transit and s", obj.comment))
    }
}

class observation_example_2minute_apgar_score_jsonTest : DataTests() {
    @Test
    fun `observation-example-2minute-apgar-score Test`() {
        val json = readFile("observation-example-2minute-apgar-score.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("2minute-apgar-score", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_genetics_2_jsonTest : DataTests() {
    @Test
    fun `observation-example-genetics-2 Test`() {
        val json = readFile("observation-example-genetics-2.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("example-genetics-2", obj.id))
        assertTrue(stringMatch("final", obj.status))
    }
}

class observation_example_f205_egfr_jsonTest : DataTests() {
    @Test
    fun `observation-example-f205-egfr Test`() {
        val json = readFile("observation-example-f205-egfr.json")
        val obj = mapper.fromJson(json, Observation::class.java)
        assertTrue(stringMatch("Observation", obj.resourceType))
        assertTrue(stringMatch("f205", obj.id))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("GFR estimating equations dev", obj.comment))
    }
}
