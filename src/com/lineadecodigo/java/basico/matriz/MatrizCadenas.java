package com.lineadecodigo.java.basico.matriz;

/**
 * @file RotarMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2020
 * @url    http://lineadecodigo.com/java/pdte/
 * @description Crea una Matriz de Cadenas
*/

public class MatrizCadenas {
    
    public static void imprimirMatriz(String[][] matriz) {
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
    }

    public static void main(String[] args) {
    
        String[][] matriz = {{"Marta","Luis","Nacho"},{"Juancho","Anabel","Julio"},{"Maria","David","Gema"}};
        imprimirMatriz(matriz);

    }


}
