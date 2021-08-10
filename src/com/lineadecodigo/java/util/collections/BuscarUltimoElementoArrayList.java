package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;

/**
* @file BuscarUltimoElementoArrayList.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   6/agosto/2021
* @url    http://lineadecodigo.com/java/xxx/
* @description Código que nos busca un elemento dentro de un ArrayList
*/

public class BuscarUltimoElementoArrayList{

	  public static void main(java.lang.String[] args) {

	    ArrayList<String> list = new ArrayList<String>();

	    // Añadimos elementos
	    list.add("Marta");
	    list.add("Luis");
	    list.add("Francisco");
		list.add("Luis");
		list.add("Sonsoles");
		list.add("José");

		String sElementoaBuscar = "Luis";

		int posicion = list.lastIndexOf(sElementoaBuscar);

		if (posicion >0)
			System.out.println("El último elemento " + sElementoaBuscar + " está en la lista en la posición " + posicion+1);
		else
			System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");

	  }

}
