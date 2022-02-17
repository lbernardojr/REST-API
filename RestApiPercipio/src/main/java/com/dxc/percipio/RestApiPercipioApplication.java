package com.dxc.percipio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RestApiPercipioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiPercipioApplication.class, args);
		Logger log = LoggerFactory.getLogger(RestApiPercipioApplication.class);
		log.info("Hello world!");
	}

}
