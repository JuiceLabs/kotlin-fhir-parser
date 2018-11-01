// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@2c1f43d0 on 2018-11-01T09:19:00.042 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A slot of time on a schedule that may be available for booking appointments
 *
 * A slot of time on a schedule that may be available for booking appointments.
 */
open class Slot() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * A broad categorisation of the service that is to be performed during this appointment
     */
    var serviceCategory: CodeableConcept? = null

    val serviceType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The style of appointment or patient that may be booked in the slot (not service type)
     */
    var appointmentType: CodeableConcept? = null

    /**
     * The schedule resource that this slot defines an interval of status information
     */
    var schedule: Reference = Reference()

    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error
     */
    var status: String = ""

    /**
     * Date/Time that the slot is to begin
     */
    var start: FhirDate = FhirDate.now()

    /**
     * Date/Time that the slot is to conclude
     */
    var end: FhirDate = FhirDate.now()

    /**
     * This slot has already been overbooked, appointments are unlikely to be accepted for this time
     */
    var overbooked: Boolean? = null

    /**
     * Comments on the slot to describe any extended information. Such as custom constraints on the slot
     */
    var comment: String? = null
}
