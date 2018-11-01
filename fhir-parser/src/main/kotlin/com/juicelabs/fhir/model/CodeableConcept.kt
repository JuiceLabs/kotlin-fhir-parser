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