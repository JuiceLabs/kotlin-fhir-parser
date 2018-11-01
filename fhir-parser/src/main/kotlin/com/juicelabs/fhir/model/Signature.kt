package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
 */
open class Signature() : Element() {
    val type: List<Coding> = mutableListOf<Coding>()

    /**
     * When the signature was created
     */
    var when_fhir: FhirDate = FhirDate.now()

    /**
     * Who signed
     */
    var whoUri: String = ""

    /**
     * Who signed
     */
    var whoReference: Reference = Reference()

    /**
     * The party represented
     */
    var onBehalfOfUri: String? = null

    /**
     * The party represented
     */
    var onBehalfOfReference: Reference? = null

    /**
     * The technical format of the signature
     */
    var contentType: String? = null

    /**
     * The actual signature content (XML DigSig. JWT, picture, etc.)
     */
    var blob: String? = null
}
