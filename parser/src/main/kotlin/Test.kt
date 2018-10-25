import com.juicelabs.fhir.FhirRenderer
import com.juicelabs.fhir.FhirSpec
import com.squareup.kotlinpoet.*


fun main(args: Array<String>) {
    val fs = FhirSpec("../parser-lib/src/main/kotlin/model")
    fs.prepare()
    val so = fs.profiles.toSortedMap()

    val render = FhirRenderer(fs)
    render.build()



}
//    File("somefile.txt").printWriter().use { out ->
//
//        out.println("foo")
//        out.println("bar")
//    }
//
//    val foo = Profiles();
//    val json = foo.LoadProfiles("valuesets.json")
//    val parser = JsonParser()
//    val o = parser.parse(json).getAsJsonObject()
//    val e: JsonArray = o.get("entry") as JsonArray
//
//    val l = e.get(0)
//
//    val valueSets: MutableMap<String, JsonElement> = HashMap()
//    val codeSystems: MutableMap<String, JsonElement> = HashMap()
//
//    e.forEach { elem ->
//        val resource = (elem as JsonObject).get("resource") as JsonObject
//        var i = 0
//        val resourceType = resource.get("resourceType").asString
//        val url = resource.get("url").asString
//
//        if (resourceType.contains("ValueSet")) {
//            valueSets.put(url, resource)
//        } else if (resourceType.contains("CodeSystem")) {
//            if (resource.has("content") && resource.has("concept")) {
//                codeSystems.put(url, resource)
//            } else {
//                println("CodeSystem with no concepts: " + url)
//            }
//        }
//    }
//
//    var profiles: MutableList<JsonObject> = ArrayList();
//    var resources: MutableList<JsonElement> = ArrayList();
//
//    arrayOf("profiles-types.json", "profiles-resources.json").forEach { f ->
//        readBundleResources(parser, f).forEach { res ->
//            if (res.asJsonObject.get("resourceType").equals("StructureDefinition")) {
//                resources.add(res)
//            }
//        }
//
//
//    }
//
//    print(".")
//}
//
//private fun readBundleResources(parser: JsonParser, f: String): List<JsonElement> {
//    var profiles: MutableList<JsonElement> = ArrayList()
//
//    val json = parser.parse(readFile(f)).getAsJsonObject()
//
//    if (!json.has("resourceType")) {
//        throw InvalidPropertiesFormatException("No resourceType in " + f)
//    }
//
//    if (!json.get("resourceType").asString.equals("Bundle")) {
//        throw InvalidPropertiesFormatException("Resource type is not Bundle")
//    }
//
//    if (!json.has("entry")) {
//        throw InvalidPropertiesFormatException("No entries in Bundle")
//    }
//
//    json.get("entry").asJsonArray.forEach { elem ->
//        val resource = (elem as JsonObject).get("resource") as JsonObject
//        profiles.add(resource)
//    }
//
//    return profiles
//}
//
//private fun readFile(f: String): String {
//    File(f).reader().use { reader ->
//        return reader.readText()
//    }
//}