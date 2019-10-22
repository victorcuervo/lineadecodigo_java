package com.lineadecodigo.java.twitter;

/**
 * @file EnviarTweet.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2019
 * @url    http://lineadecodigo.com/java/enviar-tweet-con-java/
 * @description Enviar tweet con Java mediante Twitter4j
 */

import twitter4j.*;

public class EnviarTweet {

	public static void main(String[] args) {
		
		
	 try {
		 // Asume que hay un twitter4j.properties en la raíz del classpath
		 Twitter twitter = new TwitterFactory().getInstance();	 		 
	     
	     twitter.updateStatus("Mensaje enviado desde un ejemplo Java de Línea de Código http://lineadecodigo.com");
	   
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Error en la conexión: " + te.getMessage()); 
	        
	    }
		

	}

}
