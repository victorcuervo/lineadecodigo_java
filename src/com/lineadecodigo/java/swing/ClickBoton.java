package com.lineadecodigo.java.swing;

/**
 * @file ClickBoton.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   6/noviembre/2016
 * @url    http://lineadecodigo.com/java/click-en-boton-con-java-swing/
 * @description Detectar click sobre un botón en Java Swing
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickBoton extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	private JButton boton;
	
	ClickBoton(){
		super("Click sobre Botón");
		getContentPane().setLayout(new FlowLayout());	
		
		boton = new JButton("Púlsame");
		etiqueta = new JLabel("");
		
		add(boton);
		add(etiqueta);
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado el botón ");			
			}	
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400,100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ClickBoton();

	}

}
