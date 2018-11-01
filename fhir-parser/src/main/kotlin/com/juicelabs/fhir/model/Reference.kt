// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@2d37ec5a on 2018-11-01T09:18:59.979 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * A reference from one resource to another
 *
 * A reference from one resource to another.
 */
open class Reference() : Element() {
    /**
     * Literal reference, Relative, internal or absolute URL
     */
    var reference: String? = null

    /**
     * Logical reference, when literal reference is not known
     */
    var identifier: Identifier? = null

    /**
     * Text alternative for the resource
     */
    var display: String? = null
}
