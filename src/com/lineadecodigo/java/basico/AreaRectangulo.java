package com.lineadecodigo.java.basico;

/**
 * @file AreaRectangulo.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   9-diciembre-2007
 * @url  http://lineadecodigo.com/2007/12/13/area-de-un-rectangulo-con-java/  
 * @description Calculo del área de un rectangulo con Java  
 */

public class AreaRectangulo {

	public static void main(String[] args) {
		
		int area_rectangulo = 0;
		int lado1 = 10;
		int lado2 = 20;
		
		area_rectangulo = lado1*lado2;
		
		System.out.println("El area de un rectangulo de lado "+lado1+" y lado "+lado2+" es igual a "+area_rectangulo);

	}

}
