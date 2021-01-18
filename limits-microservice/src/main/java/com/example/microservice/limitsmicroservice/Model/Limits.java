package com.example.microservice.limitsmicroservice.Model;

import lombok.Getter;
import lombok.Setter;

public class Limits {
	@Getter @Setter
	private int minimum;
	@Getter @Setter
	private int maximum;


	public Limits(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Limits() {
	}
}
