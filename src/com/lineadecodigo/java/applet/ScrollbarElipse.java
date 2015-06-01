package com.lineadecodigo.java.applet;

/**
 * @file ScrollbarElipse.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   9/enero/2015
 * @url		http://lineadecodigo.com/java/scrollbars-y-elipse/
 * @description Manejo de scrollbars dentro de un Applet para modificar el tama–o de una Elipse.
 */

import java.applet.Applet;
import java.awt.Adjustable;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarElipse extends Applet {
	
	private static final long serialVersionUID = 1L;
	
	int ancho;
	int alto;


	public ScrollbarElipse() {
		super();
	}

	public void init() {
		
		Scrollbar v,h;
		 
		v = new Scrollbar(Scrollbar.VERTICAL,0,0,0,400);
		add("East",v);
		 
		h = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,200);
		add("South",h);
		
		
		v.addAdjustmentListener(new ManejadorEventos());
		h.addAdjustmentListener(new ManejadorEventos());
		
		// Inicializo alto y ancho
		ancho = 20;
		alto = 10;

	}
	
	public void paint(Graphics g){
		g.drawOval(10,10,ancho,alto); 
	}
	
	class ManejadorEventos implements AdjustmentListener {
		 
		  Applet ventana;
		 
		  ManejadorEventos () {
			// Obtenemos referencia a la clase padre
		    this.ventana = ScrollbarElipse.this; 
		  }
		 
		  
		  public void adjustmentValueChanged (AdjustmentEvent evt)    {
		 
			// MŽtodo manejador del evento
			  
		    if (evt.getAdjustable().getOrientation() == Adjustable.HORIZONTAL)
		      ancho = evt.getValue(); 
		    else
		      alto = evt.getValue();
		 
		    ventana.repaint();
		  }
		}

}
