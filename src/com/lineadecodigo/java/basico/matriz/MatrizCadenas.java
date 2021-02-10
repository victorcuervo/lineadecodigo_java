package com.lineadecodigo.java.basico.matriz;

/**
 * @file RotarMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2020
 * @url    http://lineadecodigo.com/java/matriz-de-cadenas-en-java/
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
    
        String[][] m = {{"Marta","Luis","Nacho"},{"Juancho","Anabel","Julio"},{"María","David","Gema"}};
        imprimirMatriz(m);

        String[][] m2 = new String[3][3];
        m2[0][0] = "Marta";
        m2[0][1] = "Luis";
        m2[0][2] = "Nacho";

        m2[1][0] = "Juancho";
        m2[1][1] = "Anabel";
        m2[1][2] = "Julio";

        m2[2][0] = "María";
        m2[2][1] = "David";
        m2[2][2] = "Gema";
        imprimirMatriz(m2);

    }


}
