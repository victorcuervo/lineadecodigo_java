package com.lineadecodigo.java.basico;

/**
 * @file TablasDeMultiplicar.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   5/junio/2007
 * @url    http://lineadecodigo.com/java/tablas-de-multiplicar-en-java/
 * @description Creación de un programa que bajo petición de un número calcule su tabla de multiplicar.  
 */

import java.io.*;

public class TablasDeMultiplicar {


	public static void main(String[] args) {
		
		   InputStreamReader isr = new InputStreamReader(System.in);
		   BufferedReader br = new BufferedReader(isr);


		   // Variables para el manejo del número
		   String sNumero = ""; 
		   Integer iNumero = null;
		   int iNumeroCalculo;
		   
		   // Pedimos por consola el número del cual queremos
		   // la tabla de multiplicar
		   
		   System.out.println("Introduce el número de la tabla de multiplicar");
		   
		   try {
		   
		     // Leemos del buffer 
		     sNumero = br.readLine(); 
		     // Convertimos la cadena a un número Integer
		     iNumero = new Integer(sNumero);

		     System.out.println("El número introducido es " + sNumero);
		     iNumeroCalculo = iNumero.intValue();
		   
		     // Mostramos la tabla de multiplicar
		     for (int x=1;x<11;x++) 
		       System.out.println(iNumeroCalculo + " x " + x + " = " + 
		             (x*iNumeroCalculo));
		   
		   } catch (IOException ioe){
		     System.out.println("No se pudo leer de consola");
		   }catch (NumberFormatException nfe){
		     System.out.println("El valor introducido no es válido"); 
		   }
	}

}
