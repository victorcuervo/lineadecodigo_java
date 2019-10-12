package com.lineadecodigo.java.util.properties;

/**s 
* @file PropertiesClaveValor.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   05/junio/2015
* @url    http://lineadecodigo.com/java/leer-valores-de-fichero-de-properties/
* @description Lee las propiedades de un fichero Properties.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClaveValor {
	
	  public PropertiesClaveValor() {
	      super();
	   }

	   public static void main(java.lang.String[] args) {
	     
	    Properties prop = new Properties();
	    InputStream is = null;

	    try {
	      is=new FileInputStream("fichero.prop");
	      prop.load(is);
	    } catch(IOException ioe) {}


	    // Recorremos los enumerados y los mostramos
	    for (Enumeration<Object> e = prop.keys(); e.hasMoreElements();) {
	    	
	      // Obtenemos el objeto
	      Object obj = e.nextElement();
	      System.out.println(obj + ": "
	        + prop.getProperty(obj.toString()));
	    }
	  }

}
