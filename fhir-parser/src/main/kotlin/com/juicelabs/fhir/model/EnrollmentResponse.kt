package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * EnrollmentResponse resource
 *
 * This resource provides enrollment and plan details from the processing of an Enrollment resource.
 */
open class EnrollmentResponse() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Claim reference
     */
    var request: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    /**
     * Creation date
     */
    var created: FhirDate? = null

    /**
     * Insurer
     */
    var organization: Reference? = null

    /**
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null
}