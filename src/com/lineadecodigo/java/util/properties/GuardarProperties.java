package com.lineadecodigo.java.util.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @file GuardarProperties.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/febrero/2012
 * @url    http://lineadecodigo.com/java/guardar-unos-properties-con-java/
 * @description Modifica y Guarda los valores de un fichero de Properties  
 */

public class GuardarProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("nombre","Linea de Código");
		prop.setProperty("url","http://lineadecodigo.com");
		
		FileOutputStream os = null;	   
	    
	    try {
	    	 os=new FileOutputStream("fichero.prop");	
	    	 prop.store(os, "Fichero de Propiedades de la Web");
		 } catch(IOException ioe) {ioe.printStackTrace();}
		 
		 
		
	

	}

}
