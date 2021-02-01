package com.example.microservice.currencyexchangeserrvice.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

	@Getter @Setter @Id
	private Long id;
	@Getter @Setter @Column(name="currency_from")
	private String from;
	@Getter @Setter @Column(name="currency_to")
	private String to;
	@Getter @Setter
	private BigDecimal conversionMultiple;
	@Getter @Setter
	private String environment;

	public CurrencyExchange() {}

	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
}
