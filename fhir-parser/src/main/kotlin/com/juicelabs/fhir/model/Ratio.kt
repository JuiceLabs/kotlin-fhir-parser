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
