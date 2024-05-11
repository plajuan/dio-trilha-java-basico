package org.juanpla.bancodigital;

import java.util.HashMap;
import java.util.Map;

public class ContaService implements IConta{
	private Map<String, Conta> contas;
	
	public ContaService() {
		contas = new HashMap<String, Conta>();		
		contas.put("01.01", new ContaCorrente("01.01", 100.0, 10.0));
		contas.put("01.02", new ContaPoupanca("01.02", 200.0));
		contas.put("02.01", new ContaCorrente("02.01", 300.0, 30.0));
		contas.put("02.02", new ContaPoupanca("02.02", 400.0));	
	}
	
	public Map<String, Conta> findAllContas(){
		return contas;
	}
	
	public Map<String, Conta> findContasByClientId(String id){
		Map<String, Conta> res = new HashMap<String, Conta>();
		if (id.equals("01")) {			
			res.put("01.01", contas.get("01.01"));
			res.put("01.02", contas.get("01.02"));
		} else if (id.equals("02")) {
			res.put("02.01", contas.get("02.01"));
			res.put("02.02", contas.get("02.02"));
		}
		return res;
	}
	
	public void transferValue(double value, Conta from, Conta to) {
		
	}

	@Override
	public void transferir(double valor, Conta from, Conta to) {
		boolean temSaldo = sacar(valor, from);
		if (temSaldo) {
			depositar(valor, to);
		}
		
	}
	
	@Override
	public boolean sacar(double valor, Conta conta) {
		double tmp = 0.0;
		boolean temSaldo = conta.temSaldo(valor);
		if (temSaldo) {
			tmp = conta.getSaldo();
			tmp -= valor;
			conta.setSaldo(tmp);
		}
		return temSaldo;
	}

	@Override
	public void depositar(double valor, Conta conta) {
		double tmp = conta.getSaldo();
		tmp += valor;
		conta.setSaldo(tmp);
	}

	@Override
	public void imprimirExtrato(Conta conta) {
		System.out.println(conta);
		
	}
}
