package com.lineadecodigo.java.basico.matriz;

/**
 * @file MayorMenorMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/enero/2021
 * @url    http://lineadecodigo.com/java/numero-mayor-y-menor-en-una-matriz/
 * @description Obtener el número mayor y menos además de su posición en una matriz
 */

public class MayorMenorMatriz {
    
    public static void main(String[] args) {
        
        // Matriz
        int[][] matriz = {{29,23,13},{41,57,69},{17,28,39}};
        int numeroMayor = matriz[0][0];
        int numeroMenor = matriz[0][0];

        String mayorPosicion = "0,0";
        String menorPosicion = "0,0";

        for (int x=0;x<matriz.length;x++) {
            for (int y=0;y<matriz[x].length;y++) {

                if (matriz[x][y] > numeroMayor) {
                    numeroMayor = matriz[x][y];
                    mayorPosicion = x + "," + y;
                }

                if (matriz[x][y] < numeroMenor) {
                    numeroMenor = matriz[x][y];
                    menorPosicion = x + "," + y;
                }

            }                
        }

        System.out.println("El número mayor de la matriz es " + numeroMayor + " en la posición " + mayorPosicion);
        System.out.println("El número menor de la matriz es " + numeroMenor + " en la posición " + menorPosicion);
    }
}
