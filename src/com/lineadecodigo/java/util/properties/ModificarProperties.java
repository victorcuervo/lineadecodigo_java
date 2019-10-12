package com.lineadecodigo.java.util.properties;

import java.io.*;
import java.util.*;

/**
 * @file EscribirEnFicheroProperties.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   22/diciembre/2007
 * @url    http://lineadecodigo.com/java/modificar-valores-de-un-fichero-properties/
 * @description Crear un fichero de propiedades para guardar info  
 */

public class ModificarProperties {

	public static void main(String[] args) {
		
		 Properties prop = new Properties();
	     FileInputStream is = null;	   

	     // Cargamos el fichero de propiedades
	     try {
	    	 // Asumimos que el fichero existe
		     is=new FileInputStream("fichero.prop");
		     prop.load(is);		  			 
		 } catch(IOException ioe) {ioe.printStackTrace();}

		 // Listamos las propiedades
		 System.out.println("PROPIEDADES POR DEFECTO");
		 for (Enumeration e = prop.keys(); e.hasMoreElements()    ;) {		 
		   Object obj = e.nextElement();
		   System.out.println(obj + ": "
		     + prop.getProperty(obj.toString()));
		 }
		 
		 // Modificamos los valores
		 prop.setProperty("nombre", "ayudaenlaweb");
		 prop.setProperty("web", "http://ayudaenlaweb.blogspot.com");
		 
		 // Volvemos a listar los valores
		 System.out.println("PROPIEDADES MODIFICADAS");
		 for (Enumeration e = prop.keys(); e.hasMoreElements()    ;) {		 
			   Object obj = e.nextElement();
			   System.out.println(obj + ": "
			     + prop.getProperty(obj.toString()));
		 }
		 
		 
	}
}
