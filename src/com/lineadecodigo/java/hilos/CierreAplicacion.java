package com.lineadecodigo.java.hilos;

/**
 * @file CierreAplicacion.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   21/septiembre/2015
 * @url    http://lineadecodigo.com/java/finalizar-un-programa-java/
 * @description Controlar la finalización de un programa Java
 */

public class CierreAplicacion {

	public void attachShutDownHook(){
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
	
			@Override
			public void run() {
				System.out.println("Esto lo ejecutamos cuando acabe el programa");
			}
		});
		
		System.out.println("Creado el hook en el programa");
		
	 }
	
	
	public static void main(String[] args) {
	
		CierreAplicacion app = new CierreAplicacion();
		app.attachShutDownHook();
		System.out.println("Última instrucción del programa");
		System.exit(0);
		
	}

}
