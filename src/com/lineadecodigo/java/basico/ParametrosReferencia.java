package com.lineadecodigo.java.basico;

/**
 * @file ParametrosReferencia.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   08/septiembre/2015
 * @url  http://lineadecodigo.com/java/parametros-por-referencia-en-java/
 * @description Explicación del uso de parámetros "por referencia" en Java.
 */


public class ParametrosReferencia {

	
	public class MiClase {
		public int valor;
	}
	
	
	public static void metodo_valor(int p) {
		p = 3;
	}
	
	public static void metodo_referencia(MiClase m) {
		m.valor =3;		
	}
	
	public static void metodo_referencia2(MiClase m1) {
		ParametrosReferencia pr = new ParametrosReferencia();		
		MiClase m2 = pr.new MiClase();			
		m1 = m2;
		m1.valor = 3;
	}
	
	
	public static void main(String[] args) {
			
		
		// Parámetros por valor		
		int p = 2;
		System.out.println(p);
		metodo_valor(p);
		System.out.println(p);
		
		// Parámetros por referencia
		ParametrosReferencia pr = new ParametrosReferencia();		
		MiClase m1 = pr.new MiClase();
		m1.valor = 2;
		System.out.println(m1.valor);
		metodo_referencia(m1);
		System.out.println(m1.valor);
		
		
		// Parámetros por referencia 2
		MiClase m2 = pr.new MiClase();
		m2.valor = 2;
		System.out.println(m2.valor);
		metodo_referencia2(m2);
		System.out.println(m2.valor);

	}

}
