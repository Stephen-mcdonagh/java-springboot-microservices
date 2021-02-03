package com.example.microservice.currencyexchangeserrvice.Controller;

import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("/sample-api")
	@Retry(name="sample-api",fallbackMethod = "MyResponse")
	public String sampleAPI (){
		logger.info("call received");
		ResponseEntity<String> forEntity =  new RestTemplate().getForEntity("http://localhost:8080/URL",String.class);
		return forEntity.getBody();
	}


	private String MyResponse(Exception ex){
		//Playing with fallback if failure on above api fails 5 times
		//Uses best practices for exponential backoff
		logger.info("fallback here");

		return "fallback here";
	}
}
