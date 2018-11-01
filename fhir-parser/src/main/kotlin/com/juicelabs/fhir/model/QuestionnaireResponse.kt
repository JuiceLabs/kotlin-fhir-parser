package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * A structured set of questions and their answers
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
open class QuestionnaireResponse() : DomainResource() {
    /**
     * Unique id for this set of answers
     */
    var identifier: Identifier? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val parent: List<Reference> = mutableListOf<Reference>()

    /**
     * Form being answered
     */
    var questionnaire: Reference? = null

    /**
     * in-progress | completed | amended | entered-in-error | stopped
     */
    var status: String = ""

    /**
     * The subject of the questions
     */
    var subject: Reference? = null

    /**
     * Encounter or Episode during which questionnaire was completed
     */
    var context: Reference? = null

    /**
     * Date the answers were gathered
     */
    var authored: FhirDate? = null

    /**
     * Person who received and recorded the answers
     */
    var author: Reference? = null

    /**
     * The person who answered the questions
     */
    var source: Reference? = null

    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()
}

/**
 * Groups and questions
 *
 * A group or question item from the original questionnaire for which answers are provided.
 */
open class QuestionnaireResponseItem() : BackboneElement() {
    /**
     * Pointer to specific item from Questionnaire
     */
    var linkId: String = ""

    /**
     * ElementDefinition - details for the item
     */
    var definition: String? = null

    /**
     * Name for group or question text
     */
    var text: String? = null

    /**
     * The subject this group's answers are about
     */
    var subject: Reference? = null

    val answer: List<QuestionnaireResponseItemAnswer> =
            mutableListOf<QuestionnaireResponseItemAnswer>()

    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()
}

/**
 * The response(s) to the question
 *
 * The respondent's answer(s) to the question.
 */
open class QuestionnaireResponseItemAnswer() : BackboneElement() {
    /**
     * Single-valued answer to the question
     */
    var valueBoolean: Boolean? = null

    /**
     * Single-valued answer to the question
     */
    var valueDecimal: Float? = null

    /**
     * Single-valued answer to the question
     */
    var valueInteger: Int? = null

    /**
     * Single-valued answer to the question
     */
    var valueDate: FhirDate? = null

    /**
     * Single-valued answer to the question
     */
    var valueDateTime: FhirDate? = null

    /**
     * Single-valued answer to the question
     */
    var valueTime: FhirDate? = null

    /**
     * Single-valued answer to the question
     */
    var valueString: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueUri: String? = null

    /**
     * Single-valued answer to the question
     */
    var valueAttachment: Attachment? = null

    /**
     * Single-valued answer to the question
     */
    var valueCoding: Coding? = null

    /**
     * Single-valued answer to the question
     */
    var valueQuantity: Quantity? = null

    /**
     * Single-valued answer to the question
     */
    var valueReference: Reference? = null

    val item: List<QuestionnaireResponseItem> = mutableListOf<QuestionnaireResponseItem>()
}
