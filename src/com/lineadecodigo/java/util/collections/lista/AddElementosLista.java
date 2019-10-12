package com.lineadecodigo.java.util.collections.lista;

/**
 * @file AddElementosLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   28-septiembre-2014
 * @url    http://lineadecodigo.com/java/insertar-elementos-en-un-arraylist/
 * @description Código que nos permite añadir elementos en un ArrayList de Java
 */

import java.util.ArrayList;

public class AddElementosLista {

	public static void main(String[] args) {

		// ArrayList con tamaño
		ArrayList<String> al = new ArrayList<String>();
		
		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		for(int x=0;x<al.size();x++) {
			System.out.println(al.get(x));
		}
		
		
	}

}
