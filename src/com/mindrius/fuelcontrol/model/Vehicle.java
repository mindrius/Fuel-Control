package com.mindrius.fuelcontrol.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private String alias;
	private List<Fueling> fuelings = new ArrayList<Fueling>();

	public Vehicle(String alias) {
		setAlias(alias);
	}
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void addFueling(Fueling fueling) {
		fuelings.add(fueling);
	}

	public List<Fueling> getFuelings() {
		return new ArrayList<Fueling>(fuelings);
	}
}
