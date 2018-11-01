package com.juicelabs.fhir.model

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import kotlin.Boolean
import kotlin.String

open class DataTests {
    val mapper: Gson

    val builder: GsonBuilder

    init {
        builder = GsonBuilder()
        builder.registerTypeAdapter(FhirDate::class.java, FhirDateSerializer())
        builder.registerTypeAdapter(FhirDate::class.java, FhirDateDeSerializer())
        mapper = builder.create()
    }

    fun stringMatch(str: String, actual: String?): Boolean = if (actual.isNullOrBlank()) true else actual!!.startsWith(str) 

    fun readFile(fileName: String): String {
        File("sample_data/" + fileName).reader().use { reader ->
        return reader.readText()
        }
    }
}
