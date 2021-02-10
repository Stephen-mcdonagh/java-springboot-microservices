package com.example.microservice.currencyexchangeserrvice.Controller;

import com.example.microservice.currencyexchangeserrvice.Model.CurrencyExchange;
import com.example.microservice.currencyexchangeserrvice.Repository.CurrencyExchangeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {

	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
		logger.info("retrieveExchangeValue called");

		CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from,to);
		if(currencyExchange == null){
			throw new RuntimeException("CANT FIND DATA FOR "+ from + "and "+ to);
		}
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));


		return currencyExchange;
	}
}
