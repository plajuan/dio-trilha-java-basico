package org.juanpla.bancodigital;

import java.util.Map;

public class Cliente {
	
	private String id;
	private String nome;
	private Map<String, Conta> contas;

	public Cliente(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Conta> getContas() {
		return contas;
	}

	public void setContas(Map<String, Conta> contas) {
		this.contas = contas;
	}

}
