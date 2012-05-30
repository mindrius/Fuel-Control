package com.mindrius.fuelcontrol.model;

import java.util.Calendar;

public class Fuel {

	private Double amount;
	private Double pricePerLiter;
	private Calendar time;
	private FuelType type;

	public Double getAmount() {
		return amount;
	}

	public Double getPricePerLiter() {
		return pricePerLiter;
	}

	public Calendar getTime() {
		return time;
	}

	public FuelType getType() {
		return type;
	}
}
