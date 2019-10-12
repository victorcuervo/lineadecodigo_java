package com.lineadecodigo.java.swing.borrador;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CuandoFuePulsadoBoton extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	private JButton boton;
	
	CuandoFuePulsadoBoton(){
		super("¿Cuándo fue pulsado el botón?");
		getContentPane().setLayout(new FlowLayout());	
		
		boton = new JButton("Botón 1");
		
		etiqueta = new JLabel("");
		
		add(boton);
		add(etiqueta);
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Pulsaste el botón: " + new Date(e.getWhen()).toString());				
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
		new CuandoFuePulsadoBoton();

	}

}
