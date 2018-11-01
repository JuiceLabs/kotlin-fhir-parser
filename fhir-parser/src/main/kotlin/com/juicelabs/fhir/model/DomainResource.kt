package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A resource with narrative, extensions, and contained resources
 *
 * A resource that includes narrative, extensions, and contained resources.
 */
open class DomainResource() : Resource() {
    /**
     * Text summary of the resource, for human interpretation
     */
    var text: Narrative? = null

    val contained: List<Resource> = mutableListOf<Resource>()

    val extension: List<Extension> = mutableListOf<Extension>()

    val modifierExtension: List<Extension> = mutableListOf<Extension>()
}
