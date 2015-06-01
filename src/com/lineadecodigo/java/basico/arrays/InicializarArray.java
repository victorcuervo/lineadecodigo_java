package com.lineadecodigo.java.basico.arrays;

/**
 * @file InicializarArray.java
 * @version 1.2
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   14-junio-2007
 * @url    http://lineadecodigo.com/2007/06/14/inicializar-un-array-en-java/
 * @description Dos formas de inicializar un array.  
 */

public class InicializarArray {

	public static void main(String[] args) {

		String a[] = {"Avila","Burgos","León","Palencia","Salamanca",
				   "Segovia","Soria","Valladolid","Zamora"};
		
		String b[] = new String[9];

		b[0] = "Avila";
		b[1] = "Burgos";
		b[2] = "León";
		
		System.out.println(a[0]);
		System.out.println(b[1]);
	}

}
