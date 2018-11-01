// Generated from FHIR com.juicelabs.fhir.FhirStructureDefinition@69ec1210 on 2018-11-01T09:19:00.043 
//  2018, JuiceLab, LLC
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Contributor information
 *
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
 */
open class Contributor() : Element() {
    /**
     * author | editor | reviewer | endorser
     */
    var type: String = ""

    /**
     * Who contributed the content
     */
    var name: String = ""

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()
}
