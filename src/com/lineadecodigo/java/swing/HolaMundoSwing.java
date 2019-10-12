package com.lineadecodigo.java.swing;

/**
 * @file HolaMundoSwing.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   1/junio/2010
 * @url    http://lineadecodigo.com/java/hola-mundo-con-swing/
 * @description Reemplazar contenido de un texto  
 */

import javax.swing.*;

public class HolaMundoSwing extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public HolaMundoSwing(){
		super("Hola Mundo");
		
		JLabel label = new JLabel("Hola Mundo");
		getContentPane().add(label);
		
		setSize(200,100);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new HolaMundoSwing();
	}

}
