package com.lineadecodigo.base;

/**
 * @file Persona.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   8-julio-2007
 * @url		No Aplica
 * @description Clase de ejemplo que representa a una persona (nombre y edad)
 */


public class Persona {
	
	String nombre;
	int edad;
	
	public Persona(){}
	
	public Persona(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
