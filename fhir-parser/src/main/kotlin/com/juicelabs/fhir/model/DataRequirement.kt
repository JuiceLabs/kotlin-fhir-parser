// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@296decda on 2018-11-01T09:18:59.916 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Describes a required data item
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
open class DataRequirement() : Element() {
    /**
     * The type of the required data
     */
    var type: String = ""

    val profile: List<String> = mutableListOf<String>()

    val mustSupport: List<String> = mutableListOf<String>()

    val codeFilter: List<DataRequirementCodeFilter> = mutableListOf<DataRequirementCodeFilter>()

    val dateFilter: List<DataRequirementDateFilter> = mutableListOf<DataRequirementDateFilter>()
}

/**
 * What codes are expected
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
 */
open class DataRequirementCodeFilter() : Element() {
    /**
     * The code-valued attribute of the filter
     */
    var path: String = ""

    /**
     * Valueset for the filter
     */
    var valueSetString: String? = null

    /**
     * Valueset for the filter
     */
    var valueSetReference: Reference? = null

    val valueCode: List<String> = mutableListOf<String>()

    val valueCoding: List<Coding> = mutableListOf<Coding>()

    val valueCodeableConcept: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * What dates/date ranges are expected
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
 */
open class DataRequirementDateFilter() : Element() {
    /**
     * The date-valued attribute of the filter
     */
    var path: String = ""

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valueDateTime: FhirDate? = null

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valuePeriod: Period? = null

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valueDuration: Duration? = null
}
