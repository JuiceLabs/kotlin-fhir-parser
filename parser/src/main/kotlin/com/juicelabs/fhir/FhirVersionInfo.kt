package com.juicelabs.fhir

import java.io.File
import java.time.LocalDateTime


class FhirVersionInfo(val spec: FhirSpec, val directory: String) {

    private val now: LocalDateTime
    private val version: String

    init {
        now = LocalDateTime.now()

        version = File("version.info").readText(Charsets.UTF_8)
    }
}
