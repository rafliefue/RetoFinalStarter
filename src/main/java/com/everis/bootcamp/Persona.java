package com.everis.bootcamp;


public class Persona {
	
	//Atributos
	
	private String nombre;
	
	private String apellidos;
	
	private String tipo;
	
	//Contructores
	
	public Persona(String nombre, String apellidos, String tipo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
	}
	
	public Persona(Persona2Builder a) {
		this.nombre = a.nombre;
		this.apellidos = a.apellidos;
		this.tipo = a.tipo;
	}
	
	public Persona() {}
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre; }

	public void setNombre(String nombre) {
		this.nombre = nombre; }

	public String getApellidos() {
		return apellidos; }

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos; }
	
	public String getTipo() {
		return tipo; }

	public void setTipo(String tipo) {
		this.tipo = tipo; }
	
	
	//Builder
	public static class Persona2Builder{
		
		private String nombre;
		
		private String apellidos;
		
		private String tipo;
		
		
		public Persona2Builder(String n, String a, String t) {
			this.nombre = n;
			this.apellidos = a;
			this.tipo = t;
		}
		
		public Persona build() {
			return new Persona(this);
		}
	}
	
}
