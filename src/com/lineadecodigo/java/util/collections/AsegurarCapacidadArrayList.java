package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;

/**
* @file AsegurarCapacidadArrayList.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   6/agosto/2021
* @url    http://lineadecodigo.com/java/asegurar-la-capacidad-de-un-arraylist/
* @description Asegura la capacidad de un ArrayList
*/

public class AsegurarCapacidadArrayList {

	  public static void main(java.lang.String[] args) {

	    ArrayList<String> list = new ArrayList<String>();

		// Aseguramos la capacidad para 3 elementos
		list.ensureCapacity(3);

		System.out.println("El tamaño del ArrayList es " + list.size());

	    // Añadimos elementos
	    list.add("Marta");
	    list.add("Luis");
	    list.add("Francisco");
	   
		System.out.println("El tamaño del ArrayList es " + list.size());
	    
	  }

}
