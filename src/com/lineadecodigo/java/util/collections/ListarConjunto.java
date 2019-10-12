package com.lineadecodigo.java.util.collections;

/**
 * @file ListarConjunto.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   01/febrero/2009
 * @url  http://lineadecodigo.com/java/listar-un-conjunto/
 * @description Listar los elementos de un conjunto.  
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListarConjunto {

	public static void main(String[] args) {
	    
		Set<String> hs = new HashSet<String>();
	    hs.add("Victor");
	    hs.add("Amaya");
	    hs.add("Amaya"); // Los elementos solo pueden estar una vez
	    hs.add("Javier");
	   
	    Iterator<String> iter = hs.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());
		
		
	}

}
