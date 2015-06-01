package com.lineadecodigo.java.math;

/**
 * @file CalcularSectorCircular.java
 * @version 1.0
 * @author Fer Carraro
 * @date   20-julio-2013
 * @url    
 * @description Calcular el sector circular de una circunferencia en Java
 */


import java.util.Scanner;

public class CalcularSectorCircular{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Sector sector=null;
    double r=0.0, l=0.0;
    System.out.print("Introduce el valor del radio: ");
    r=in.nextDouble();
    System.out.print("Introduce la longitud del arco: ");
    l=in.nextDouble();
    sector=new Sector(r,l);
    sector.ver();
  }
}

class Sector{
   private double radio;
   private double arco;

  public Sector(double radio,double arco){
    this.radio=radio;
    this.arco=arco;
  }

  public double getRadio(){
    return radio;
  }

  public double getArco(){
    return arco;
  }


  public double calculaAngulo(){
    return arco/radio;
  }

 public double calculaSector(){
    return ((radio*radio)*calculaAngulo())/2;
  }


  @Override
  public String toString(){
    return "Sector{radio: "+getRadio()+ ",arco:"+getArco()+", sector circular obtenido: "+calculaSector()+"}";
  }

  public void ver(){
    System.out.print(toString());
  }  
}