package com.lineadecodigo.java.util.collections;

import java.util.Collections;
import java.util.Vector;

/**
 * @file OrdenarVector.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   22/marzo/2009
 * @url  http://lineadecodigo.com/2009/03/22/ordenar-un-vector-de-string-en-java/
 * @description Ordenar un Vector mediante la clase Collections y su método .sort
 */

public class OrdenarVector {

	
	public static void main(String[] args) {

		
		Vector<String> miVector = new Vector<String>();
		miVector.add("Victor");
		miVector.add("julio");
		miVector.add("amaya");			
		
		Collections.sort(miVector);		
		
		for(String sElemento: miVector){
			System.out.println(sElemento);	
		}
				
	}

}
