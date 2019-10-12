package com.lineadecodigo.java.string;

/**
 * @file ExtraerPorDelimitadoresDinamicos.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   30/mayo/2010
 * @url    http://lineadecodigo.com/java/extraer-contenido-con-delimitadores-dinamicos/
 * @description Extraer contenido de una cadena de texto atendiendo a un delimitador y utilizando el método split.  
 */

public class ExtraerPorDelimitadoresDinamicos {

	public static void main(String[] args) {

		String sCiudades = "#01avila#02madrid#03toledo#04santander";
				
	    String[] items = sCiudades.split("#0[0-9]");
				
	    for (String item: items)
	    	System.out.println(item);	  

	}

}
