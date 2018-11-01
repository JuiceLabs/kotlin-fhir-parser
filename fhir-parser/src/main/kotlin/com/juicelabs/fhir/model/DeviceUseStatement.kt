package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Record of use of a device
 *
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 */
open class DeviceUseStatement() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * active | completed | entered-in-error +
     */
    var status: String = ""

    /**
     * Patient using device
     */
    var subject: Reference = Reference()

    /**
     * Period device was used
     */
    var whenUsed: Period? = null

    /**
     * How often  the device was used
     */
    var timingTiming: Timing? = null

    /**
     * How often  the device was used
     */
    var timingPeriod: Period? = null

    /**
     * How often  the device was used
     */
    var timingDateTime: FhirDate? = null

    /**
     * When statement was recorded
     */
    var recordedOn: FhirDate? = null

    /**
     * Who made the statement
     */
    var source: Reference? = null

    /**
     * Reference to device used
     */
    var device: Reference = Reference()

    val indication: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Target body site
     */
    var bodySite: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()
}