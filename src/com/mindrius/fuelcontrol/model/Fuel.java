package com.mindrius.fuelcontrol.model;

public class Fuel {

	private FuelType type;
	private FuelAmount amout;
	private MonetaryValue currency;

	public Fuel(FuelType type, FuelAmount amount, MonetaryValue currency) {
		this.type = type;
		this.amout = amount;
		this.currency = currency;
	}

	public FuelType getType() {
		return type;
	}

	public FuelAmount getAmount() {
		return amout;
	}

	public MonetaryValue getCurrency() {
		return currency;
	}

}
