import com.juicelabs.fhir.FhirRenderer
import com.juicelabs.fhir.FhirSpec
import com.squareup.kotlinpoet.*


fun main(args: Array<String>) {
    val fs = FhirSpec("../parser-lib/src/main/kotlin", "com.juicelabs.fhir.model")
    fs.prepare()
    val so = fs.profiles.toSortedMap()

    val render = FhirRenderer(fs)
    render.build()

}