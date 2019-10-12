package com.lineadecodigo.java.string;

/**
 * @file TabularCadena.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/enero/2007
 * @url    http://lineadecodigo.com/java/tabular-cadenas-en-java/
 * @description Tabular cadenas de texto en Java  
 */

public class TabularCadena {
	
	public static void main(String[] args) {
		
		String cadenaSinTabular = "Mi cadena de texto. Mi segunda cadena de texto";
		String cadenaTabulada = "Mi cadena de texto.\tMi segunda cadena de texto";
		
		System.out.println(cadenaSinTabular);
		System.out.println(cadenaTabulada);
		
	}

}
