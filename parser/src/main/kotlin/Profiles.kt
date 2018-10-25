import java.io.File

class Profiles {
    fun LoadProfiles(path: String): String {
        File(path).reader().use{ reader ->
            return reader.readText()
        }
    }
}