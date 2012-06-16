package com.mindrius.fuelcontrol.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UserTest {

	
	
	@Test
	public void testCreateUser() throws Exception {
		User user = new User();
		assertNotNull(user);
	}
	
	@Test
	public void testAddVehicle() throws Exception {
		User user = new User();
		
		Vehicle gol = new Vehicle("GOL");
		Vehicle palio = new Vehicle("Palio");
		
		user.addVehicle(gol);
		user.addVehicle(palio);
		
		List<Vehicle> vehicles = user.getVehicles();
		
		assertTrue(vehicles.contains(gol));
		assertTrue(vehicles.contains(palio));
		assertEquals(2, vehicles.size());
	}
}
