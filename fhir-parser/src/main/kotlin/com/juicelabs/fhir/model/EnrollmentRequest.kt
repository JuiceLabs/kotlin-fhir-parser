// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@107be3bf on 2018-11-01T09:19:00.059 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Enrollment request
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 */
open class EnrollmentRequest() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Target
     */
    var insurer: Reference? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * The subject of the Products and Services
     */
    var subject: Reference? = null

    /**
     * Insurance information
     */
    var coverage: Reference? = null
}
