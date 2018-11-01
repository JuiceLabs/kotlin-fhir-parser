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
