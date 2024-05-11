package org.juanpla.bancodigital;

import java.util.Map;

public class Banco {
	private String nome;
	private Map<String, Cliente> clientes;
	private Map<String, Agencia> agencias;
	
	

	public Map<String, Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(Map<String, Cliente> clientes) {
		this.clientes = clientes;
	}

	public Map<String, Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(Map<String, Agencia> agencias) {
		this.agencias = agencias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
