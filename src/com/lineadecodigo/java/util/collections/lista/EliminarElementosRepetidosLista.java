package com.lineadecodigo.java.util.collections.lista;

/**
 * @file EliminarElementosRepetidosLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/agosto/2021
 * @url    http://lineadecodigo.com/java/eliminar-elementos-repetidos-de-un-arraylist/
 * @description Eliminar todos los elementos repetidos de una lista
 */

import java.util.ArrayList;
import java.util.Iterator;

public class EliminarElementosRepetidosLista {

	public static void main(String[] args) {
		
		// ArrayList con tamaño
		ArrayList<String> al = new ArrayList<String>();
				
		// Añadir elementos a un ArrayList
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("1");
		al.add("4");
		al.add("5");
		al.add("1");
		al.add("6");
		al.add("7");
			    			
		// Eliminamos todas las ocurrencias del 1
		// while(al.remove("1"));

		ArrayList<String> eliminar = new ArrayList<String>();
		eliminar.add("1");
		al.removeAll(eliminar);

		// Recorrer un ArrayList con un Iterador
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	

	}

}
