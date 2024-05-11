package org.juanpla.bancodigital;

import java.util.HashMap;
import java.util.Map;

public class ClienteService {

	public Map<String, Cliente> findAllClients(){
		Map<String, Cliente> result = new HashMap<String, Cliente>();
		result.put("01", new Cliente("01", "João da Silva"));
		result.put("02", new Cliente("02", "Maria da Costa"));
		return result;
		
	}
	
}
