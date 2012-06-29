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

	private Abastecimento abastecimento;
	private Combustivel gasoline;
	private Combustivel etanol;
	private Calendar time;

	@Before
	public void setUp() {
		time = Calendar.getInstance();

		abastecimento = new Abastecimento(time);

		QuantidadeDeCombustivel gasolineAmount = new QuantidadeDeCombustivel(new BigDecimal("10.0"),
				UnidadeVolumetrica.LITRO);
		ValorMonetario gasolineValue = new ValorMonetario(new BigDecimal("2.799"), Moeda.BRL);

		QuantidadeDeCombustivel etanolAmount = new QuantidadeDeCombustivel(new BigDecimal("20.0"),
				UnidadeVolumetrica.LITRO);
		ValorMonetario etanolValue = new ValorMonetario(new BigDecimal("1.699"), Moeda.BRL);

		gasoline = new Combustivel(TipoCombustivel.GASOLINA, gasolineAmount, gasolineValue);
		etanol = new Combustivel(TipoCombustivel.ETANOL, etanolAmount, etanolValue);
	}

	@Test
	public void shouldCreateAVehicle() throws Exception {
		Veiculo veiculo = new Veiculo("C3");
		assertNotNull(veiculo);
	}

	@Test
	public void shouldAddFuelToAVehicle() throws Exception {
		Veiculo veiculo = new Veiculo("C3");

		abastecimento.addCombustivel(gasoline);

		assertEquals(new ValorMonetario(new BigDecimal("27.99"), Moeda.BRL), abastecimento.getValorTotal());

		veiculo.addAbastecimento(abastecimento);
	}

	@Test
	public void shouldAddFuelToAVehicleAgain() throws Exception {
		Veiculo veiculo = new Veiculo("C3");

		abastecimento.addCombustivel(gasoline);
		abastecimento.addCombustivel(etanol);

		assertEquals(new ValorMonetario(new BigDecimal("61.97"), Moeda.BRL), abastecimento.getValorTotal());

		veiculo.addAbastecimento(abastecimento);
	}

	@Test
	public void shouldProperlyAddAFuelingToAVehicle() throws Exception {
		Veiculo veiculo = new Veiculo("C3");

		abastecimento.addCombustivel(gasoline);
		abastecimento.addCombustivel(etanol);

		assertEquals(new ValorMonetario(new BigDecimal("61.97"), Moeda.BRL), abastecimento.getValorTotal());

		veiculo.addAbastecimento(abastecimento);

		List<Abastecimento> ret = veiculo.getAbastecimentos();

		assertTrue(ret.contains(abastecimento));
		assertEquals(1, ret.size());
	}

	@Test
	public void shouldAddFuelTwiceToAVehicle() throws Exception {
		Veiculo veiculo = new Veiculo("C3");

		abastecimento.addCombustivel(gasoline);

		Abastecimento fueling2 = new Abastecimento(Calendar.getInstance());

		fueling2.addCombustivel(etanol);

		veiculo.addAbastecimento(abastecimento);
		veiculo.addAbastecimento(fueling2);

		List<Abastecimento> ret = veiculo.getAbastecimentos();

		assertTrue(ret.contains(abastecimento));
		assertTrue(ret.contains(fueling2));

		assertEquals(2, ret.size());
	}
}
