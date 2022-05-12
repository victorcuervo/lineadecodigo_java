package com.lineadecodigo.java.util.collections.lista;

/**
 * @file AjustarCapacidadArrayList.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/agosto/2021
 * @url    http://lineadecodigo.com/java/ajustar-la-capacidad-de-un-arraylist/
 * @description Se ajusta la capacidad del ArrayList
 */

import java.util.ArrayList;

public class AjustarCapacidadArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(10);
		
		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Marta");

		// Se ajusta el tamaño. Por defecto Java tiene preparado 1,5 la capacidad actual
		al.trimToSize();
		
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
