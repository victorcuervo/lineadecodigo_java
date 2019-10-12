package com.lineadecodigo.java.swing;

/**
 * @file CentrarJFrame.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   04/octubre/2010
 * @url    http://lineadecodigo.com/java/crear-un-componente-jtextfield/
 * @description Añadir un elemento JTextField a un JFrame
 */

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CrearJTextField extends JFrame {

	private static final long serialVersionUID = 1L;
	
	CrearJTextField(){
		super("Crear un JTextField");
		JTextField input = new JTextField("texto por defecto",20);
		add(input);
		
		setSize(200,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CrearJTextField();

	}

}
