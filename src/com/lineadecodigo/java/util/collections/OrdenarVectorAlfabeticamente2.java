package com.lineadecodigo.java.util.collections;

import java.util.Collections;
import java.util.Vector;

/**
 * @file OrdenarVectorAlfabeticamente2.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   3/enero/2010
 * @url  http://lineadecodigo.com/java/ordenando-alfabeticamente-con-case_insensitive_order/
 * @description Utilizar una ordenación alfabética mediante el campo String.CASE_INSENSITIVE_ORDER
 */

public class OrdenarVectorAlfabeticamente2 {
	

	public static void main(String[] args) {

		
		Vector<String> miVector = new Vector<String>();
		miVector.add("Victor");
		miVector.add("julio");
		miVector.add("amaya");								
		
		Collections.sort(miVector,String.CASE_INSENSITIVE_ORDER);		
		
		for(String sElemento: miVector){
			System.out.println(sElemento);	
		}
				
	}

}
