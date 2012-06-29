package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;

public class QuantidadeDeCombustivel {

	private UnidadeVolumetrica unidadeVolumetrica;
	private BigDecimal quantidade;

	public QuantidadeDeCombustivel(BigDecimal quantidade, UnidadeVolumetrica unidadeVolumetrica) {
		this.quantidade = quantidade;
		this.unidadeVolumetrica = unidadeVolumetrica;
	}

	public UnidadeVolumetrica getUnidadeVolumetrica() {
		return unidadeVolumetrica;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}
}
