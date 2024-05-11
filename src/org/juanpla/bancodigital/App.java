package org.juanpla.bancodigital;

import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Banco banco = new Banco();
		BancoService bancoService = new BancoService();
		banco.setNome(bancoService.findBankName());

		AgenciasService agenciasService = new AgenciasService();
		banco.setAgencias(agenciasService.findAllAgencias());

		ClienteService clienteService = new ClienteService();
		banco.setClientes(clienteService.findAllClients());

		ContaService contaService = new ContaService();
		Cliente cliente = new Cliente("01", "José da Silva Sauro");
		cliente.setContas(contaService.findContasByClientId(cliente.getId()));

		System.out.println("## Saldo ##");
		System.out.println("  Cliente: " + cliente.getNome());
		Map<String, Conta> contasCliente = cliente.getContas();
		Set<String> keys = contasCliente.keySet();
		System.out.println("-------SALDO INICIAL---------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}

		// Depositar R$ 50 na conta corrente
		ContaCorrente cc = (ContaCorrente) contasCliente.get("01.01");

		contaService.depositar(50.0, cc);
		System.out.println("--------DEPÓSITO--------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}

		// Sacar R$ 100.0 da conta corrente
		contaService.sacar(100.0, cc);
		System.out.println("-------SAQUE---------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}

		// Transferir R$ 50 para a conta poupança
		ContaPoupanca pp = (ContaPoupanca) contasCliente.get("01.02");
		contaService.transferir(50.0, cc, pp);
		System.out.println("-------TRANSFERÊNCIA---------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}
		// Tentativa de Transferência de R$ 50 para a conta poupança
		contaService.transferir(50.0, cc, pp);
		System.out.println("-------TRANSFERÊNCIA---------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}

		//Transferência de R$ 125 para a conta corrente
		contaService.transferir(125.0, pp, cc);
		System.out.println("-------TRANSFERÊNCIA---------------");
		for (String k : keys) {
			Conta c = contasCliente.get(k);
			System.out.println("    Conta: " + k + " Saldo: " + c.getSaldo());
		}
	}

}
