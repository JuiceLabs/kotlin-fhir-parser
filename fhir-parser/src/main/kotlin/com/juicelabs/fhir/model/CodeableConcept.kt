// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@4e2b1b75 on 2018-11-01T09:19:00.012 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Concept - reference to a terminology or just  text
 *
 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
 */
open class CodeableConcept() : Element() {
    val coding: List<Coding> = mutableListOf<Coding>()

    /**
     * Plain text representation of the concept
     */
    var text: String? = null
}
