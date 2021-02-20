package com.lineadecodigo.java.twitter;

/**
 * @file InformacionTweet.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2019
 * @url    http://lineadecodigo.com/java/informacion-de-un-tweet-con-java/
 * @description Dar información de un Tweet en concreto
 */

import twitter4j.*;

public class InformacionTweet {

	public static void main(String[] args) {
		
	 try {
		 // Asume que hay un twitter4j.properties en la raíz del classpath
		 Twitter twitter = new TwitterFactory().getInstance();	 
		 
		 long statusid = 1182894932480184322L;
		 Status status = twitter.showStatus(statusid);
         System.out.println("@" + status.getUser().getScreenName() + ", dice:  " + status.getText());
            
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Error en la conexión: " + te.getMessage()); 
            
        }
		

	}

}
