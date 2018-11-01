package com.juicelabs.fhir.model

/**
 * A measured or measurable amount
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 */
open class Quantity() : Element() {
    /**
     * Numerical value (with implicit precision)
     */
    var value: Float? = null

    /**
     * < | <= | >= | > - how to understand the value
     */
    var comparator: String? = null

    /**
     * Unit representation
     */
    var unit: String? = null

    /**
     * System that defines coded unit form
     */
    var system: String? = null

    /**
     * Coded form of the unit
     */
    var code: String? = null
}
