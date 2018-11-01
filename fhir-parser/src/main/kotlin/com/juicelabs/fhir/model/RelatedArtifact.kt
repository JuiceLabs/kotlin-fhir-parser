// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@548ea06e on 2018-11-01T09:18:59.814 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * Related artifacts for a knowledge resource
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 */
open class RelatedArtifact() : Element() {
    /**
     * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
     */
    var type: String = ""

    /**
     * Brief description of the related artifact
     */
    var display: String? = null

    /**
     * Bibliographic citation for the artifact
     */
    var citation: String? = null

    /**
     * Where the artifact can be accessed
     */
    var url: String? = null

    /**
     * What document is being referenced
     */
    var document: Attachment? = null

    /**
     * What resource is being referenced
     */
    var resource: Reference? = null
}
