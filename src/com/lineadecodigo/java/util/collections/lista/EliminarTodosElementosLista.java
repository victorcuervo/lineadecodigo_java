package com.lineadecodigo.java.util.collections.lista;


/**
 * @file EliminarTodosElementosListajava
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   9-noviembre-2014
 * @url    http://lineadecodigo.com/java/eliminar-todos-los-elementos-de-un-arraylist/
 * @description Eliminar todos los elementos de un ArrayList
 */


import java.util.ArrayList;

public class EliminarTodosElementosLista {

	public static void main(String[] args) {

		// ArrayList con tama–o
		ArrayList<String> al = new ArrayList<String>();
				
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
			    
	    System.out.println("La lista contiene "+al.size()+" elementos");
		
	    // Eliminamos todos los elementos
	    al.clear();
	    
	    System.out.println("La lista contiene "+al.size()+" elementos");

		
	}

}
