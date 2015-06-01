package com.lineadecodigo.java.util.dictionary;

/**
 * @file CrearHashtable.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   27-marzo-2011
 * @url    http://lineadecodigo.com/java/crear-una-hashtable/
 * @description Crear una Hashtable para insertar pares clave/valor
 */

import java.util.Hashtable;

public class CrearHashtable {
	
	public static void main(String[] args) {

		Hashtable<String,String> paises = new Hashtable<String,String>();
		paises.put("ES", "España");
		paises.put("UK", "Reino Unido");
		paises.put("US", "Estados Unidos");
		paises.put("FR", "Francia");

		String clave = "US";		
		System.out.println("El valor de la clave " + clave + " es " + paises.get(clave));
		
	}

}
