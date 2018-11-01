// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@1e1c0e66 on 2018-11-01T09:18:59.771 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Base for elements defined inside a resource
 *
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 */
open class BackboneElement() : Element() {
    val modifierExtension: List<Extension> = mutableListOf<Extension>()
}
