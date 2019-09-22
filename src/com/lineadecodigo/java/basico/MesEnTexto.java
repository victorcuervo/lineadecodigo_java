package com.lineadecodigo.java.basico;

/**
 * @file MesEnTexto.java
 * @version 1.0
 * @author Christian Portilla Pauca (http://lineadecodigo.com/author/xhrist14n/)
 * @date   14/enero/2013
 * @url    http://lineadecodigo.com/java/convertir-un-mes-en-texto-con-java/
 * @description Convierte un mes numérico en texto.
 */


import java.util.Calendar;
import java.util.Date;

public class MesEnTexto {

	public static String dateMonth(Date date) {
		String result = "";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int month = 0;

		try {
			month = calendar.get(Calendar.MONTH);
		} catch (Exception ex) {
		}
		switch (month) {
		case 0: {
			result = "Enero";
			break;
		}
		case 1: {
			result = "Febrero";
			break;
		}
		case 2: {
			result = "Marzo";
			break;
		}
		case 3: {
			result = "Abril";
			break;
		}
		case 4: {
			result = "Mayo";
			break;
		}
		case 5: {
			result = "Junio";
			break;
		}
		case 6: {
			result = "Julio";
			break;
		}
		case 7: {
			result = "Agosto";
			break;
		}
		case 8: {
			result = "Septiembre";
			break;
		}
		case 9: {
			result = "Octubre";
			break;
		}
		case 10: {
			result = "Noviembre";
			break;
		}
		case 11: {
			result = "Diciembre";
			break;
		}
		default: {
			result = "Error";
			break;
		}
		}
		return result;
	}

	public static void main(String[] args) {

		Calendar calendar=Calendar.getInstance();
		Date now=calendar.getTime();
		System.out.println(dateMonth(now));
		
	}

}
