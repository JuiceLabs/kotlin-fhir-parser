// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@4ea97859 on 2018-11-01T09:19:00.026 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 */
open class DeviceMetric() : DomainResource() {
    /**
     * Unique identifier of this DeviceMetric
     */
    var identifier: Identifier = Identifier()

    /**
     * Identity of metric, for example Heart Rate or PEEP Setting
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Unit of Measure for the Metric
     */
    var unit: CodeableConcept? = null

    /**
     * Describes the link to the source Device
     */
    var source: Reference? = null

    /**
     * Describes the link to the parent DeviceComponent
     */
    var parent: Reference? = null

    /**
     * on | off | standby | entered-in-error
     */
    var operationalStatus: String? = null

    /**
     * black | red | green | yellow | blue | magenta | cyan | white
     */
    var color: String? = null

    /**
     * measurement | setting | calculation | unspecified
     */
    var category: String = ""

    /**
     * Describes the measurement repetition time
     */
    var measurementPeriod: Timing? = null

    val calibration: List<DeviceMetricCalibration> = mutableListOf<DeviceMetricCalibration>()
}

/**
 * Describes the calibrations that have been performed or that are required to be performed
 *
 * Describes the calibrations that have been performed or that are required to be performed.
 */
open class DeviceMetricCalibration() : BackboneElement() {
    /**
     * unspecified | offset | gain | two-point
     */
    var type: String? = null

    /**
     * not-calibrated | calibration-required | calibrated | unspecified
     */
    var state: String? = null

    /**
     * Describes the time last calibration has been performed
     */
    var time: FhirDate? = null
}
