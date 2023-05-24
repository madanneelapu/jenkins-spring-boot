package io.madan.practice.jenkinsspringboot;


import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringBootApplication {

	static Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("application main method executed...");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		logger.info("PostConstruct init method executed...");
		logger.info("PostConstruct init method executed TEAM CITY...");
	}

}
