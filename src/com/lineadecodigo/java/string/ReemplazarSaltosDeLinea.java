package com.lineadecodigo.java.string;

/**
 * @file ReemplazarSaltosDeLinea.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Diciembre 27, 2012
 * @url http://lineadecodigo.com/java/string-quitar-saltos-de-linea-de-un-texto-con-java/
 * @description C—digo que elimina los saltos de l’nea que haya en una cadena de texto.
 */

public class ReemplazarSaltosDeLinea {

    /**
     * Dada una cadena de caracteres permite quitar todos los saltos de linea de
     * una cadena, estos se reepresentan con el caracter '\n'.
     * 
     * @param cadena
     *            cadena a modificar
     * @return cadena modificada
     * 
     * @example "linea \n de \n codigo" -> "Linea  de  codigo"
     */
    public static String quitarSaltos(String cadena) {
    	return cadena.replaceAll("\n", "");
    }
    
	public static void main(String[] args) {
	
		String sTextoConSaltos = "L’nea\n de\n C—digo";
		System.out.println(sTextoConSaltos);
		
		String sTextoSinSaltos = quitarSaltos(sTextoConSaltos);
		System.out.println(sTextoSinSaltos);	
				
	}
    
}