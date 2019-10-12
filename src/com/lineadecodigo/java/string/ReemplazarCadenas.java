package com.lineadecodigo.java.string;

/**
 * @file ReemplazarCadenas.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date 27/diciembre/2012
 * @url http//lineadecodigo.com/java/string-reemplazar-cadenas-con-java/
 * @description Código que sustituye una cadena de caracteres por otra.
 */


public class ReemplazarCadenas {

	public static String reemplazar(String cadena, String busqueda, String reemplazo) {
		return cadena.replaceAll(busqueda, reemplazo);
	}		    
	   
	public static void main(String[] args) {
	
		String sURL = "http://www.lineadecodigo.com";
		String sNuevaURL = reemplazar(sURL,"lineadecodigo","aulambra");
		System.out.println(sNuevaURL);
		
	}

}
