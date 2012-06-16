package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Fueling {

	private Calendar time;
	private Set<Fuel> fuels = new HashSet<Fuel>();
	
	public Fueling(Calendar time) {
		this.time = time;
	}

	public Calendar getTime() {
		return time;
	}

	public void addFuel(Fuel fuel) {
		this.fuels.add(fuel);
	}

	public MonetaryValue getTotalValue() {

		if (fuels.isEmpty())
			throw new IllegalStateException("Fuel empty ");

		BigDecimal sum = new BigDecimal("0");

		for (Fuel fuel : fuels) {
			BigDecimal value = fuel.getCurrency().getValue();
			BigDecimal amount = fuel.getAmount().getAmount(); 
			sum = sum.add(amount.multiply(value));
		}

		System.out.println("sum: " + sum.toString());
		return new MonetaryValue(sum, Currency.BRL);
	}
}
