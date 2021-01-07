package com.lineadecodigo.java.math;

/**
 * @file AreaTrianguloEscaleno.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/septiembre/2020
 * @url    http://lineadecodigo.com/java/area-de-un-triangulo-escaleno-con-los-lados/
 * @description Uso de la formula de Heron para el cálculo del área de un triángulo escaleno 
 */


public class AreaTrianguloEscaleno {
    
    public static void main(String[] args) {
        
        // Longitud de los lados
        double lado1 = 3;
        double lado2 = 2;
        double lado3 = 4;

        double semiperimetro = (lado1+lado2+lado3)/2;
        System.out.println("El semiperímetro es de " + semiperimetro);

        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));

        System.out.println ("El área del triángulo escaleno es " + area);

    }
}
