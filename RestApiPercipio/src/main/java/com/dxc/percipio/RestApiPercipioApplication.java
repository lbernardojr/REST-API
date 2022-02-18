package com.dxc.percipio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class RestApiPercipioApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RestApiPercipioApplication.class);

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		String quote = restTemplate.getForObject("http://localhost:8070", String.class);
		log.info(quote);
		
	}
	
}
