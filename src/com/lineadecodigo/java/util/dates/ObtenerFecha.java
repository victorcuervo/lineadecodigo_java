package com.lineadecodigo.java.util.dates;

/**
 * @file ObtenerFecha.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2007
 * @url    http://lineadecodigo.com/2007/10/16/obtener-fecha-actual-con-java/
 * @description Obtener la fecha del día con Java.  
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObtenerFecha {

	public static void main(String[] args) {

	   System.out.println (new Date());
	   
	   Calendar c = new GregorianCalendar(); 
	   
	   String dia, mes, annio;
	   
	   dia = Integer.toString(c.get(Calendar.DATE));
	   mes = Integer.toString(c.get(Calendar.MONTH));
	   annio = Integer.toString(c.get(Calendar.YEAR));
	   
	   System.out.println (dia + "/" + mes +"/" + annio);
		
		
	}

}
