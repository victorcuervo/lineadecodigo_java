package com.lineadecodigo.java.basico;

/**
 * @file DibujandoUnaFigura.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/abril/2009
 * @url     http://lineadecodigo.com/2009/04/23/dibujar-una-figura-con-bucles/
 * @description Como dibujar una figura en la consola. Aprendizaje del uso de bucles while. Incremento y decremento de bucles.  
 */

public class DibujandoUnaFigura_2 {

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

		 filas = 0;

		 while (filas <= total_filas) {
		   columnas = total_filas - filas;

		    while (columnas > 0) {
		      System.out.print('*');
		      columnas--;
		    }

		    System.out.println('*');
		    filas++;
		}           
		 
		 
	}

}
