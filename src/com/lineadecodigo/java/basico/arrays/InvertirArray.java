package com.lineadecodigo.java.basico.arrays;

/**
 * @file InvertirArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7/marzo/2012
 * @url    http://lineadecodigo.com/java/invertir-array/
 * @description Dos formas de inicializar un array.  
 */

public class InvertirArray {

	private static Object[] invertir_int;

    public static void invertir(Object[] array) {
        invertir_int = new Object[array.length];
        int maximo = array.length;

        for (int i = 0; i<array.length; i++) {           
            invertir_int[maximo - 1] = array[i];
            maximo--;
        }
    }

    public static Object[] getArreglo_invertido() {
        return InvertirArray.invertir_int;
    }
	
	public static void main(String[] args) {
		Object[] arreglo = new Object[5];

        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 2;
        arreglo[3] = 3;
        arreglo[4] = 4;

        for (int i = 0; i<arreglo.length; i++) {
            Object j = arreglo[i];
            System.out.println("Arreglo Normal: " + j);
        }

        try {
            invertir(arreglo);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

        for (int i = 0; i<invertir_int.length; i++) {
            Object j = invertir_int[i];
            System.out.println("Arreglo invertido: " + j);
        }

	}

}
