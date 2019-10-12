package com.lineadecodigo.java.swing;

/**
 * @file VentanaConEstilo.java
 * @version 1.0
 * @author PabloRuiz (http://lineadecodigo.com)
 * @date   09/octubre/2010
 * @url    http://lineadecodigo.com/java/ventanas-con-estilo-gracias-a-substances/
 * @description Utilización de substances para dar estilo a un JFrame
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jvnet.substance.SubstanceLookAndFeel;

public class VentanaConEstilo {

	private JFrame Frame_principal;
	private JTextField textField_texto;
	private JButton button_saludo;
	 
	public VentanaConEstilo(){
		inicializar();
	    agregarComponentes();
	    asignarEventos();
	}
	 
	public void inicializar(){
		Frame_principal = new JFrame("Sethcrofts para http://www.lineadecodigo.com");
	    textField_texto = new JTextField();
	    textField_texto.setColumns(40);
	    button_saludo = new JButton("Saludar");
	}
	 
	public void agregarComponentes(){
	    Frame_principal.add(textField_texto);
	    Frame_principal.add(button_saludo);
	    Frame_principal.setLayout(new FlowLayout());
	    Frame_principal.setVisible(true);
	    Frame_principal.setResizable(false);
	    Frame_principal.pack();
	}
	 
	public void asignarEventos(){
	    button_saludo.addActionListener(new ActionListener() {
	      
	    	public void actionPerformed(ActionEvent e) {
	    		if(textField_texto.getText().equalsIgnoreCase("")){
	    			JOptionPane.showMessageDialog(null, "Ingrese un nombre.");
	    		}else{
	    			JOptionPane.showMessageDialog(null, "Hola: "+textField_texto.getText());
	    		}
	    	}
	    });
	  }
		
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
		    public void run() {
		      try {
		        JFrame.setDefaultLookAndFeelDecorated(true);
		        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
		        new VentanaConEstilo();
		      } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Error: "+e);
		      }
		    }
		  });	
	}
}
