// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@6710eacc on 2018-11-01T09:18:59.978 
//  2018, JuiceLab, LLC
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
