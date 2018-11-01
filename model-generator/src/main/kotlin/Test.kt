import com.juicelabs.fhir.FhirRenderer
import com.juicelabs.fhir.FhirSpec
import com.juicelabs.fhir.Settings


fun main(args: Array<String>) {
    val fs = FhirSpec(Settings.destinationSrcDir, "com.juicelabs.fhir.model")
    fs.prepare()
    val so = fs.profiles.toSortedMap()

    val render = FhirRenderer(fs)
    render.build()

}