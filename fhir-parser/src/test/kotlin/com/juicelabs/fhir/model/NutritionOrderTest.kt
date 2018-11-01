package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class nutritionorder_example_diabeticsupplement_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-diabeticsupplement Test`() {
        val json = readFile("nutritionorder-example-diabeticsupplement.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("diabeticsupplement", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_enteralbolus_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-enteralbolus Test`() {
        val json = readFile("nutritionorder-example-enteralbolus.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("enteralbolus", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_fiberrestricteddiet_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-fiberrestricteddiet Test`() {
        val json = readFile("nutritionorder-example-fiberrestricteddiet.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("fiberrestricteddiet", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_texture_modified_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-texture-modified Test`() {
        val json = readFile("nutritionorder-example-texture-modified.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("texturemodified", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_pureeddiet_simple_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-pureeddiet-simple Test`() {
        val json = readFile("nutritionorder-example-pureeddiet-simple.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("pureeddiet-simple", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_infantenteral_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-infantenteral Test`() {
        val json = readFile("nutritionorder-example-infantenteral.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("infantenteral", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_enteralcontinuous_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-enteralcontinuous Test`() {
        val json = readFile("nutritionorder-example-enteralcontinuous.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("enteralcontinuous", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_cardiacdiet_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-cardiacdiet Test`() {
        val json = readFile("nutritionorder-example-cardiacdiet.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("cardiacdiet", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_pureeddiet_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-pureeddiet Test`() {
        val json = readFile("nutritionorder-example-pureeddiet.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("pureeddiet", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_diabeticdiet_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-diabeticdiet Test`() {
        val json = readFile("nutritionorder-example-diabeticdiet.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("diabeticdiet", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_proteinsupplement_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-proteinsupplement Test`() {
        val json = readFile("nutritionorder-example-proteinsupplement.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("proteinsupplement", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_renaldiet_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-renaldiet Test`() {
        val json = readFile("nutritionorder-example-renaldiet.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("renaldiet", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class nutritionorder_example_energysupplement_jsonTest : DataTests() {
    @Test
    fun `nutritionorder-example-energysupplement Test`() {
        val json = readFile("nutritionorder-example-energysupplement.json")
        val obj = mapper.fromJson(json, NutritionOrder::class.java)
        assertTrue(stringMatch("NutritionOrder", obj.resourceType))
        assertTrue(stringMatch("energysupplement", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}
