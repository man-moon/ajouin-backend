package com.ajouin.apigateway

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.io.File

@SpringBootTest
class ApiGatewayApplicationTests {

	@Test
	fun verifyApplicationPropertiesFile() {
		val resourceDirectory = File("src/main/resources")
		val applicationProperties = File(resourceDirectory, "application.properties")
		Assertions.assertTrue(applicationProperties.exists(), "application.properties 존재하지 않음")
	}
}
