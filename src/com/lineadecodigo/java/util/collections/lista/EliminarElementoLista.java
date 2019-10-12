package com.lineadecodigo.java.util.collections.lista;

/**
 * @file EliminarElementoLista.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/noviembre/2014
 * @url    http://lineadecodigo.com/java/eliminar-un-elemento-de-un-arraylist/
 * @description Código que elimina un elemento de un ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class EliminarElementoLista {

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
		
	    // Eliminamos el primer elemento
	    al.remove(2);
	    
	    it = al.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());

		
	}

}
