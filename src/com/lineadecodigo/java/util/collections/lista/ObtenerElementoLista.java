package com.lineadecodigo.java.util.collections.lista;

/**
 * @file ObtenerElementoLista.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   9-noviembre-2014
 * @url    http://lineadecodigo.com/java/obtener-elemento-de-un-arraylist/
 * @description Obtener un elemento de un ArrayList.
 */

import java.util.ArrayList;

public class ObtenerElementoLista {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		System.out.println(al.get(0));
		System.out.println(al.get(2));	    
	    
	}

}
