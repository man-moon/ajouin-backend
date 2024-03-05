package com.ajouin.configservice

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import java.io.File

@SpringBootTest
class ConfigServiceApplicationTests {

	@Test
	fun verifyApplicationPropertiesFile() {
		val resourceDirectory = File("src/main/resources")
		val applicationProperties = File(resourceDirectory, "application.properties")
		Assertions.assertTrue(applicationProperties.exists(), "application.properties 존재하지 않음")
	}

	@Test
	fun verifyBootstrapPropertiesFile() {
		val resourceDirectory = File("src/main/resources")
		val bootstrapProperties = File(resourceDirectory, "bootstrap.properties")
		Assertions.assertTrue(bootstrapProperties.exists(), "bootstrap.properties 존재하지 않음")
	}

	@Test
	fun verifyEncryptionKeyFile() {
		val encryptionKey = File("apiEncryptionKey.jks")
		Assertions.assertTrue(encryptionKey.exists(), "apiEncryptionKey.jks 존재하지 않음")
	}

}
