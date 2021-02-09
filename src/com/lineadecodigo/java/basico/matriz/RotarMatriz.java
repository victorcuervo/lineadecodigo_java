package com.lineadecodigo.java.basico.matriz;

/**
 * @file RotarMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2020
 * @url    http://lineadecodigo.com/java/rotar-una-matriz/
 * @description Rota una matriz 90º en sentido horario
 *  |1      2       3|              |7      4       1|
*   |4      5       6|      =>      |8      5       2|
*   |7      8       9|              |9      6       3|
*/

public class RotarMatriz {
    
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


    public static int[][] rotarMatriz90(int[][] matriz) {

        int tamanio = matriz.length;
        int[][] nuevamatriz = new int[tamanio][tamanio];

        for (int x=0;x<tamanio;x++) {
            for (int y=0;y<tamanio;y++) {
                nuevamatriz[y][tamanio-1-x] = matriz[x][y];
            }
        }

        return nuevamatriz;
    }

    public static void main(String[] args) {
    
        System.out.println("Matriz Original");
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirMatriz(matriz);

        System.out.println("Matriz Rotada 90º");
        int[][] matrizRotada = rotarMatriz90(matriz);
        imprimirMatriz(matrizRotada);

    }


}
