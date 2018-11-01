// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@55b1d2e on 2018-11-01T09:18:59.836 
//  2018, JuiceLab, LLC
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
