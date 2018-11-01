package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Base for all elements
 *
 * Base definition for all elements in a resource.
 */
open class Element() {
    /**
     * xml:id (or equivalent in JSON)
     */
    var id: String? = null

    val extension: List<Extension> = mutableListOf<Extension>()
}
