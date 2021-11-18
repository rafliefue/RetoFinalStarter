package com.everis.bootcamp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("filtradopersonas.filtrado")
public class FiltradoPersonasProperties {

	private String tipofiltrado = "cliente";
	
	private List<Persona> personas = new ArrayList<>();
	
	public String getTipoFiltrado() {
		return tipofiltrado;
	}
	
	public List<Persona> getListaPersonas(){
		return personas;
	}
	
	public void setTipoFiltrado(String tipofiltrado) {
		this.tipofiltrado = tipofiltrado;
	}

	public void setListaPersonas(List<Persona> personas) {
		this.personas = personas;
	}
}
