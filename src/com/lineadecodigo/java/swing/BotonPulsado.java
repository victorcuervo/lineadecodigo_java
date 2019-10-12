package com.lineadecodigo.java.swing;

/**
 * @file BotonPulsado.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/noviembre/2015
 * @url    http://lineadecodigo.com/java/detectar-boton-pulsado-java-swing/
 * @description Detectar qué botón fue pulsado.
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BotonPulsado extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	private JButton b1, b2, b3;
		
	BotonPulsado(){
		super("¿Qué botón es Pulsado?");
		getContentPane().setLayout(new FlowLayout());	
		
		b1 = new JButton("Botón 1");
		b2 = new JButton("Botón 2");
		b3 = new JButton("Botón 3");
				
		etiqueta = new JLabel("");
		
		add(b1);
		add(b2);
		add(b3);	
		add(etiqueta);
		
		
		b1.addActionListener(new BotonPulsadoListener());
		b2.addActionListener(new BotonPulsadoListener());
		b3.addActionListener(new BotonPulsadoListener());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400,300);
		setVisible(true);
		
	}
	
	private class BotonPulsadoListener implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e) {
			etiqueta.setText("Has pulsado el botón " + e.getActionCommand());			
		}					
	}
	
	public static void main(String[] args) {
		new BotonPulsado();

	}

}
