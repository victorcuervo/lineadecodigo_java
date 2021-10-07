package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
* @file ClonarArrayList.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   6/agosto/2021
* @url    http://lineadecodigo.com/java/clonar-un-arraylist/
* @description Código que clona un ArrayList
*/

public class ClonarArrayList {

	  public static void main(java.lang.String[] args) {

	    // Definimos una ArrayList
	    ArrayList<String> list = new ArrayList<String>();
	   
	    // Añadimos elementos
	    list.add("Marta");
	    list.add("Luis");
	    list.add("Francisco");
	   
	    // Obtenemos un Iterador y recorremos la lista.
	    Iterator<String> iter = list.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());

		ArrayList<String> list2 = (ArrayList<String>)list.clone();

		// Eliminamos un elemento de la lista inicial para ver que no pasa nada en el ArrayList clonado
		list.remove(0);

		// Obtenemos un Iterador y recorremos la lista.
		iter = list2.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		
	   
	  }

}
