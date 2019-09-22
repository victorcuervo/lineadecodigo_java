package com.lineadecodigo.java.awt;

/**
 * @file DobleClick.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   24/junio/2007
 * @url    http://lineadecodigo.com/java/detectando-un-doble-click-con-awt/
 * @description   Utilizar un manejador de eventos para detectar un doble click o triple click en un applet.
 */

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Label;

public class DobleClick extends Applet {

	private static final long serialVersionUID = 1L;
	private Label label1 = null;
	
	public DobleClick() {
		super();
	}

	public void init() {
		label1 = new Label();
		label1.setText("Haz doble click o triple click sobre el applet");
		this.setSize(300, 200);
		this.add(label1, null);
		
		// Añadimos el manejador
		ManejoClicks mC = new ManejoClicks();
	    this.addMouseListener(mC);

	}
	
	class ManejoClicks extends MouseAdapter {
	       public void mouseClicked(MouseEvent evt) {
	         if (evt.getClickCount() == 3) {
	           showStatus ("Se ha producido un triple click");
	         } else if (evt.getClickCount()==2) {
	           showStatus ("Se ha producido un doble click");
	         }
	       }
	}

}
