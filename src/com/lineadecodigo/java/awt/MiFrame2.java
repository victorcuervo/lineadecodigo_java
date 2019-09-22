package com.lineadecodigo.java.awt;

/**
 * @file MiFrame2.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   24/junio/2007
 * @url    http://lineadecodigo.com/2007/07/01/crear-un-frame-con-awt/
 * @description Clase que extiende de Frame convirtiendose en un frame. Esta clase se autoinstancia.
 */

import java.awt.Frame;

public class MiFrame2 extends Frame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		MiFrame2 miFrame = new MiFrame2("Mi primer frame2");
	}

	public MiFrame2() {
		super();
		initialize();
	}

	private void initialize() {
		this.setSize(300, 200);
		this.setTitle("Frame");
	}
	
	public MiFrame2(String title) {
		super(title);
		int iAncho = 300;
	  	int iAlto = 300;
	  	this.setSize(iAncho, iAlto);
	  	this.setVisible(true);
	}

}
