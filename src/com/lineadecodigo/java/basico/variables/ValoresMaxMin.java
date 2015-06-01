package com.lineadecodigo.java.basico.variables;

/**
 * @file VariablesTransitorias.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/valores-maximo-y-minimo-de-los-tipos-primitivos-java/
 * @description Mostrar valores m‡ximo y m’nimo de los tipos de datos primitivos en Java
 */

public class ValoresMaxMin {
	
	public static void main(String[] args) {
	
		System.out.println("Tipo\tM’nimo\tM‡ximo");
		System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
		System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
		System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
		System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
		System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
		System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
	    
	}

}
