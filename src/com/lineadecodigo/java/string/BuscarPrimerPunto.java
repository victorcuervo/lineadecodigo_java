package com.lineadecodigo.java.string;

/**
 * @file BuscarPrimerPunto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/junio/2015
 * @url    http://lineadecodigo.com/java/primer-punto-de-la-cadena-con-java/
 * @description Localizar el primer punto de una cadena con Java
 */

public class BuscarPrimerPunto {


	public static void main(String[] args) {
		
		String sCadena = "www.lineadecodigo.com";
		
		String sHastaPrimerPunto = sCadena.substring(0,sCadena.indexOf('.'));
		String sDesdePrimerPunto = sCadena.substring(sCadena.indexOf('.')+1,sCadena.length());
		
		System.out.println(sHastaPrimerPunto);
		System.out.println(sDesdePrimerPunto);	
		
	}

}
