package com.lineadecodigo.java.util.collections.lista;

/**
 * @file ExtraerSublista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/agosto/2021
 * @url    http://lineadecodigo.com/java/extraer-una-sublista-en-java/
 * @description Extrae una sublista de una lista inicial
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ExtraerSublista {

	public static void main(String[] args) {
		
		// ArrayList con tamaño
		ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		List<Integer> sublista = lista.subList(5, lista.size());

		Iterator<Integer> it = sublista.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());

	
	}

}
