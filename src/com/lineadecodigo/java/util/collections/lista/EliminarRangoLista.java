package com.lineadecodigo.java.util.collections.lista;

/**
 * @file EliminarRangoLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   11/agosto/2021
 * @url    http://lineadecodigo.com/java/xxx/
 * @description Elimina un rango de elementos de una lista.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class EliminarRangoLista extends ArrayList<Integer> {

	public static void main(String[] args) {
		
		// ArrayList con tamaño
		EliminarRangoLista numeros = new EliminarRangoLista();
				
		// Añadir elementos a un ArrayList
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
			    			
		numeros.removeRange(3,6);

		// Recorrer un ArrayList con un Iterador
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	

	}

}
