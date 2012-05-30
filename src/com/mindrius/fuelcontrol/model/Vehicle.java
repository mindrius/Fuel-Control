package com.mindrius.fuelcontrol.model;

public class Vehicle {
	private String alias;

	public Vehicle(String alias) {
		setAlias(alias);
	}
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
}
