package com.bolsaideas.springboot.web.app.shared.domain;

public class Nombre {

	private final String nombre;
	
	public Nombre(String value) {
		
		try {
			
			this.nombre = value;
			 if (nombre.matches("[A-Z][a-z]*")) {
			      throw new RuntimeException("Nombre ingresado no valido");
			}
		}
		
		catch (NullPointerException e) {
			throw new RuntimeException("Nombre ingresado no valido");
		}
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
