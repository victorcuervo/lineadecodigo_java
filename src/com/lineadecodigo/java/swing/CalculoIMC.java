package com.lineadecodigo.java.swing;

/**
 * @file CalculoIMC.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/diciembre/2012
 * @url    http://lineadecodigo.com/java/calcular-el-indice-de-masa-corporal-con-java/
 * @description Calculo del índice de masa corporal.
 */

import javax.swing.JOptionPane;
import javax.swing.*;

class CalculoIMC {
	public static void main(String[] args) {
		// instanciar clase
		Persona persona = new Persona();
		// usar los atributos
		persona.nombre = JOptionPane.showInputDialog("nombre: ");
		persona.edad = Integer.parseInt(JOptionPane.showInputDialog("edad: "));
		persona.peso = Double
				.parseDouble(JOptionPane.showInputDialog("peso: "));
		persona.talla = Double.parseDouble(JOptionPane
				.showInputDialog("talla: "));

		// concatenación
		persona.asignar(persona.nombre, persona.edad, persona.peso,
				persona.talla).verDatos();

	}
}

class Persona {
	public String nombre;
	public int edad;
	public double peso, talla;

	Persona asignar(String n, int e, double p, double t) {
		nombre = n;
		edad = e;
		peso = p;
		talla = t;
		return this;
	}

	Persona verDatos() {
		String res = "Datos\n";
		res += "\nnombre: " + nombre;
		res += "\nedad: " + edad;
		res += "\npeso: " + peso;
		res += "\ntalla: " + talla;
		res += "\nIMC obtenido es: " + imc();
		res += "\nClasificacion obtenida es: " + clasificacion();
		JOptionPane.showMessageDialog(null, res, "Resultado",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon("fer.jpg"));
		return this;
	}

	public double imc() {
		return peso / (talla * talla);
	}

	public String clasificacion() {
		String cad = "";
		if (imc() < 16.00) {

			cad = "Infrapeso: Delgadez Severa";

		} else if (imc() <= 16.00 || imc() <= 16.99) {
			cad = "Infrapeso: Delgadez moderada";
		} else if (imc() <= 17.00 || imc() <= 18.49) {
			cad = "Infrapeso: Delgadez aceptable";
		} else if (imc() <= 18.50 || imc() <= 24.99) {
			cad = "Peso Normal";
		} else if (imc() <= 25.00 || imc() <= 29.99) {
			cad = "Sobrepeso";
		} else if (imc() <= 30.00 || imc() <= 34.99) {
			cad = "Obeso: Tipo I";
		} else if (imc() <= 35.00 || imc() <= 40.00) {
			cad = "Obeso: Tipo II";
		} else if (imc() >= 40.00) {
			cad = "Obeso: Tipo III";
		} else {
			cad = "no existe clasificacion";
		}
		return cad;
	}

}