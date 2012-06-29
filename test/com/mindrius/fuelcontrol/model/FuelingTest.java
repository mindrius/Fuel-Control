package com.mindrius.fuelcontrol.model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class FuelingTest {
	
	@Test
	public void assertTime(){

		Calendar calendar = Calendar.getInstance();
		
		Abastecimento abastecimento = new Abastecimento(calendar);
		assertEquals(calendar, abastecimento.getData());
		
	}

}
