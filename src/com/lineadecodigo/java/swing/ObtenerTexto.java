package com.lineadecodigo.java.swing;

/**
 * @file BotonPulsado.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/noviembre/2015
 * @url    http://lineadecodigo.com/java/obtener-texto-jtextfield/
 * @description Otener el contenido insertado por el usuario en un JTextField
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ObtenerTexto extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	ObtenerTexto(){
		super("Obtener Texto JTextField");
		getContentPane().setLayout(new FlowLayout());	
		
		JTextField input = new JTextField("texto por defecto",20);
		
		
		JButton boton = new JButton("Obtener Texto");
		JLabel etiqueta = new JLabel("");
		
		add(input);
		add(boton);
		add(etiqueta);
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recuperamos el contenido del Campo de Texto y lo volcamos sobre la etiqueta
				etiqueta.setText(input.getText());				
			}
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ObtenerTexto();

	}

}
