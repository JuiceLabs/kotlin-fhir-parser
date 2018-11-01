// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@41eca18f on 2018-11-01T09:18:59.907 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Links records for 'same' item
 *
 * Identifies two or more records (resource instances) that are referring to the same real-world "occurrence".
 */
open class Linkage() : DomainResource() {
    /**
     * Whether this linkage assertion is active or not
     */
    var active: Boolean? = null

    /**
     * Who is responsible for linkages
     */
    var author: Reference? = null

    val item: List<LinkageItem> = mutableListOf<LinkageItem>()
}

/**
 * Item to be linked
 *
 * Identifies one of the records that is considered to refer to the same real-world occurrence as well as how the items hould be evaluated within the collection of linked items.
 */
open class LinkageItem() : BackboneElement() {
    /**
     * source | alternate | historical
     */
    var type: String = ""

    /**
     * Resource being linked
     */
    var resource: Reference = Reference()
}
