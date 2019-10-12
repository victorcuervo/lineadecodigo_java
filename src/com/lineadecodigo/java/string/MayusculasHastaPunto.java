package com.lineadecodigo.java.string;

/**
 * @file MayusculasHastaPunto.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date 27/diciembre/2012
 * @url http://lineadecodigo.com/java/string-convertir-cadena-a-mayusculas-hasta-encontrar-un-punto/
 * @description Clase que convierte una cadena a mayúsculas desde el inicio hasta el primer punto
 */

public class MayusculasHastaPunto {

    /**
     * Dada una cadena de caracteres se pasaran todos los caracteres de la misma
     * que esten antes del primero punto.
     * 
     * @param cadena
     *            cadena a modificar
     * @return cadena modificada
     * 
     * @example "linea.de.codigo" -> "LINEA.de.codigo"
     */
	
	
	public static String mayusculasHastaPunto(String cadena) {
	
		int indiceDePunto = cadena.indexOf('.');
		
		if(indiceDePunto < 0)
		    return cadena.toUpperCase();
		
		String inicioHastaPunto = cadena.substring(0, indiceDePunto);
		String restoDespuesDePunto = cadena.substring(indiceDePunto, cadena.length());
		String inicioHastaPuntoConMayus = inicioHastaPunto.toUpperCase();
	
		return inicioHastaPuntoConMayus + restoDespuesDePunto;
	}
	
	public static void main(String[] args){
		System.out.println(mayusculasHastaPunto("línea.de.código"));
	}
	
}