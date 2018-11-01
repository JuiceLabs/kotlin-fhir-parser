package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Contact information
 *
 * Specifies contact information for a person or organization.
 */
open class ContactDetail() : Element() {
    /**
     * Name of an individual to contact
     */
    var name: String? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}
