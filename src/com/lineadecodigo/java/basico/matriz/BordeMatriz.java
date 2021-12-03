package com.lineadecodigo.java.basico.matriz;

/**
 * @file CrearMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/diciembre/2021
 * @url    http://lineadecodigo.com/java/pdte/
 * @description Código que nos muestra los números del borde de la matríz
 */          

public class BordeMatriz {
    
    public static void main(String[] args) {
        
        int[][] matriz = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("La matriz es de " + filas + "x" + columnas );

        System.out.println("--");
        // Primera fila
        for (int x=0;x<columnas;x++)
            System.out.println(matriz[0][x]);

        System.out.println("--");
        // Última Columna
        for (int x=1;x<filas;x++)
            System.out.println(matriz[x][columnas-1]);

        System.out.println("--");
        // Última Columna
        for (int x=columnas-2;x>=0;x--)
            System.out.println(matriz[filas-1][x]);

        System.out.println("--");
            // Primera Columna
        for (int x=filas-2;x>0;x--)
            System.out.println(matriz[x][0]);

            

    }
}
