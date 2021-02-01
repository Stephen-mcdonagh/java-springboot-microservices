package com.example.microservice.currencyconversionservice.Model;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class CurrencyConversion {

	@Getter @Setter
	private Long id;
	@Getter @Setter
	private String from;
	@Getter @Setter
	private String to;
	@Getter @Setter
	private BigDecimal quantity;
	@Getter @Setter
	private BigDecimal conversionMultiple;
	@Getter @Setter
	private BigDecimal totalCalculatedAmount;
	@Getter @Setter
	private String environment;

	public CurrencyConversion(){}

	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal totalCalculatedAmount, String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.environment = environment;
	}
}
