// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@12209cba on 2018-11-01T09:18:59.896 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Key information to flag to healthcare providers
 *
 * Prospective warnings of potential issues when providing care to the patient.
 */
open class Flag() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | inactive | entered-in-error
     */
    var status: String = ""

    /**
     * Clinical, administrative, etc.
     */
    var category: CodeableConcept? = null

    /**
     * Coded or textual message to display to user
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Who/What is flag about?
     */
    var subject: Reference = Reference()

    /**
     * Time period when flag is active
     */
    var period: Period? = null

    /**
     * Alert relevant during encounter
     */
    var encounter: Reference? = null

    /**
     * Flag creator
     */
    var author: Reference? = null
}
