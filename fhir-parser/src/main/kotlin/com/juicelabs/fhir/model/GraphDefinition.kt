package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Definition of an graph of resources
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 */
open class GraphDefinition() : DomainResource() {
    /**
     * Logical URI to reference this graph definition (globally unique)
     */
    var url: String? = null

    /**
     * Business version of the graph definition
     */
    var version: String? = null

    /**
     * Name for this graph definition (computer friendly)
     */
    var name: String = ""

    /**
     * draft | active | retired | unknown
     */
    var status: String = ""

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Date this was last changed
     */
    var date: FhirDate? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Natural language description of the graph definition
     */
    var description: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Why this graph definition is defined
     */
    var purpose: String? = null

    /**
     * Type of resource at which the graph starts
     */
    var start: String = ""

    /**
     * Profile on base resource
     */
    var profile: String? = null

    val link: List<GraphDefinitionLink> = mutableListOf<GraphDefinitionLink>()
}

/**
 * Links this graph makes rules about
 *
 * Links this graph makes rules about.
 */
open class GraphDefinitionLink() : BackboneElement() {
    /**
     * Path in the resource that contains the link
     */
    var path: String = ""

    /**
     * Which slice (if profiled)
     */
    var sliceName: String? = null

    /**
     * Minimum occurrences for this link
     */
    var min: Int? = null

    /**
     * Maximum occurrences for this link
     */
    var max: String? = null

    /**
     * Why this link is specified
     */
    var description: String? = null

    val target: List<GraphDefinitionLinkTarget> = mutableListOf<GraphDefinitionLinkTarget>()
}

/**
 * Potential target for the link
 *
 * Potential target for the link.
 */
open class GraphDefinitionLinkTarget() : BackboneElement() {
    /**
     * Type of resource this link refers to
     */
    var type: String = ""

    /**
     * Profile for the target resource
     */
    var profile: String? = null

    val compartment: List<GraphDefinitionLinkTargetCompartment> =
            mutableListOf<GraphDefinitionLinkTargetCompartment>()

    val link: List<GraphDefinitionLink> = mutableListOf<GraphDefinitionLink>()
}

/**
 * Compartment Consistency Rules
 *
 * Compartment Consistency Rules.
 */
open class GraphDefinitionLinkTargetCompartment() : BackboneElement() {
    /**
     * Identifies the compartment
     */
    var code: String = ""

    /**
     * identical | matching | different | custom
     */
    var rule: String = ""

    /**
     * Custom rule, as a FHIRPath expression
     */
    var expression: String? = null

    /**
     * Documentation for FHIRPath expression
     */
    var description: String? = null
}
