package com.lineadecodigo.java.file;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @file FechaModificacionFichero.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/enero/2012
 * @url    http://lineadecodigo.com/java/obtener-fecha-de-modificacion-de-un-fichero-con-java/
 * @description Programa que obtiene la fecha de modificación de un fichero. 
 */

public class FechaModificacionFichero {

	public static void main(String[] args) {

		File fichero = new File("test.txt");
		long ms = fichero.lastModified();
		
		Date d = new Date(ms);
		Calendar c = new GregorianCalendar(); 
		c.setTime(d);
		
		String dia, mes, annio, hora, minuto, segundo;
		   
		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH));
		annio = Integer.toString(c.get(Calendar.YEAR));
		hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(Calendar.MINUTE));
		segundo = Integer.toString(c.get(Calendar.SECOND));
		  
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
			
	}

}
