// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@2a069b52 on 2018-11-01T09:18:59.824 
//  2018, JuiceLab, LLC
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
