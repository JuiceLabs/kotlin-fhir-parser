package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * System of unique identification
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 */
open class NamingSystem() : DomainResource() {
    /**
     * Name for this naming system (computer friendly)
     */
    var name: String = ""

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * codesystem | identifier | root
     */
    var kind: String = ""

    /**
     * Date this was last changed
     */
    var date: FhirDate = FhirDate.now()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Who maintains system namespace?
     */
    var responsible: String? = null

    /**
     * e.g. driver,  provider,  patient, bank etc.
     */
    var type: CodeableConcept? = null

    /**
     * Natural language description of the naming system
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * How/where is it used
     */
    var usage: String? = null

    val uniqueId: List<NamingSystemUniqueId> = mutableListOf<NamingSystemUniqueId>()

    /**
     * Use this instead
     */
    var replacedBy: Reference? = null
}

/**
 * Unique identifiers used for system
 *
 * Indicates how the system may be identified when referenced in electronic exchange.
 */
open class NamingSystemUniqueId() : BackboneElement() {
    /**
     * oid | uuid | uri | other
     */
    var type: String = ""

    /**
     * The unique identifier
     */
    var value: String = ""

    /**
     * Is this the id that should be used for this type
     */
    var preferred: Boolean? = null

    /**
     * Notes about identifier usage
     */
    var comment: String? = null

    /**
     * When is identifier valid?
     */
    var period: Period? = null
}
