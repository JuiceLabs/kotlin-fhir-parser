// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@359ca4f4 on 2018-11-01T09:18:59.866 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

/**
 * Describes the context of use for a conformance or knowledge resource
 *
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 */
open class UsageContext() : Element() {
    /**
     * Type of context being specified
     */
    var code: Coding = Coding()

    /**
     * Value that defines the context
     */
    var valueCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Value that defines the context
     */
    var valueQuantity: Quantity = Quantity()

    /**
     * Value that defines the context
     */
    var valueRange: Range = Range()
}
