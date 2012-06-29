package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;

public class ValorMonetario {

	private BigDecimal valor;
	private Moeda moeda;

	public ValorMonetario(BigDecimal valor, Moeda moeda) {
		this.valor = valor;
		this.moeda = moeda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moeda == null) ? 0 : moeda.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		ValorMonetario other = (ValorMonetario) obj;
		if (moeda != other.moeda)
			return false;

		return valor.compareTo(other.valor) == 0;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Moeda getMoeda() {
		return moeda;
	}
}
