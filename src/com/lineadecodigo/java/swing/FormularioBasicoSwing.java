package com.lineadecodigo.java.swing;

/**
 * @file FormularioBasicoSwing.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   3/junio/2010
 * @url    http://lineadecodigo.com/java/formulario-basico-con-java-swing/
 * @description Crea un formilario básico (etiqueta, campo de texto y botón con Java Swing.
 */

import java.awt.FlowLayout;
import javax.swing.*;

public class FormularioBasicoSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	public FormularioBasicoSwing() {
		super("Formulario Básico");	
		
		 getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Introduce tu nombre:");
		JTextField textfield = new JTextField("nombre",20);
		JButton boton = new JButton("Enviar");
		getContentPane().add(label);
		getContentPane().add(textfield);
		getContentPane().add(boton);
			
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String argv[]) {
	    new FormularioBasicoSwing();
	  }

}
