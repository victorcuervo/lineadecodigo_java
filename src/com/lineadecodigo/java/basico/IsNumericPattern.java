package com.lineadecodigo.java.basico;

/**
 * @file isNumericPattern.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/marzo/2009
 * @url  http://lineadecodigo.com/2009/03/31/validar-si-un-dato-es-numerico-con-patrones-en-java/
 * @description Valida si una cadena introducida por pantalla es un número mediante patrones
 * 		1.1	Incluido el patrón \\d*
 */

public class IsNumericPattern {

	public static void main(String[] args) {
		
		String cadenaUno = "12345";
		String cadenaDos = "No soy un numero";
	
		
		// Patrón [0-9]*
		if (cadenaUno.matches("[0-9]*"))
			System.out.println("Es un número");
		else
			System.out.println("No es un número");
		
		
		if (cadenaDos.matches("[0-9]*"))
			System.out.println("Es un número");
		else
			System.out.println("No es un número");
		
		// Patrón \d*
		if (cadenaUno.matches("\\d*"))
			System.out.println("Es un número");
		else
			System.out.println("No es un número");
		
		
		if (cadenaDos.matches("\\d*"))
			System.out.println("Es un número");
		else
			System.out.println("No es un número");
		
		
	}

}
