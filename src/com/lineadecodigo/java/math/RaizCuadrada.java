package com.lineadecodigo.java.math;

import java.util.*;
import java.io.*;

/**
 * @file RaizCuadrada.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   3/febrero/2013
 * @url    http://lineadecodigo.com/java/como-obtener-la-raiz-cuadrada-de-un-numero-con-java/
 * @description Código fuente Java para calcular una raíz cuadrada
 */

public class RaizCuadrada {
    
	//funcion de separacion en tuplas de numeros para procesar la raiz cuadrada
    public static List<Integer> parseNumber(String n){
        List<Integer>  result=new ArrayList<Integer>();
        String number=n.trim();        
        char [] numberChars=number.toCharArray();
        int length=numberChars.length;
        int i=0;
        if(length%2!=0){
            // si hay un numero impar de digitos se toma el primer digito
            result.add(new Integer(new Character(numberChars[0]).toString()));
            i=1;
        }
        for(;i<length;i+=2){
            //se toma los dígitos por pares
            try{
                result.add(new Integer(new Character(numberChars[i]).toString()+
                            new Character(numberChars[i+1]).toString()));                
            }catch(Exception ex){}
        }
        return result;
    }
    
    //funcion de procesar el resto minimo positivo
    public static HashMap minimoPositivo(List<HashMap> lista){
        Integer minimo=Integer.MAX_VALUE;
        int indice=0;
        HashMap result=new HashMap();
        for(HashMap elem:lista){// se recorre toda la lista
            Integer elemento=Integer.parseInt(elem.get("resto").toString());
            if(minimo>elemento && elemento>=0){// se obtiene el minimo positivo
                minimo=elemento;
                indice=Integer.parseInt(elem.get("indice").toString());
            }
        }
        result.put("indice",indice);
        result.put("resto",minimo);
        return result;
    }
    
    //funcion de procesamiento de  tupla 
    public static HashMap procesarRadicacion(Integer tupla,Integer raiz, Integer resto){
        HashMap result=new HashMap();
        List<HashMap> lista=new ArrayList<HashMap>();
        result.put("raiz",0);
        result.put("resto",0);
        Integer radical=raiz*2;
        Integer nuevoresto;        
        Integer numero=0;
        try{
            numero=new Integer(resto.toString()+tupla.toString());
        }catch(Exception ex){
            System.err.println("El numero es demasiado grande no se puede procesar ...");
        }
        Integer nuevaraiz;
        Integer operando;
        for(Integer i=0;i<=9;i++){// se calcula los restos posibles
            operando=raiz*2;
            operando=Integer.parseInt(operando.toString()+i.toString());              
            nuevoresto=numero-(operando*i);
            HashMap hash=new HashMap();
            hash.put("resto",nuevoresto);
            hash.put("indice",i);
            lista.add(hash);
        }
        HashMap Minimo=minimoPositivo(lista);//se obtiene el minimo
        nuevaraiz=new Integer(raiz.toString()+Minimo.get("indice").toString());                                
        result.put("raiz",nuevaraiz.toString());
        result.put("resto",Minimo.get("resto").toString());
        return result;
    }
    
    // funcion de procesamiento de raiz cuadrada
    public static HashMap raizCuadrada(String number){
        HashMap result=new HashMap();
        List<Integer> tuplas=parseNumber(number);// se procesa el numero
        Integer raiz=0;
        Integer resto=0;
        for(Integer tupla:tuplas){//se procesan las tuplas de digitos
            HashMap process=procesarRadicacion(tupla, raiz, resto);
            try{raiz=Integer.parseInt(process.get("raiz").toString());}catch(Exception ex){}
            try{resto=Integer.parseInt(process.get("resto").toString());}catch(Exception ex){}
        }
        result.put("raiz", raiz.toString());
        result.put("resto", resto.toString());
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String num="";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero : ");
        try{num = buffer.readLine();}catch(Exception ex){}
        
        HashMap raiz=raizCuadrada(num);
        System.out.println("numero: "+num);
        System.out.println("raiz: "+raiz.get("raiz").toString());
        System.out.println("resto: "+raiz.get("resto").toString());
    }
}