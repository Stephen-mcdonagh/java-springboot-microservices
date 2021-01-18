package com.example.microservice.limitsmicroservice.controller;

import com.example.microservice.limitsmicroservice.Config.LimitsConfiguration;
import com.example.microservice.limitsmicroservice.Model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@Autowired
	private LimitsConfiguration limitsConfiguration;

	@GetMapping("/limits")
	public Limits retrieveLimits(){
		return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
	}
}
