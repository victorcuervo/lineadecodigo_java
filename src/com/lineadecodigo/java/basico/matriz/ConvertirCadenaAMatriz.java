package com.lineadecodigo.java.basico.matriz;

/**
 * @file CrearMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/marzo/2010
 * @url    http://lineadecodigo.com/java/rellenar-una-matriz-con-una-cadena-en-java/
 * @description Programa que nos permite convertir una cadena en una matriz
 * 
 *              cadena = "Soy una cadena de texto."
 *              matriz = s   a a n d t t 
 *                       o u   d a e e o
 *                       y n c e     x .
 */                     

public class ConvertirCadenaAMatriz {

    public static void main(String[] args) {

        String texto = "Soy una cadena de texto.";

        // Asumimos que la matriz tiene tres filas y las columnas son variables.
        // Así que el número de columnas será el tamaño dividido entre 3
        // En caso de ser un número decimal buscaremos el valor entero superior

        int tamanio = texto.length();
        int columnas = (int)Math.ceil((float)tamanio/3);
        char[][] matriz = new char[3][columnas];

        int columna = 0;
        int fila = 0;


        for (int x=0;x<tamanio;x++) {

            // Las columnas se calculan diviendo entre tres
            // Y las filas con el resto de dividir entre tres

            columna = x/3;
            fila = x%3;
            matriz[fila][columna] = texto.charAt(x);            
        }


        // Imprimimos la matriz
		for (int x=0; x < matriz.length; x++) {
			System.out.print("|");
			for (int y=0; y < matriz[x].length; y++) {
				System.out.print (matriz[x][y]);
				if (y!=matriz[x].length-1) System.out.print("\t");
			}
			System.out.println("|");
		}

        
    }
    
}
