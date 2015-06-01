package com.lineadecodigo.java.util.collections.lista;

/**
 * @file CrearArrayList.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   28-septiembre-2014
 * @url    http://lineadecodigo.com/java/crear-un-arraylist-en-java/
 * @description Diferentes formas de crear un ArrayList en Java.
 */

import java.util.ArrayList;
import java.util.Vector;

public class CrearArrayList {

	public static void main(String[] args) {

		
		// ArrayList sin tama–o
		ArrayList<String> al = new ArrayList<String>();
		
		// ArrayList con tama–o
		ArrayList<String> al2 = new ArrayList<String>(3);
		
		// ArrayList desde otra colecci—n
		
		Vector<String> vector = new Vector<String>();
		vector.add("Irene");
		vector.add("Mar’a");
		
		// ArrayList con tama–o
		ArrayList<String> al3 = new ArrayList<String>(vector);

	

		
		
	}

}
