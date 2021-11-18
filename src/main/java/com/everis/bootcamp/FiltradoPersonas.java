package com.everis.bootcamp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltradoPersonas {
	
	private String tipofiltrado;
	
	public FiltradoPersonas(String tipofiltrado) {
		this.tipofiltrado = tipofiltrado;
	}
	
	public List<Persona> filtrado(String tipo, List<Persona> lista) {
		
		
		
		//Programación funcional del filtrado por empleado o cliente
		return lista.stream().filter(x -> x.getTipo().equals(tipo)).collect(Collectors.toList());
	}

}
