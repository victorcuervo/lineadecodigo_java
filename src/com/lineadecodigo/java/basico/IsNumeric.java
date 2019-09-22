package com.lineadecodigo.java.basico;

import com.lineadecodigo.java.basico.Comunes;

/**
 * @file isNumeric.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/marzo/2009
 * @url  http://lineadecodigo.com/2006/12/29/validar-si-un-dato-es-numerico-en-java/
 * @description Valida si una cadena introducida por pantalla es un número
 */

public class IsNumeric {

	public static void main(String[] args) {
		
		String cadenaUno = "1234";
		String cadenaDos = "No soy un numero";
	
		
		if (Comunes.isNumeric(cadenaUno))
			System.out.println(cadenaUno + " es un numero");
		else
			System.out.println(cadenaUno + " NO es un numero");
		 
		if (Comunes.isNumeric(cadenaDos))
			System.out.println(cadenaDos + " es un numero");
		else
			System.out.println(cadenaDos + " NO es un numero");

	}

}
