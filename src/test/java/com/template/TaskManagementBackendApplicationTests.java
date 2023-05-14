package com.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskManagementBackendApplicationTests {

	@Test
	void sampleTest() {
		String testMessage = "hello";
		assertEquals("hello", testMessage);
	}
}
