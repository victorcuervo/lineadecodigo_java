package com.lineadecodigo.java.basico;

/**
 * @file Milisegundos2Hora.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/marzo/2007
 * @url    http://lineadecodigo.com/2007/03/29/milisegundos-a-hora-en-java/
 * @description Método que convierte los milisegundos en una hora  
 */

public class Milisegundos2Hora {

	public static void main(String[] args) {
		
		long milisegundos = 110234;
		long hora,minuto,segundo;
		long restohora,restominuto,restosegundo;
				
		hora = milisegundos/3600000;
		restohora = milisegundos%3600000;
		
		minuto = restohora/60000;
		restominuto = restohora%60000;
		
		segundo = restominuto/1000;
		restosegundo = restominuto%1000;
		
		System.out.println(hora + ":" + minuto + ":" + segundo + "." + restosegundo);
		
	}

}
