package com.mindrius.fuelcontrol.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class UserTest {

	@Test
	public void testCreateUser() throws Exception {
		Usuario usuario = new Usuario();
		assertNotNull(usuario);
	}

	@Test
	public void testAddVehicle() throws Exception {
		Usuario usuario = new Usuario();

		Veiculo gol = new Veiculo("GOL");
		Veiculo palio = new Veiculo("Palio");

		usuario.addVeiculo(gol);
		usuario.addVeiculo(palio);

		List<Veiculo> veiculos = usuario.getVeiculos();

		assertTrue(veiculos.contains(gol));
		assertTrue(veiculos.contains(palio));
		assertEquals(2, veiculos.size());
	}

	@Test
	public void shouldTheSameVehicleForMultiplesUsers() throws Exception {
		Usuario maria = new Usuario();
		Usuario jose = new Usuario();

		Veiculo gol = new Veiculo("GOL");
		Veiculo palio = new Veiculo("PALIO");

		maria.addVeiculo(gol);
		jose.addVeiculo(gol);

		maria.addVeiculo(palio);
		jose.addVeiculo(palio);

		assertTrue(maria.getVeiculos().equals(jose.getVeiculos()));
	}
}
