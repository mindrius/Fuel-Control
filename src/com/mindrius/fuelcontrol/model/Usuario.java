package com.mindrius.fuelcontrol.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private String email;
	private String senha;

	private List<Veiculo> veiculos = new ArrayList<Veiculo>();

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public List<Veiculo> getVeiculos() {
		return new ArrayList<Veiculo>(veiculos);
	}

	public void addVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}

}
