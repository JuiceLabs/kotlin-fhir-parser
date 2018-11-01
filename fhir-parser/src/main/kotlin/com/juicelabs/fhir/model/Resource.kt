package com.juicelabs.fhir.model

/**
 * Base Resource
 *
 * This is the base resource type for everything.
 */
open class Resource() : FhirAbstractResource() {
    /**
     * Logical id of this artifact
     */
    var id: String? = null

    /**
     * Metadata about the resource
     */
    var meta: Meta? = null

    /**
     * A set of rules under which this content was created
     */
    var implicitRules: String? = null

    /**
     * Language of the resource content
     */
    var language: String? = null
}