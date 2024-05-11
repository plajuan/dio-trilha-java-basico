package org.juanpla.bancodigital;

public interface IConta {
	
	boolean sacar(double valor, Conta conta);
	
	void depositar(double valor, Conta conta);
	
	void transferir(double valor, Conta from, Conta to);
	
	void imprimirExtrato(Conta conta);
}
