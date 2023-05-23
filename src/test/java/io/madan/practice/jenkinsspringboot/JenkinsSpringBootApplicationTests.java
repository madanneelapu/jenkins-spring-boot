package io.madan.practice.jenkinsspringboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsSpringBootApplicationTests {

	Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed...");
		logger.info("Test case executed 22222...");
		logger.info("Test case executed 333...");
	}

}
