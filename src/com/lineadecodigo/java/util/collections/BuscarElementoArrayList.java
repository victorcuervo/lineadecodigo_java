package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;

/**
* @file BuscarElementoArrayList.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   6/agosto/2021
* @url    http://lineadecodigo.com/java/buscar-elementos-en-un-arraylist/
* @description Código que nos busca un elemento dentro de un ArrayList
*/

public class BuscarElementoArrayList{

	  public static void main(java.lang.String[] args) {

	    ArrayList<String> list = new ArrayList<String>();

	    // Añadimos elementos
	    list.add("Marta");
	    list.add("Luis");
	    list.add("Francisco");

		String sElementoaBuscar = "Marta";
		int posicion = list.indexOf(sElementoaBuscar);

		if (posicion >= 0)
			System.out.println("El elemento " + sElementoaBuscar + " está en la lista. En la posición " + posicion);
		else
			System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");
			
	  }

	  

}
