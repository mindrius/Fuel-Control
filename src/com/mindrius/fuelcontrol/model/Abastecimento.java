package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Abastecimento {

	private Calendar data;
	private Set<Combustivel> combustiveis = new HashSet<Combustivel>();

	public Abastecimento(Calendar data) {
		this.data = data;
	}

	public Calendar getData() {
		return data;
	}

	public void addCombustivel(Combustivel combustivel) {
		this.combustiveis.add(combustivel);
	}

	public ValorMonetario getValorTotal() {

		if (combustiveis.isEmpty())
			throw new IllegalStateException("Combustivel vazio");

		BigDecimal soma = new BigDecimal("0");

		for (Combustivel combustivel : combustiveis) {
			BigDecimal valor = combustivel.getValorMonetario().getValor();
			BigDecimal quantidade = combustivel.getQuantidade().getQuantidade();
			soma = soma.add(quantidade.multiply(valor));
		}

		System.out.println("sum: " + soma.toString());
		return new ValorMonetario(soma, Moeda.BRL);
	}
}
