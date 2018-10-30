package com.juicelabs.fhir

import java.io.File


open class FhirRenderer(val spec: FhirSpec) {
    fun build() {
        FhirStructureDefinitionRenderer(spec).render()
        copyDefaultClasses()
        TestClassRenderer(spec)
    }

    private fun copyDefaultClasses() {
        File("./src/main/kotlin/com/juicelabs/fhir/model").walk().forEach {
            it.copyTo(File("${spec.directory}/com/juicelabs/fhir/model/${it.name}"), true)
        }
    }
}