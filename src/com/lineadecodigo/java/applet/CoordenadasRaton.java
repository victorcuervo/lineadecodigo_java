package com.lineadecodigo.java.applet;

/**
 * @file CoordenadasRaton.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   4/marzo/2008
 * @url		http://lineadecodigo.com/java/controlar-las-coordenadas-del-raton-en-un-applet/
 * @description Applet que muestra las coordenadas del ratón por pantalla. 
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CoordenadasRaton extends Applet implements MouseMotionListener {

	private static final long serialVersionUID = 1L;

	
	  public void init() {
	    super.init();
	    addMouseMotionListener(this);
	  }

	  public void mouseDragged(MouseEvent e) {
	    showStatus("Botón pulsado");
	  }

	  public void mouseMoved(MouseEvent e) {
	    showStatus("Posición del puntero X:" 
	    + Integer.toString(e.getX()) + " Y:"
	    + Integer.toString(e.getY()));
	  }

	  public void paint(Graphics g) {
	    super.paint(g);
	  }

	
}
