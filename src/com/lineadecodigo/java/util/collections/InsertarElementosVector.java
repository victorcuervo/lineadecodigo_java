package com.lineadecodigo.java.util.collections;

import java.util.Iterator;
import java.util.Vector;

/**
 * @file InsertarElementosVector.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/enero/2009
 * @url  http://lineadecodigo.com/2006/12/17/insertar-elementos-en-un-vector/
 * @description Insertar elementos en un vector
 */


public class InsertarElementosVector {

	public static void main(String[] args) {

		Vector<String> mivector = new Vector<String>();
		
		mivector.add("Elemento Uno");
		mivector.add("Elemento Dos");
		mivector.add("Elemento Tres");
		
	    Iterator<String> iter = mivector.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());

	}

}
