package com.lineadecodigo.java.basico.arrays;

/**
 * @file Array2String.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/marzo/2010
 * @url    http://lineadecodigo.com/java/convertir-un-array-en-un-string-con-java/
 * @description Convertir un array en una cadena de texto
 */

public class Array2String {

	 public static void main(String[] args) {
		   
	   //El array
	   String miarray[] = {"A","V","I","L","A"};	   

	   // La cadena sobre la que lo dejaremos
	   StringBuffer cadena = new StringBuffer();
	   
	   for (int x=0;x<miarray.length;x++){
		     cadena =cadena.append(miarray[x]);
		}
	   
	   System.out.println(cadena.toString());   	   	   
	 }
		

}
