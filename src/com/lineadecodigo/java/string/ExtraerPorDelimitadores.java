package com.lineadecodigo.java.string;

import java.util.StringTokenizer;

/**
 * @file ExtraerPorDelimitadores.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   29/mayo/2010
 * @url    http://lineadecodigo.com/java/extraer-contenido-separado-por-delimitadores-con-java/
 * @description Extraer contenido de una cadena de texto atendiendo a un delimitador  
 */

public class ExtraerPorDelimitadores {

	public static void main(String[] args) {

		String sTiempo = "avila#12#24#soleado";	    
	    StringTokenizer st = new StringTokenizer(sTiempo,"#");
	    	   	
	    while (st.hasMoreTokens())
	    	System.out.println (st.nextToken());

	}

}
