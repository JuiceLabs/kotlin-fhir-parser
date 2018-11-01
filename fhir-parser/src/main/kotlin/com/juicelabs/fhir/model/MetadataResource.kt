// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@2d9af3ca on 2018-11-01T09:18:59.970 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Common Ancestor declaration for definitional resources
 *
 * Common Ancestor declaration for conformance and knowledge artifact resources.
 */
open class MetadataResource() : DomainResource() {
    /**
     * Logical URI to reference this metadata resource (globally unique)
     */
    var url: String? = null

    /**
     * Business version of the metadata resource
     */
    var version: String? = null

    /**
     * Name for this metadata resource (computer friendly)
     */
    var name: String? = null

    /**
     * Name for this metadata resource (human friendly)
     */
    var title: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Natural language description of the metadata resource
     */
    var description: String? = null
}
