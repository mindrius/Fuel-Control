package com.mindrius.fuelcontrol.model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	private String nome;
	private List<Abastecimento> abastecimentos = new ArrayList<Abastecimento>();

	public Veiculo(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addAbastecimento(Abastecimento abastecimento) {
		abastecimentos.add(abastecimento);
	}

	public List<Abastecimento> getAbastecimentos() {
		return new ArrayList<Abastecimento>(abastecimentos);
	}
}
