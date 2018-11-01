// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@106b59c1 on 2018-11-01T09:18:59.861 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Metadata about a resource
 *
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
 */
open class Meta() : Element() {
    /**
     * Version specific identifier
     */
    var versionId: String? = null

    /**
     * When the resource version last changed
     */
    var lastUpdated: FhirDate? = null

    val profile: List<String> = mutableListOf<String>()

    val security: List<Coding> = mutableListOf<Coding>()

    val tag: List<Coding> = mutableListOf<Coding>()
}
