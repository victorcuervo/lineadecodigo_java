package com.lineadecodigo.java.basico.matriz;

/**
 * @file RotarMatriz90Antihorario.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2020
 * @url    http://lineadecodigo.com/java/rotar-matriz-a-la-izquierda/
 * @description Rota una matriz 90º en sentido anti horario
 * |1      2       3|              |3      6       9|
 * |4      5       6|      =>      |2      5       8|
 * |7      8       9|              |1      4       7|
*/

public class RotarMatriz90Antihorario {
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
    }


    public static int[][] rotarMatriz90Antihorario(int[][] matriz) {

        int tamanio = matriz.length;
        int[][] nuevamatriz = new int[tamanio][tamanio];

        for (int x=0;x<tamanio;x++) {
            for (int y=0;y<tamanio;y++) {
                nuevamatriz[tamanio-1-y][x] = matriz[x][y];
            }
        }

        return nuevamatriz;
    }


    public static void main(String[] args) {
    
        System.out.println("Matriz Original");
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirMatriz(matriz);

        System.out.println("Matriz Rotada 90º Antihoraria");
        int[][] matrizRotada = rotarMatriz90Antihorario(matriz);
        imprimirMatriz(matrizRotada);
    }

}
