package com.lineadecodigo.java.util.collections.lista;

/**
 * @file IteradorLista.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   9-noviembre-2014
 * @url    http://lineadecodigo.com/java/recorrer-una-lista-con-listiterator/
 * @description Utilizar un ListIterator para recorrer una lista en ambas direcciones
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class IteradorLista {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		
		// Recorrer un ArrayList con un Iterador
	    ListIterator<String> it = al.listIterator();
	    while(it.hasNext())
	    	System.out.println(it.next());
	    
	    while(it.hasPrevious())
	    	System.out.println(it.previous());
		

	}

}
