package com.lineadecodigo.java.xml.sax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @file MiManejador.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/abril/2010
 * @url    http://lineadecodigo.com/java/acceder-al-xml-con-sax/
 * @description Manejador SAX para el ejemplo MiPrimerSAX.  
 */

public class MiManejador extends DefaultHandler {

	  MiManejador(){}

	  public void characters(char[] ch, int start, int len)
	    throws SAXException{
	      System.out.println(new String(ch,start,len));
	  }

}
