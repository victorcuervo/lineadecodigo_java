package com.lineadecodigo.java.basico;

/**
 * @file EsUnDigito.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   30/diciembre/2006
 * @url  http://lineadecodigo.com/java/¿es-ese-caracter-un-numero/
 * @description Valida si una cadena introducida por pantalla es un número
 */

public class EsUnDigito {

	public static void main(String[] args) {
		
		
		if (Character.isDigit('3'))
		    System.out.println("El caracter es un dígito");
		else
		    System.out.println("El caracter NO es un dígito");
		

	}

}
