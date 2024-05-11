package org.juanpla.bancodigital;

public class Agencia {
	private String numero;
	private String nome;
	private String endereco;

	
	public Agencia(String numero, String nome, String endereco) {
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public String getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.numero.equals(obj.toString());
	}

}
