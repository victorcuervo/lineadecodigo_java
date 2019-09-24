package com.lineadecodigo.java.basico.validadores;

/**
 * @file ValidadorDeRut.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/diciembre/2010
 * @url    http://lineadecodigo.com/java/validador-de-rut-en-java/
 * @description Validar el RUT chileno
 */



public class ValidadorDeRut {

    /**
     * @param args the command line arguments
     */
    public static Object[] invertir(Object[] array) {
        Object[] invertir_int = new Object[array.length];
        int maximo = array.length;

        for (int i = 0; i < array.length; i++) {
            Object j = array[maximo - 1];
            invertir_int[maximo - 1] = array[i];
            maximo--;
        }
        return invertir_int;
    }


    public boolean isValido(Object rut) throws Exception {
        Object[] array = null;
        int rutSumado = 0;
        boolean is = false;

        if (rut.toString().length() == 9) {
            array = new Object[8];
            int b = 1;

            for (int i = 0; i <= 7; i++) {
                array[i] = rut.toString().substring(i, b);
                b++;
            }
            array = invertir(array);

            int a = 2;
            for (int i = 0; i <array.length; i++) {
                array[i] = Integer.parseInt((String) array[i]) * a;
                rutSumado += Integer.parseInt(String.valueOf(array[i]));
                if (a == 7) {
                    a = 1;
                }
                a++;
            }

            int resto = rutSumado % 11;
            String Digito = String.valueOf(11 - resto);

            for (int i = 0; i < array.length; i++) {
                Object object = array[i];
            }

            if (Digito.equals("11")) {
                Digito = "0";
            }
            if (Digito.equals("10")) {
                Digito = "K";
            }

            String digitoIngresado = rut.toString().substring(8, 9);

            if (digitoIngresado.equals(Digito)) {
                is = true;
            } else {
                is = false;
            }

        } else if (rut.toString().length() == 8) {
            array = new Object[7];
            int b = 1;

            for (int i = 0; i <= 6; i++) {
                array[i] = rut.toString().substring(i, b);
                b++;
            }
            array = invertir(array);

            int a = 2;
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt((String) array[i]) * a;
                rutSumado += Integer.parseInt(String.valueOf(array[i]));
                if (a == 7) {
                    a = 1;
                }
                a++;
            }

            int resto = rutSumado % 11;
            String Digito = String.valueOf(11 - resto);

            for (int i = 0; i < array.length; i++) {
                Object object = array[i];
            }

            if (Digito.equals("11")) {
                Digito = "0";
            }
            if (Digito.equals("10")) {
                Digito = "K";
            }

            String digitoIngresado = rut.toString().substring(7, 8);

            if (digitoIngresado.equals(Digito)) {
                is = true;
            } else {
                is = false;
            }
        } else {
            throw new Exception("Error interno");
        }
        return is;
    }

    public static void main(String args[]) throws Exception {
        ValidadorDeRut a = new ValidadorDeRut();
        System.out.println("Es: " + a.isValido(62820012));
    }
}
