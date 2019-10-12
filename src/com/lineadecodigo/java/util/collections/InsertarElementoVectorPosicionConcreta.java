package com.lineadecodigo.java.util.collections;

import java.util.Iterator;
import java.util.Vector;

/**
 * @file InsertarElementoVectorPosicionConcreta.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18/enero/2009
 * @url  http://lineadecodigo.com/2009/01/19/insertar-un-elemento-en-una-posicion-concreta-del-vector/
 * @description Insertar un elemento en una posición concreta de un Vector
 */


public class InsertarElementoVectorPosicionConcreta {

	public static void main(String[] args) {
		
		Vector<String> mivector = new Vector<String>();
		
		mivector.add("Elemento Uno");
		mivector.add("Elemento Dos");
		mivector.add("Elemento Tres");
		
		mivector.add(0,"nuevo elemento");
		
	    Iterator<String> iter = mivector.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());
	}

}
