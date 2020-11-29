package com.lineadecodigo.java.basico;

/**
 * @file AreaRectangulo.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/diciembre/2007
 * @url  http://lineadecodigo.com/java/area-de-un-rectangulo-con-java/  
 * @description Cálculo del área de un rectángulo con Java  
 */

public class AreaRectangulo {

	public static void main(String[] args) {
		
		int area_rectangulo = 0;
		int lado1 = 10;
		int lado2 = 20;
		
		area_rectangulo = lado1*lado2;
		
		System.out.println("El area de un rectángulo de lado "+lado1+" y lado "+lado2+" es igual a "+area_rectangulo);

	}

}
