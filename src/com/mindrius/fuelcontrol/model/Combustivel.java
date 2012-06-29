package com.mindrius.fuelcontrol.model;

public class Combustivel {

	private TipoCombustivel tipoCombustivel;
	private QuantidadeDeCombustivel quantidade;
	private ValorMonetario valorMonetario;

	public Combustivel(TipoCombustivel type, QuantidadeDeCombustivel amount, ValorMonetario valor) {
		this.tipoCombustivel = type;
		this.quantidade = amount;
		this.valorMonetario = valor;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public QuantidadeDeCombustivel getQuantidade() {
		return quantidade;
	}

	public ValorMonetario getValorMonetario() {
		return valorMonetario;
	}

}
