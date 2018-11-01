// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@b2f2697 on 2018-11-01T09:18:59.835 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 */
open class AppointmentResponse() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Appointment this response relates to
     */
    var appointment: Reference = Reference()

    /**
     * Time from appointment, or requested new start time
     */
    var start: FhirDate? = null

    /**
     * Time from appointment, or requested new end time
     */
    var end: FhirDate? = null

    val participantType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Person, Location/HealthcareService or Device
     */
    var actor: Reference? = null

    /**
     * accepted | declined | tentative | in-process | completed | needs-action | entered-in-error
     */
    var participantStatus: String = ""

    /**
     * Additional comments
     */
    var comment: String? = null
}
