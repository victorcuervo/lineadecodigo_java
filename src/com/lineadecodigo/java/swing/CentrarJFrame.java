package com.lineadecodigo.java.swing;

/**
 * @file CentrarJFrame.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/spetiembre/2010
 * @url    http://lineadecodigo.com/java/centrar-un-jframe/
 * @description Centrar un JFrame en la pantalla.
 */

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CentrarJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public CentrarJFrame(){
		
		super("Centrar JFrame");	
	
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width/2, height/2);		
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CentrarJFrame();
	}

}
