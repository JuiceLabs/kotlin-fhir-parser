package com.juicelabs.fhir

class Mappings {
    companion object {
        const val FOO = "foo"

        val reservedMap = mapOf<String, String>(
                "for" to "for_fhir",
                "from" to "from_fhir",
                "class" to "class_fhir",
                "import" to "import_fhir",
                "global" to "global_fhir",
                "assert" to "assert_fhir",
                "except" to "except_fhir",
                "when" to "when_fhir",
                "package" to "package_fhir"
        )

        val classMap = mapOf<String, String>(
                "Any" to "Resource",
                "Practitioner.role" to "PractRole",  // to avoid Practinioner.role and PractitionerRole generating the same class

                "bool" to "Boolean",
                "integer" to "Int",
                "positiveInt" to "Int",
                "unsignedInt" to "Int",
                "date" to "FHIRDate",
                "dateTime" to "FHIRDate",
                "instant" to "FHIRDate",
                "time" to "FHIRDate",
                "decimal" to "Float",

//                "string" to "String",
                "markdown" to "String",
                "id" to "String",
                "code" to "String", // for now we"re not generating enums for these
                "uri" to "String",
                "url" to "String",
                "canonical" to "String",
                "oid" to "String",
                "uuid" to "String",
                "xhtml" to "String",
                "base64Binary" to "String"
        )

        val enumNameMap = mapOf<String, String>(
                "httpto//hl7.org/fhir/contracttermsubtypecodes" to "ContractTermSubtypeCodes",
                "httpto//hl7.org/fhir/coverage-exception" to "CoverageExceptionCodes",
                "httpto//hl7.org/fhir/resource-type-link" to "ResourceTypeLink"
        )

        val jsonmap = mapOf<String, String>(
                "str" to "String",
                "int" to "int",
                "bool" to "bool",
                "float" to "float",
                "FHIRDate" to "String"
        )

        val jsonMapDefault = "dict"

        // Which class names are native to the language (or can be treated this way)
        val natives = listOf<String>( "Int", "Float", "Boolean", "String", "List")

        val defaultValues = mapOf<String, String>(
                "String" to """""""",
                "Boolean" to "false",
                "Int" to "0",
                "Float" to "0.0"
//                "Reference" to "Reference()",
//                "CodeableConcept" to "CodeableConcept()"
        )
    }
}

