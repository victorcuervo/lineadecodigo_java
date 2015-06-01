package com.lineadecodigo.java.util.dates;

/**
 * @file FormatoDeFechas.java
 * @version 1.0
 * @author Emmanuel Ramos. (http://lineadecodigo.com)
 * @date   15-marzo-2012
 * @url    http://lineadecodigo.com/java/formato-a-fechas-en-java-con-dateformat/
 * @description Cómo dar un formato a una fecha con Java
 */

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatoDeFechas {

	public static void main(String[] args) {
		
		//Primero crearemos una instancia de la clase Date		 
		Date date = new Date();
		 
		//Crearemos una instancia de la clase Locale		 
		//como ven ingrese parametros al constructor los cuales especifican el lenguaje y pais respectivamente		 
		Locale locBR = new Locale("pt","BR");
		 
		//Ingrese al constructor parametros para que muestre la fecha en Brazil			
		//creamos un array de DateFormat
		DateFormat[]df = new DateFormat[4];
		 
		//a cada uno le damos una instancia de DateFormat el metodo getDateInstance regresa una instancia		 
		//recordar que como es abstracta no podemos hacer esto  "new DateFormat()"
		df[0]= DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[1]= DateFormat.getDateInstance(DateFormat.LONG);
		df[2]= DateFormat.getDateInstance(DateFormat.SHORT);
		df[3]= DateFormat.getDateInstance(DateFormat.LONG, locBR );
		
		//a este le pasamos el locale para que me de formato en el pais especificado
		//a cada uno le pasamos constantes, de cualquier forma hay mas constantes las cuales podrias		 
		//revisar en el api y hacer prueba
		  
		//hacemos un loop para iterar sobre el array y damos el formato a la fecha que habiamos creado arriba
		for(DateFormat d : df){
			System.out.println(d.format(date));
		 
		}

	}

}
