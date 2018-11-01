package com.juicelabs.fhir.model

import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class device_example_software_jsonTest : DataTests() {
    @Test
    fun `device-example-software Test`() {
        val json = readFile("device-example-software.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("software", obj.id))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("10.23-23423", obj.version))
    }
}

class device_example_udi3_jsonTest : DataTests() {
    @Test
    fun `device-example-udi3 Test`() {
        val json = readFile("device-example-udi3.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi3", obj.id))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("LOT123456789012345", obj.lotNumber))
        assertTrue(stringMatch("GlobalMed, Inc", obj.manufacturer))
        assertTrue(stringMatch("Ultra Implantable", obj.model))
    }
}

class device_example_udi2_jsonTest : DataTests() {
    @Test
    fun `device-example-udi2 Test`() {
        val json = readFile("device-example-udi2.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi2", obj.id))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
    }
}

class device_example_f001_feedingtube_jsonTest : DataTests() {
    @Test
    fun `device-example-f001-feedingtube Test`() {
        val json = readFile("device-example-f001-feedingtube.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("active", obj.status))
    }
}

class device_example_pacemaker_jsonTest : DataTests() {
    @Test
    fun `device-example-pacemaker Test`() {
        val json = readFile("device-example-pacemaker.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-pacemaker", obj.id))
        assertTrue(stringMatch("1234-5678", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("PM/Octane 2014", obj.model))
    }
}

class device_example_udi4_jsonTest : DataTests() {
    @Test
    fun `device-example-udi4 Test`() {
        val json = readFile("device-example-udi4.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi4", obj.id))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("RZ12345678", obj.lotNumber))
        assertTrue(stringMatch("GlobalMed, Inc", obj.manufacturer))
    }
}

class device_example_ihe_pcd_jsonTest : DataTests() {
    @Test
    fun `device-example-ihe-pcd Test`() {
        val json = readFile("device-example-ihe-pcd.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("ihe-pcd", obj.id))
        assertTrue(stringMatch("12345", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("A.1.1", obj.model))
    }
}

class device_example_jsonTest : DataTests() {
    @Test
    fun `device-example Test`() {
        val json = readFile("device-example.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("43453424", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("AB 45-J", obj.model))
    }
}

class device_example_udi1_jsonTest : DataTests() {
    @Test
    fun `device-example-udi1 Test`() {
        val json = readFile("device-example-udi1.json")
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi1", obj.id))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("7654321D", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("PM/Octane 2014", obj.model))
    }
}
