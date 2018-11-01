// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@199af191 on 2018-11-01T09:18:59.968 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * A ratio of two Quantity values - a numerator and a denominator
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 */
open class Ratio() : Element() {
    /**
     * Numerator value
     */
    var numerator: Quantity? = null

    /**
     * Denominator value
     */
    var denominator: Quantity? = null
}
