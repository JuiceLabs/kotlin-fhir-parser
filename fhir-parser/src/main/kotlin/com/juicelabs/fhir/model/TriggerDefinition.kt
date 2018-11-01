package com.juicelabs.fhir.model

/**
 * Defines an expected trigger for a module
 *
 * A description of a triggering event.
 */
open class TriggerDefinition() : Element() {
    /**
     * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
     */
    var type: String = ""

    /**
     * Triggering event name
     */
    var eventName: String? = null

    /**
     * Timing of the event
     */
    var eventTimingTiming: Timing? = null

    /**
     * Timing of the event
     */
    var eventTimingReference: Reference? = null

    /**
     * Timing of the event
     */
    var eventTimingDate: FhirDate? = null

    /**
     * Timing of the event
     */
    var eventTimingDateTime: FhirDate? = null

    /**
     * Triggering data of the event
     */
    var eventData: DataRequirement? = null
}
