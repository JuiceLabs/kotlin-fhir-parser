// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@1144183d on 2018-11-01T09:19:00.008 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * Entries in the list
 *
 * Entries in this list.
 */
open class ListEntry() : BackboneElement() {
    /**
     * Status/Workflow information about this item
     */
    var flag: CodeableConcept? = null

    /**
     * If this item is actually marked as deleted
     */
    var deleted: Boolean? = null

    /**
     * When item added to list
     */
    var date: FhirDate? = null

    /**
     * Actual entry
     */
    var item: Reference = Reference()
}
