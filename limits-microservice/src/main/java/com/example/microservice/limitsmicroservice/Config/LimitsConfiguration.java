package com.example.microservice.limitsmicroservice.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Component
public class LimitsConfiguration {

	@Getter @Setter
	private int minimum;
	@Getter @Setter
	private int maximum;
}
