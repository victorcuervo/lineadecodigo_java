package com.lineadecodigo.java.basico;

/**
 * @file DibujandoUnaFigura.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/mayo/2007
 * @url    http://lineadecodigo.com/2007/05/06/dibujando-una-figura/
 * @description Como dibujar una figura en la consola. Aprendizaje del uso de bucles while.  
 */

public class DibujandoUnaFigura {

	public static void main(String[] args) {
		
		 // Declaramos la variables columnas y filas.
		 int columnas;
		 int total_filas = 7;
		 int filas = total_filas; // Tenemos 7 filas.
		 
		 
		 while (filas > 0) {
		   columnas = total_filas - filas;

		    while (columnas > 0) {
		      System.out.print('*');
		      columnas--;
		    }

		    System.out.println('*');
		    filas--;
		 }           

	}

}
