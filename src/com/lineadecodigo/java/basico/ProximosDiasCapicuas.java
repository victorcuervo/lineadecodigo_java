package com.lineadecodigo.java.basico;

/**
 * @file ProximosDiasCapicuas.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  02/febrero/2020
 * @url   http://lineadecodigo.com/java/xxx/
 * @description Cálculo de los próximos días capicuas de los siguientes 1000 años. 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProximosDiasCapicuas {
	
	public static boolean isValidDate(String strDate){
		
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		sdfrmt.setLenient(false);
		
		try {
			Date javaDate = sdfrmt.parse(strDate); 
	    } catch (ParseException e) {
	        return false;
	    }

	    return true;
	}

	public static void main(String[] args) {
		
		for (int year=2020;year<3002;year++) {
			
			StringBuilder sb = new StringBuilder(Integer.toString(year));
			String reverseYear = sb.reverse().toString();
			
			String day = reverseYear.substring(0,2);
			String month = reverseYear.substring(2,4);
			
			String strDate = day + "/" + month + "/" + year;
			
			if (isValidDate(strDate))
				System.out.println(strDate);
			
			
		}

	}

}
