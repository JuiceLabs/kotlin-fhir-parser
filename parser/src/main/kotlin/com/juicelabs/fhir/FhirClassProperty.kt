package com.juicelabs.fhir

class FhirClassProperty(element: FhirStructureDefinitionElement, type: FhirElementType, typeName: String? = null) {


    val spec: FhirSpec
    var path: String?
    val typeName: String
    var name: String
    val one_of_many: String?
    val min: Int
    val max: Int
    val origName: String
    val parentName: String
    val className: String
    var moduleName: Nothing?
    var jsonClass: String?
    val shortDesc: String
    val formalDesc: String
//    val isArray: Boolean

//    private var enum: ValueSetEnum

    init {
        spec = element.profile.fhirSpec
        path = element.path
        this.typeName = if (typeName == null)
            if (type.code != null) type.code else "" // todo fix! "" shouldn't happen
        else
            typeName
        name = element.definition.propName ?: ""
        shortDesc = if (element.definition.short != null) element.definition.short.asString else ""
        formalDesc = if (element.definition.formal != null) element.definition.formal.asString else ""

        var n = name
        if (n.contains("[x]")) { // todo mess
            one_of_many = n.replace("[x]", "")
            n = n.replace("[x]",
                    if (this.typeName.contains(".")) this.typeName.substring(0, this.typeName.indexOf(".")) else this.typeName
            )
        } else {
            one_of_many = null
        }
        min = if (element.min != null) element.min else 1
        max = element.max

        origName = n
        name = spec.safePropertyName(n)
        parentName = element.parentName
        className = if (typeName != null) spec.classNameForTypeIfProperty(typeName) ?: "" else "" // todo dear god no
//        enum = if ("code".equals(typeName)) element.enum else null
        moduleName = null // should only be set if it's an external module (think Python)
        jsonClass = if (className != null) spec.jsonClassForClassName(className) else null
//        isNative = if (enumval == null && className != null)  spec.jsonClassForClassName(className) else null
//        isArray = "*".equals(element.max)
//        isSummary = element.isSummary
//        isSummaryMinConflict = element
    }

    fun isList(): Boolean {
        return ((min == 0 && (max == -1 || max > 1)) || (min > 1))
    }

}
