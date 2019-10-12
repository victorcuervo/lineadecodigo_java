package com.lineadecodigo.java.xml.sax;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.*;
import javax.xml.parsers.*;

/**
 * @file MiPrimerSAX.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/abril/2010
 * @url    http://lineadecodigo.com/java/acceder-al-xml-con-sax/
 * @description Utilizar SAX para acceder al contenido de un fichero XML.  
 */

public class MiPrimerSAX {
	
	public static void main(String[] args) {
		SAXParser parser = null;
		   
	    String xml = "<libro><titulo>EL Quijote</titulo><autor>Cervantes</autor></libro>";
	    InputStream is = new ByteArrayInputStream(xml.getBytes());

	    try {
	   
	      SAXParserFactory factory = SAXParserFactory.newInstance();
	      parser = factory.newSAXParser();
	      MiManejador manejador = new MiManejador();    
	      parser.parse(is, manejador);
	   
	    } catch (IOException ioe) {
	      System.out.println(ioe.toString());
	    } catch (SAXException se) {
	       System.out.println(se.toString());
	    } catch (ParserConfigurationException pce) {
	      System.out.println(pce.toString());
	    }
	}

}
