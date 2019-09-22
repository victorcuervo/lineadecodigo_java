package com.lineadecodigo.base;

/**
 * @file Persona.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/julio/2007
 * @url		No Aplica
 * @description Clase de ejemplo que representa a un Usuario
 */

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	private transient String password;

	  public Usuario(String nombre, String password) {
	    this.nombre = nombre;
	    this.password = password;
	  }

	  public String toString() {
	    String pwd = (password == null) ? "(n/a)" : password;
	    return "Información Usuario: \n   Nombre: " + nombre + "\n Contraseña: " + pwd;
	  }

}
