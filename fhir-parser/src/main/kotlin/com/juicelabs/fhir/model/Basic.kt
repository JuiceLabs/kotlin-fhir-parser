// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@1d73b109 on 2018-11-01T09:19:00.025 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Resource for non-supported content
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
 */
open class Basic() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Kind of Resource
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Identifies the focus of this resource
     */
    var subject: Reference? = null

    /**
     * When created
     */
    var created: FhirDate? = null

    /**
     * Who created
     */
    var author: Reference? = null
}
