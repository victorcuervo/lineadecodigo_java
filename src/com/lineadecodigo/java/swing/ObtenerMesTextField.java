package com.lineadecodigo.java.swing;

/**
 * @file ObtenerMesTextField.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/agosto/2023
 * @url    http://lineadecodigo.com/java/pdte/
 * @description Obtener el mes en formato texto de una fecha introducida en un textfield
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class ObtenerMesTextField extends JFrame {

	private static final long serialVersionUID = 1L;

	public ObtenerMesTextField() {
		super("Obtener Mes JTextField");	
		
		getContentPane().setLayout(new FlowLayout());
		

		JLabel label = new JLabel("Pon una fecha");


		// Campo de Entrada con Formato y el día de hoy
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		JFormattedTextField textfield = new JFormattedTextField(format);
		textfield.setColumns(10);				
		textfield.setValue(new Date());			

		JButton boton = new JButton("Extraer Mes");		
		JLabel labelMes = new JLabel("El mes es...");
		
		getContentPane().add(label);
		getContentPane().add(textfield);
		getContentPane().add(boton);
		getContentPane().add(labelMes);
		
			
		setSize(400,300);
		setVisible(true);

		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recuperamos el contenido del Campo de Texto y lo volcamos sobre la etiqueta
				
				try {
					Date userDate = format.parse(textfield.getText());			
					Calendar calendario = Calendar.getInstance();
					calendario.setTime(userDate);
					DateFormatSymbols dfs = new DateFormatSymbols();
    				String[] months = dfs.getMonths();
					labelMes.setText("El mes es: " + months[calendario.get(Calendar.MONTH)]);	

				} catch (java.text.ParseException pe) {
					pe.printStackTrace();
				}
				
			}
		});

		// Gestionamos Cierre de la Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	public static void main(String argv[]) {
	    new ObtenerMesTextField();
	  }

}
