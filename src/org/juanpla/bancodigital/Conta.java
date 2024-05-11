package org.juanpla.bancodigital;

public abstract class Conta {
	String id;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	double saldo;

	public boolean temSaldo(double valor) {
		if (this.saldo - valor >= 0.0) {
			return true;
		}
		return false;
	}

	public boolean temSaldo(double valor, double limite) {
		double saldoComLimite = valor + limite;
		if (saldoComLimite - valor >= 0.0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Conta: " + id + " Saldo: " + saldo;
	}

}
