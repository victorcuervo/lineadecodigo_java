package com.lineadecodigo.java.basico.variables;

/**
 * @file TiposDatoObjeto.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/tipo-de-objeto-boolean/
 * @description Operaciones para crear y modificar un objeto boolean
 */

public class TipoDatoBoolean {

	public static void main(String[] args) {
		
		Boolean b1 = new Boolean(true);
	    Boolean b2 = new Boolean("true");

	    System.out.println(b1.booleanValue());
	    System.out.println(b2.booleanValue());
	    
	    // No se pueden hacer comparaciones como con los tipos de datos primitivos
	    if (b1==b2)
	    	System.out.println("Valores Iguales");
	    else
	    	System.out.println("Valores Diferentes");

	    // Hay que hacer comparaciones con el método .equals()
	    if (b1.equals(b2))
	    	System.out.println("Valores Iguales");
	    else
	    	System.out.println("Valores Diferentes");
	    
	}

}
