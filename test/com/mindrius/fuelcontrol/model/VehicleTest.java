package com.mindrius.fuelcontrol.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

	private Fueling fueling;
	private Fuel gasoline;
	private Fuel etanol;
	private Calendar time;

	@Before
	public void setUp() {
		time = Calendar.getInstance();
		
		fueling = new Fueling(time);

		FuelAmount gasolineAmount = new FuelAmount(new BigDecimal("10.0"),
				VolumeUnity.LITER);
		MonetaryValue gasolineValue = new MonetaryValue(
				new BigDecimal("2.799"), Currency.BRL);

		FuelAmount etanolAmount = new FuelAmount(new BigDecimal("20.0"),
				VolumeUnity.LITER);
		MonetaryValue etanolValue = new MonetaryValue(
				new BigDecimal("1.699"), Currency.BRL);

		gasoline = new Fuel(FuelType.GASOLINE, gasolineAmount, gasolineValue);
		etanol = new Fuel(FuelType.ETANOL, etanolAmount, etanolValue);
	}

	@Test
	public void shouldCreateAVehicle() throws Exception {
		Vehicle vehicle = new Vehicle("C3");
		assertNotNull(vehicle);
	}

	@Test
	public void shouldAddFuelToAVehicle() throws Exception {
		Vehicle vehicle = new Vehicle("C3");

		fueling.addFuel(gasoline);

		assertEquals(new MonetaryValue(new BigDecimal("27.99"), Currency.BRL),
				fueling.getTotalValue());

		vehicle.addFueling(fueling);
	}

	@Test
	public void shouldAddFuelToAVehicleAgain() throws Exception {
		Vehicle vehicle = new Vehicle("C3");

		fueling.addFuel(gasoline);
		fueling.addFuel(etanol);

		assertEquals(new MonetaryValue(new BigDecimal("61.97"), Currency.BRL),
				fueling.getTotalValue());

		vehicle.addFueling(fueling);
	}

	@Test
	public void shouldProperlyAddAFuelingToAVehicle() throws Exception {
		Vehicle vehicle = new Vehicle("C3");

		fueling.addFuel(gasoline);
		fueling.addFuel(etanol);

		assertEquals(new MonetaryValue(new BigDecimal("61.97"), Currency.BRL),
				fueling.getTotalValue());

		vehicle.addFueling(fueling);

		List<Fueling> ret = vehicle.getFuelings();

		assertTrue(ret.contains(fueling));
		assertEquals(1, ret.size());
	}
	
	@Test
	public void shouldAddFuelTwiceToAVehicle() throws Exception {
		Vehicle vehicle = new Vehicle("C3");

		fueling.addFuel(gasoline);
		
		Fueling fueling2 = new Fueling(Calendar.getInstance());
		
		fueling2.addFuel(etanol);
		
		vehicle.addFueling(fueling);
		vehicle.addFueling(fueling2);
		
		List<Fueling> ret = vehicle.getFuelings();
		
		assertTrue(ret.contains(fueling));
		assertTrue(ret.contains(fueling2));
		
		assertEquals(2, ret.size());	
	}
}
