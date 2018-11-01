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