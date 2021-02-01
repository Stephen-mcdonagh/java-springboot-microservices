package com.example.microservice.currencyexchangeserrvice.Repository;

import com.example.microservice.currencyexchangeserrvice.Model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

	CurrencyExchange findByFromAndTo(String from, String to);
}
