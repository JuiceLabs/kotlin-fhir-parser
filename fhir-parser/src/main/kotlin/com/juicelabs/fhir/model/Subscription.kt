package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A server push subscription criteria
 *
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 */
open class Subscription() : DomainResource() {
    /**
     * requested | active | error | off
     */
    var status: String = ""

    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * When to automatically delete the subscription
     */
    var end: FhirDate? = null

    /**
     * Description of why this subscription was created
     */
    var reason: String = ""

    /**
     * Rule for server push criteria
     */
    var criteria: String = ""

    /**
     * Latest error note
     */
    var error: String? = null

    /**
     * The channel on which to report matches to the criteria
     */
    var channel: SubscriptionChannel = SubscriptionChannel()

    val tag: List<Coding> = mutableListOf<Coding>()
}

/**
 * The channel on which to report matches to the criteria
 *
 * Details where to send notifications when resources are received that meet the criteria.
 */
open class SubscriptionChannel() : BackboneElement() {
    /**
     * rest-hook | websocket | email | sms | message
     */
    var type: String = ""

    /**
     * Where the channel points to
     */
    var endpoint: String? = null

    /**
     * Mimetype to send, or omit for no payload
     */
    var payload: String? = null

    val header: List<String> = mutableListOf<String>()
}