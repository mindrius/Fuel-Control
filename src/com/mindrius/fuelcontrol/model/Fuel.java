package com.mindrius.fuelcontrol.model;

public class Fuel {

	private FuelType gasoline;
	private FuelAmount amout;
	private MonetaryValue currency;

	public Fuel(FuelType gasoline, FuelAmount amount, MonetaryValue currency) {
		this.gasoline = gasoline;
		this.amout = amount;
		this.currency = currency;
	}

	public FuelType getGasoline() {
		return gasoline;
	}

	public FuelAmount getAmount() {
		return amout;
	}

	public MonetaryValue getCurrency() {
		return currency;
	}

}
