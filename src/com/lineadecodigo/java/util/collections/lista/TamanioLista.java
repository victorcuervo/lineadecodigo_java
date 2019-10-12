package com.lineadecodigo.java.util.collections.lista;

/**
 * @file TamanioLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/noviembre/2014
 * @url    http://lineadecodigo.com/java/numero-de-elementos-en-un-arraylist/
 * @description Conocer el número de elementos de un ArrayList
 */

import java.util.ArrayList;

public class TamanioLista {


	public static void main(String[] args) {

		// ArrayList con tamaño
		ArrayList<String> al = new ArrayList<String>();
		
		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		// Obtener el tamaño de un ArrayList
		
		int tamanio = al.size();
		System.out.println("El número de elementos es de "+tamanio);
		
		// Recorrer un ArrayList
		for(int x=0;x<tamanio;x++) {
			System.out.println(al.get(x));
		}
		
	}

}
