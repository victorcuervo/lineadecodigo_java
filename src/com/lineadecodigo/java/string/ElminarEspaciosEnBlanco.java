package com.lineadecodigo.java.string;

/**
 * @file EliminarEspaciosEnBlanco.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7/octubre/2007
 * @url    http://lineadecodigo.com/java/eliminar-espacios-en-blanco-con-java/
 * @description Dos formas de eliminar espacios en blanco de una cadena.  
 */

import java.util.StringTokenizer;

public class ElminarEspaciosEnBlanco {

	public static void main(String[] args) {

		// Cadena de texto
	    String sTexto = "En un lugar de la mancha";

	    // Cadena de texto sin blancos
	    String sCadenaSinBlancos = "";

	    // 1. Ser�a recorrer la cadena y si es blanco no
	    // a�adirlo a la nueva cadena
	    for (int x=0; x < sTexto.length(); x++) {
	      if (sTexto.charAt(x) != ' ')
	        sCadenaSinBlancos += sTexto.charAt(x);
	    }

	    System.out.println (sCadenaSinBlancos);

	    // 2. Mediante un StringTokenizer cuyos delimitadores sean
	    // espacios en blanco

	    sCadenaSinBlancos = "";

	    StringTokenizer stTexto = new StringTokenizer(sTexto);

	    while (stTexto.hasMoreElements())
	      sCadenaSinBlancos += stTexto.nextElement();

	    System.out.println(sCadenaSinBlancos);		
		
		
	}

}
