package com.lineadecodigo.java.external.jaunt;

/**
 * @file ScreenScraping.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   4/abril/2016
 * @url    http://lineadecodigo.com/java/screen-scraping-java/
 * @description Uso de la librería Jaunt para poder realizar screen scraping con Java
 */


import com.jaunt.ResponseException;
import com.jaunt.UserAgent;


public class ScreenScraping {

	public static void main(String[] args) {
		
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.visit("http://manualweb.net");						
			System.out.println(userAgent.doc.innerHTML());
			
		} catch (ResponseException re) {
			re.printStackTrace();
		} 

			
	}

}
