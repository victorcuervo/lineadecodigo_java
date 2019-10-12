package com.lineadecodigo.java.util.collections.lista;

/**
 * @file IterarSobreLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/noviembre/2014
 * @url    http://lineadecodigo.com/java/iterar-un-arraylist/
 * @description Recorrer un ArrayList utilizando un iterador
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IterarSobreLista {

	public static void main(String[] args) {

		
		// ArrayList con tamaño
		ArrayList<String> al = new ArrayList<String>();
				
		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
			    
		// Recorrer un ArrayList con un Iterador
	    Iterator<String> it = al.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());
		

	}

}
