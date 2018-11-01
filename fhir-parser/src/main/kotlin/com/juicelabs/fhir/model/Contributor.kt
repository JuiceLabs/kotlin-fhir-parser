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