package com.lineadecodigo.java.util.collections;

/**
 * @file ExtraerArrayDeMapa.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18/octubre/2015
 * @url    http://lineadecodigo.com/java/extraer-array-de-un-mapa-con-java/
 * @description Extrer el contenido de un Mapa y volcarlo a un array
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExtraerArrayDeMapa {

	public static void main(String[] args) {

		Map<Integer,String> mapa = new HashMap<Integer,String>();
		
		mapa.put(1, "Victor");
		mapa.put(2,  "Nacho");
		mapa.put(3, "Julio");
		mapa.put(4, "David");
		mapa.put(1, "Pepe"); // Para demostrar el uso del HashMap
		
		
		// Recorremos el HashMap
		
		Iterator<Entry<Integer,String>> it = mapa.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<Integer,String> e = it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		// Extraemos los valores
		
		String[] nombres = mapa.values().toArray(new String[0]);
		
		for (String nombre: nombres)
			System.out.println(nombre);
	
		// Extraemos las claves
		
		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
		
		for (Integer clave: claves)
			System.out.println(clave);
	
		
		
	}

}
