package com.example.microservice.currencyexchangeserrvice.Model;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class CurrencyExchange {

	@Getter @Setter
	private Long id;
	@Getter @Setter
	private String from;
	@Getter @Setter
	private String to;
	@Getter @Setter
	private BigDecimal conversationMultiple;

	public CurrencyExchange() {}

	public CurrencyExchange(Long id, String from, String to, BigDecimal conversationMultiple) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversationMultiple = conversationMultiple;
	}
}
