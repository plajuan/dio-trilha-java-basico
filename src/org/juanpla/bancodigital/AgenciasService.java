package org.juanpla.bancodigital;

import java.util.HashMap;
import java.util.Map;

public class AgenciasService {
	private Map<String, Agencia> agencias;
	
	public AgenciasService() {
		agencias = new HashMap<String, Agencia>();
		agencias.put("0001-9", new Agencia("0001-9", "Agência Virtual", "N/A"));
		agencias.put("0002-8", new Agencia("0002-8", "Agência Física", "Rua das Flores"));
	}
	
	public Map<String, Agencia> findAllAgencias(){
		return agencias;
	}
}
