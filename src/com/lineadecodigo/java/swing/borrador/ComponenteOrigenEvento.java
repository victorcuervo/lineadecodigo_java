package com.lineadecodigo.java.swing.borrador;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComponenteOrigenEvento extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	private JButton boton;
	
	ComponenteOrigenEvento(){
		super("Componente origen del Evento");
		getContentPane().setLayout(new FlowLayout());	
		
		boton = new JButton("Botón 1");
		etiqueta = new JLabel("");
		
		add(boton);	
		add(etiqueta);
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton boton = (JButton)e.getSource();
				boton.setText("Me has hecho click");				
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400,80);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ComponenteOrigenEvento();

	}

}
