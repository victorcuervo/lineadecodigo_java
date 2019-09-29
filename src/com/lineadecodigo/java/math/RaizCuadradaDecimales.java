package com.lineadecodigo.java.math;

/*
* @file VolumenCilindro.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   22/septiembre/2016
* @url    http://lineadecodigo.com/java/raiz-cuadrada-de-dos-decimales/
* @description Muestra el resultado de una raíz cuadrada con dos decimales.
*/

import java.text.DecimalFormat;

public class RaizCuadradaDecimales {

	public static void main(String[] args) {
		
		double raiz = Math.sqrt(6);
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println(df.format(raiz));
		System.out.println(Math.sqrt(6));

	}

}
