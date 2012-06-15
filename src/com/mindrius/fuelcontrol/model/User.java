package com.mindrius.fuelcontrol.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String email;
	private String hashPassword;
	
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getHashPassword() {
		return hashPassword;
	}
	
	public List<Vehicle> getVehicles() {
		return new ArrayList<Vehicle>(vehicles);
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
}
