package com.lineadecodigo.java.awt;

/**
 * @file MiFrame.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   24-jun-2007
 * @url    http://lineadecodigo.com/2007/07/01/crear-un-frame-con-awt/
 * @description Crear un frame de AWT desde una aplicación Java  
 */

import java.awt.*;

public class MiFrame {

	public static void main(String[] args) {
		
	   Frame miFrame = new Frame("Mi primer frame");
	
	   // Modificamos el tamaño del frame... 
	   int iAncho = 300;
	   int iAlto = 300;
	   miFrame.setSize(iAncho, iAlto);
	
	   // ...y lo mostramos el frame 
	   miFrame.setVisible(true);

	}

}
