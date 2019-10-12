package com.lineadecodigo.java.swing;

/**
 * @file CerrarVenatana.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   4/junio/2010
 * @url    http://lineadecodigo.com/java/cerrar-una-ventana-con-java-swing/
 * @description Gestionar el cierre de una ventana en Java Swing
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CerrarVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public CerrarVentana(){
		super("Hola Mundo");
		
		JLabel label = new JLabel("Hola Mundo");
		getContentPane().add(label);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("adios");
				System.exit(0);
			}
		});
		
		
		
		setSize(200,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
			new CerrarVentana();
	}

}
