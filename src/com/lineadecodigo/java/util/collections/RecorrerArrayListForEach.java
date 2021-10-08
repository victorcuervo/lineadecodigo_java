package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;

/**
* @file RecorrerArrayListForEach.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   6/agosto/2021
* @url    http://lineadecodigo.com/java/recorrer-un-arraylist-con-lambda-y-foreach/
* @description Asegura la capacidad de un ArrayList
*/

public class RecorrerArrayListForEach {

	  public static void main(java.lang.String[] args) {

	    ArrayList<String> list = new ArrayList<String>();

	    // Añadimos elementos
	    list.add("Marta");
	    list.add("Luis");
	    list.add("Francisco");

		list.forEach((n) -> System.out.println(n));

	  }

}
