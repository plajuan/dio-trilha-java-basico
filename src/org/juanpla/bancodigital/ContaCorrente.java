package org.juanpla.bancodigital;

public class ContaCorrente extends Conta{

	private double limite = 0;
	
	public ContaCorrente(String id, double saldo, double limite) {
		this.id = id;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
