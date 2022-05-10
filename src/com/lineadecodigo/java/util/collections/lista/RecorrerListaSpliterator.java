package com.lineadecodigo.java.util.collections.lista;

/**
 * @file RecorrerListaSpliterator.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/agosto/2021
 * @url    http://lineadecodigo.com/java/recorrer-una-lista-con-spliterator/
 * @description Recorrer los elementos de un ArrayList mediante un spliterator.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class RecorrerListaSpliterator {

	public static void main(String[] args) {
		
		// ArrayList con tamaño
		ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Spliterator<Integer> si = lista.spliterator());
		si.forEachRemaining(n -> System.out.println(n));
	
	}

}
