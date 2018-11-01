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
