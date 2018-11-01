package com.juicelabs.fhir.model

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class medicationexample0307_jsonTest : DataTests() {
    @Test
    fun `medicationexample0307 Test`() {
        val json = readFile("medicationexample0307.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0307", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0311_jsonTest : DataTests() {
    @Test
    fun `medicationexample0311 Test`() {
        val json = readFile("medicationexample0311.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0311", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0310_jsonTest : DataTests() {
    @Test
    fun `medicationexample0310 Test`() {
        val json = readFile("medicationexample0310.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0310", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0306_jsonTest : DataTests() {
    @Test
    fun `medicationexample0306 Test`() {
        val json = readFile("medicationexample0306.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0306", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0301_jsonTest : DataTests() {
    @Test
    fun `medicationexample0301 Test`() {
        val json = readFile("medicationexample0301.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0301", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
        assertEquals(false, if (obj.isOverTheCounter != null) obj.isOverTheCounter else false, "Field: isOverTheCounter")
    }
}

class medicationexample0317_jsonTest : DataTests() {
    @Test
    fun `medicationexample0317 Test`() {
        val json = readFile("medicationexample0317.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0317", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample1_jsonTest : DataTests() {
    @Test
    fun `medicationexample1 Test`() {
        val json = readFile("medicationexample1.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("medicationexample1", obj.id))
    }
}

class medicationexample15_jsonTest : DataTests() {
    @Test
    fun `medicationexample15 Test`() {
        val json = readFile("medicationexample15.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("medexample015", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0321_jsonTest : DataTests() {
    @Test
    fun `medicationexample0321 Test`() {
        val json = readFile("medicationexample0321.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0321", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0320_jsonTest : DataTests() {
    @Test
    fun `medicationexample0320 Test`() {
        val json = readFile("medicationexample0320.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0320", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0316_jsonTest : DataTests() {
    @Test
    fun `medicationexample0316 Test`() {
        val json = readFile("medicationexample0316.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0316", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0315_jsonTest : DataTests() {
    @Test
    fun `medicationexample0315 Test`() {
        val json = readFile("medicationexample0315.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0315", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0303_jsonTest : DataTests() {
    @Test
    fun `medicationexample0303 Test`() {
        val json = readFile("medicationexample0303.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0303", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0319_jsonTest : DataTests() {
    @Test
    fun `medicationexample0319 Test`() {
        val json = readFile("medicationexample0319.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0319", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0318_jsonTest : DataTests() {
    @Test
    fun `medicationexample0318 Test`() {
        val json = readFile("medicationexample0318.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0318", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0302_jsonTest : DataTests() {
    @Test
    fun `medicationexample0302 Test`() {
        val json = readFile("medicationexample0302.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0302", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0314_jsonTest : DataTests() {
    @Test
    fun `medicationexample0314 Test`() {
        val json = readFile("medicationexample0314.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0314", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0309_jsonTest : DataTests() {
    @Test
    fun `medicationexample0309 Test`() {
        val json = readFile("medicationexample0309.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0309", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0313_jsonTest : DataTests() {
    @Test
    fun `medicationexample0313 Test`() {
        val json = readFile("medicationexample0313.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0313", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0305_jsonTest : DataTests() {
    @Test
    fun `medicationexample0305 Test`() {
        val json = readFile("medicationexample0305.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0305", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0304_jsonTest : DataTests() {
    @Test
    fun `medicationexample0304 Test`() {
        val json = readFile("medicationexample0304.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0304", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0312_jsonTest : DataTests() {
    @Test
    fun `medicationexample0312 Test`() {
        val json = readFile("medicationexample0312.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0312", obj.id))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}

class medicationexample0308_jsonTest : DataTests() {
    @Test
    fun `medicationexample0308 Test`() {
        val json = readFile("medicationexample0308.json")
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0308", obj.id))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: isBrand")
    }
}
