package com.lineadecodigo.java.string;

/**
 * @file PrimeraMayuscula.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Diciembre 27, 2012
 * @url http://lineadecodigo.com/java/string-primera-letra-de-cada-palabra-en-mayuscula/
 * @description Programa que convierte a mayœscula la primera letra de cada palabra.
 */

public class PrimeraMayuscula {

    /**
     * Dada una cadena de caracteres se pasara a mayusculas la primera letra de
     * cada palabra, es decir, de aquellas palabras que esten despues de un
     * espacio, un punto o una coma, y tambien de la primera palabra de la
     * cadena.
     * 
     * @param cadena
     *            cadena a modificar
     * @return cadena modificada
     * 
     * @example "linea de codigo" -> "Linea De Codigo"
     */
    public static String primeraMayuscula(String cadena) {
	
	if(cadena == null || cadena.length() == 0)
	    return cadena;	
	
	char[] caracteres = cadena.toCharArray();
	
	// El primer caracter siempre se pone en mayuscula.
	caracteres[0] = Character.toUpperCase(caracteres[0]);

	for (int i = 0; i < cadena.length() - 2; i++)
	    if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
		caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);

	return new String(caracteres);
    }

	public static void main(String[] args) {
	
		String sCadena = "en un lugar de la mancha,de cuyo nombre no quiero acordarme.vivia un caballero...";
		String sTitulo = primeraMayuscula(sCadena);
		System.out.println(sTitulo);
		
	}
}


