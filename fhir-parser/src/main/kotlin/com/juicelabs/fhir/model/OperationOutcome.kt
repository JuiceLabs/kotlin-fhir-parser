// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@393de8bd on 2018-11-01T09:19:00.005 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Information about the success/failure of an action
 *
 * A collection of error, warning or information messages that result from a system action.
 */
open class OperationOutcome() : DomainResource() {
    val issue: List<OperationOutcomeIssue> = mutableListOf<OperationOutcomeIssue>()
}

/**
 * A single issue associated with the action
 *
 * An error, warning or information message that results from a system action.
 */
open class OperationOutcomeIssue() : BackboneElement() {
    /**
     * fatal | error | warning | information
     */
    var severity: String = ""

    /**
     * Error or warning code
     */
    var code: String = ""

    /**
     * Additional details about the error
     */
    var details: CodeableConcept? = null

    /**
     * Additional diagnostic information about the issue
     */
    var diagnostics: String? = null

    val location: List<String> = mutableListOf<String>()

    val expression: List<String> = mutableListOf<String>()
}
