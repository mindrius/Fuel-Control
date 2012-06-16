package com.mindrius.fuelcontrol.model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class FuelingTest {
	
	@Test
	public void assertTime(){

		Calendar calendar = Calendar.getInstance();
		
		Fueling fueling = new Fueling(calendar);
		assertEquals(calendar, fueling.getTime());
		
	}

}
