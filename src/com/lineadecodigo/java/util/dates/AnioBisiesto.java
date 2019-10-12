package com.lineadecodigo.java.util.dates;

/**
 * @file AnioBisiesto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/junio/2015
 * @url    http://lineadecodigo.com/java/ano-bisiesto-en-java/
 * @description Código que calcula si un año es bisiesto.
 */

import java.util.GregorianCalendar;

public class AnioBisiesto {
	
	public static void main(String[] args) {

		int anio = 2008;
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
		
		GregorianCalendar calendar = new GregorianCalendar();

		if (calendar.isLeapYear(anio))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");		
		
	}

}
