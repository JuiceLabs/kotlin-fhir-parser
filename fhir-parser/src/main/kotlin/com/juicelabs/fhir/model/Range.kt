// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@7f8f1b06 on 2018-11-01T09:18:59.901 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * Set of values bounded by low and high
 *
 * A set of ordered Quantities defined by a low and high limit.
 */
open class Range() : Element() {
    /**
     * Low limit
     */
    var low: Quantity? = null

    /**
     * High limit
     */
    var high: Quantity? = null
}
