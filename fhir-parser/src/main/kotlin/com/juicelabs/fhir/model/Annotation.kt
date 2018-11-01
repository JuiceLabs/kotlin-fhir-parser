package com.juicelabs.fhir.model

/**
 * Text node with attribution
 *
 * A  text note which also  contains information about who made the statement and when.
 */
open class Annotation() : Element() {
    /**
     * Individual responsible for the annotation
     */
    var authorReference: Reference? = null

    /**
     * Individual responsible for the annotation
     */
    var authorString: String? = null

    /**
     * When the annotation was made
     */
    var time: FhirDate? = null

    /**
     * The annotation  - text content
     */
    var text: String = ""
}