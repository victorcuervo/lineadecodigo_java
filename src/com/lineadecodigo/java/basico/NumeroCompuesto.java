package com.lineadecodigo.java.basico;

/**
 * @file NumeroCompuesto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2020
 * @url    http://lineadecodigo.com/java/numero-compuesto-en-java/
 * @description Calcula si un número es compuesto
 */

public class NumeroCompuesto {

    public static boolean esCompuesto(int numero) {

        int contador=2;
        
        while (contador < numero) {
            if (numero % contador == 0)
                return true;
            contador++;
        }

        return false;

    }

    public static void main(String[] args) {
        
        // Primos
        System.out.println(esCompuesto(2));
        System.out.println(esCompuesto(79));

        // Compuestos
        System.out.println(esCompuesto(10));
        System.out.println(esCompuesto(64));

        // No Válidos
        System.out.println(esCompuesto(1));
        System.out.println(esCompuesto(-8));

        int numero = 14;
        int contador = 2;
        boolean compuesto = false;

        while ((contador < numero) && !(compuesto)) {
        if (numero % contador == 0)
            compuesto = true;
        contador++;
        }

        if (compuesto)
        System.out.println("El número " + numero + " es compuesto. Y se puede componer multiplicando " + --contador + " y " + numero/contador);


    }
    
}
