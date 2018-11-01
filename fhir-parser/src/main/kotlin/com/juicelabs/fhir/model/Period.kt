// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@18f3756a on 2018-11-01T09:18:59.834 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * Time range defined by start and end date/time
 *
 * A time period defined by a start and end date and optionally time.
 */
open class Period() : Element() {
    /**
     * Starting time with inclusive boundary
     */
    var start: FhirDate? = null

    /**
     * End time with inclusive boundary, if not ongoing
     */
    var end: FhirDate? = null
}
