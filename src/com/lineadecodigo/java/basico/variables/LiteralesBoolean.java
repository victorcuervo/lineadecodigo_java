package com.lineadecodigo.java.basico.variables;

/**
 * @file TiposDatoObjeto.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/literal-booleano-en-java/
 * @description Como manejar para cargar y mostrar un literal booleano en Java
 */

public class LiteralesBoolean {
	
	public static void main(String[] args) {
		
		// Cargando un literal
		Boolean b1 = new Boolean("true");
		System.out.println(b1.booleanValue());
		
		
		// Devolviendo el valor en literal
		boolean b2 = true;
		System.out.println("La variable booleana tiene un valor de : "+b2);
		
		b2 = false;
		System.out.println("La variable booleana tiene un valor de : "+b2);
		
		String sB = b1.toString();
		System.out.println(sB);
		

		
		
	}

}
