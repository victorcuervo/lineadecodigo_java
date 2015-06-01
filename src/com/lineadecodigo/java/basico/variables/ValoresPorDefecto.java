package com.lineadecodigo.java.basico.variables;

/**
 * @file VariablesTransitorias.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/tipos-primitivos-de-datos-en-java/
 * @description Explicaci—n sobre el funcionamiento del argumento transient
 */

public class ValoresPorDefecto {
	
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;

	void print(String s) {
		System.out.println(s);
	}

	void imprimirValoresIniciales() {
		print("Tipo Variable\tValor Inicial");
	    print("boolean\t\t" + t);
	    print("char\t\t[" + c + "]");
	    print("byte\t\t" + b);
	    print("short\t\t" + s);
	    print("int\t\t" + i);
	    print("long\t\t" + l);
	    print("float\t\t" + f);
	    print("double\t\t" + d);
	}

	public static void main(String[] args) {
		
		ValoresPorDefecto vpf = new ValoresPorDefecto();
		vpf.imprimirValoresIniciales();		
	}
}
