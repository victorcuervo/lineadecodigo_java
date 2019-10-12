package com.lineadecodigo.java.util.collections;

/**
*  @file InvertirLista.java
* @version 1.0
* @author Víctor Cuervo. (http://lineadecodigo.com)
* @date   03/junio/2015
* @url    http://lineadecodigo.com/java/invertir-una-lista/
* @description Código que nos ayuda a invertir el contenido de una lista mediante la clase Collection.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InvertirLista {
	
	public InvertirLista() {
	    super();
	  }

	  public static void main(java.lang.String[] args) {

	    List<Integer> list = new ArrayList<Integer>();
	    
	    for (int i = 1; i <= 10; i++)
	      list.add(i);

	    // Damos la vuelta a la lista
	    Collections.reverse(list);

	    // Mostramos el contenido de la lista
	    Iterator<Integer> iter = list.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next()); 
	  }

}
