package com.lineadecodigo.java.math;

/**
 * @file VolumenCono.java
 * @version 1.0
 * @author Ariel Carraro (http://lineadecodigo.com)
 * @date   14-junio-2013
 * @url    http://lineadecodigo.com/java/calcular-el-volumen-de-un-cono-en-java/
 * @description Programa que realizar el c‡lculo matem‡tico del volumen de un cono en Java.
 */

import javax.swing.*;

public class VolumenCono {

	public static double volumen(double r,double h){
        return (Math.PI*(r*r)*h)/3;
    }
	
	public static void main(String[] args) {

		try {
			double radio = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce radio:"));
			double altura = Double.parseDouble(JOptionPane
					.showInputDialog("Introduce altura:"));
			JOptionPane.showMessageDialog(
					null,
					"Volumen obtenido\n"
							+ String.valueOf(volumen(radio, altura)), "Aviso",
					JOptionPane.PLAIN_MESSAGE, new ImageIcon("imagen.jpg"));
			System.exit(0);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getCause().toString(),
					"Aviso", JOptionPane.ERROR_MESSAGE, new ImageIcon(
							"ferd.jpg"));
		}

	}

}
