package com.lineadecodigo.java.util.collections.lista;

/**
 * @file TamanioLista.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   10-noviembre-2014
 * @url    http://lineadecodigo.com/java/numero-de-elementos-en-un-arraylist/
 * @description Conocer el nœmero de elementos de un ArrayList
 */

import java.util.ArrayList;

public class TamanioLista {


	public static void main(String[] args) {

		// ArrayList con tama–o
		ArrayList<String> al = new ArrayList<String>();
		
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		// Obtener el tama–o de un ArrayList
		
		int tamanio = al.size();
		System.out.println("El nœmero de elementos es de "+tamanio);
		
		// Recorrer un ArrayList
		for(int x=0;x<tamanio;x++) {
			System.out.println(al.get(x));
		}
		
	}

}
