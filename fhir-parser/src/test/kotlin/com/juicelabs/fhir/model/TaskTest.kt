package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class task_example6_jsonTest : DataTests() {
    @Test
    fun `task-example6 Test`() {
        val json = readFile("task-example6.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example6", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("Create order for getting spe", obj.description))
    }
}

class task_example1_jsonTest : DataTests() {
    @Test
    fun `task-example1 Test`() {
        val json = readFile("task-example1.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example1", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("Create order for getting spe", obj.description))
    }
}

class task_example3_jsonTest : DataTests() {
    @Test
    fun `task-example3 Test`() {
        val json = readFile("task-example3.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example3", obj.id))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("order", obj.intent))
    }
}

class task_example2_jsonTest : DataTests() {
    @Test
    fun `task-example2 Test`() {
        val json = readFile("task-example2.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example2", obj.id))
        assertTrue(stringMatch("accepted", obj.status))
        assertTrue(stringMatch("filler-order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
    }
}

class task_example5_jsonTest : DataTests() {
    @Test
    fun `task-example5 Test`() {
        val json = readFile("task-example5.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example5", obj.id))
        assertTrue(stringMatch("in-progress", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("Create order for getting spe", obj.description))
    }
}

class task_example4_jsonTest : DataTests() {
    @Test
    fun `task-example4 Test`() {
        val json = readFile("task-example4.json")
        val obj = mapper.fromJson(json, Task::class.java)
        assertTrue(stringMatch("Task", obj.resourceType))
        assertTrue(stringMatch("example4", obj.id))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("filler-order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
    }
}
