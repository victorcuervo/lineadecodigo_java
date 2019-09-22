package com.lineadecodigo.java.awt;

/**
 * @file CerrarUnFrame.java
 * @version 1.3
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/diciembre/2007
 * @url    http://lineadecodigo.com/java/cerrar-un-frame-en-awt/
 * @description Crear un frame de AWT desde una aplicación Java y controlar el evento windowClosing
 * 				para cerrar el frame.
 */

import java.awt.Frame;
import java.awt.event.*;

public class CerrarUnFrame {

	public static void main(String[] args) {
		
		   Frame miFrame = new Frame("Mi primer frame");
		
		   // Modificamos el tamaño del frame... 
		   int iAncho = 300;
		   int iAlto = 300;
		   miFrame.setSize(iAncho, iAlto);
		
		   // ...y lo mostramos el frame 
		   miFrame.setVisible(true);
		   
		   miFrame.addWindowListener(new WindowAdapter(){
			      public void windowClosing(WindowEvent we){
			        System.exit(0);
			      }
			    });

		}

}
