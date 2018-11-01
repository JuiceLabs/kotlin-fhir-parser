package com.juicelabs.fhir.model

/**
 * A human-readable formatted text, including images
 *
 * A human-readable formatted text, including images.
 */
open class Narrative() : Element() {
    /**
     * generated | extensions | additional | empty
     */
    var status: String = ""

    /**
     * Limited xhtml content
     */
    var div: String = ""
}
