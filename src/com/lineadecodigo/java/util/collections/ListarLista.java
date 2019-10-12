package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @file ListarLista.java
* @version 1.1
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   24/junio/2004
* @url    http://lineadecodigo.com/java/numero-de-elementos-de-una-lista-en-java/
* @description Código que recorre los elementos de una lista
*/


public class ListarLista {

	public ListarLista() {
	       super();
	     }

	  public static void main(java.lang.String[] args) {

	    // Definimos una ArrayList
	    List<String> list = new ArrayList<String>();
	   
	    // Añadimos elementos
	    list.add("Andrea");
	    list.add("Amaya");
	    list.add("Julio");
	   
	    // Obtenemos un Iterador y recorremos la lista.
	    Iterator<String> iter = list.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());
	   
	  }

}
