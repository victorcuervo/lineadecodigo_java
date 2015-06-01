package com.lineadecodigo.java.string;

/**
 * @file CortarCadenaPorPuntos.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Diciembre 27, 2012
 * @url http://lineadecodigo.com/java/string-cortar-cadena-por-puntos/
 * @description C—digo que nos permite cortar el contenido de una cadena por cada uno de los puntos que la componen.
 */

public class CortarCadenaPorPuntos {

    /**
     * Dada una cadena de caracteres se generaun arreglo de subcadenas donde
     * cada una estaba separada por un punto en la cadena original original.
     * 
     * @param cadena
     *            cadena a separar
     * @return arreglo de subcadenas
     * 
     * @example "linea.de.codigo" -> ["linea"]["de"]["codigo"]
     */
    public static String[] cortarCadenaPorPuntos(String cadena) {
    	String[] s = cadena.split("\\.");
    	return s;
    }

	public static void main(String[] args) {

		String sCadena = "www.lineadecodigo.com";
		String [] arreglo = cortarCadenaPorPuntos(sCadena);
	    for(String s : arreglo) 
	        System.out.println(s);

	}

}
