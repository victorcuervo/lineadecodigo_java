package com.lineadecodigo.java.applet;

/**
 * @file MiPrimerApplet.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   2/enero/2007
 * @url		http://lineadecodigo.com/java/mi-primer-applet/
 * @description Creación de un applet en Java
 */

import java.applet.Applet;
import java.awt.Graphics;

public class MiPrimerApplet extends Applet {

	private static final long serialVersionUID = 1L;


	public MiPrimerApplet() {
		super();
	}

	public void init() {
		this.setSize(150, 200);

	}
	
	public void paint(Graphics g){
		g.drawString("Este es mi primer applet",30,30);
	}

}
