package com.lineadecodigo.java.math;

/**
 * @file AreaCubo.java
 * @version 1.0
 * @author Ariel Carraro
 * @date   13/diciembre/2013
 * @url		http://lineadecodigo.com/java/calcular-el-area-de-un-cubo-en-java/
 * @description Cálculo del área lateral y total de un cubo usando clases abstractas y derivadas
 */

public class AreaCubo{
//creamos un miembro de tipo Area
   Area area;
  public AreaCubo(){}
 
   public AreaCubo(Area ar){
    this.area=ar;
   }
 
   public void verAreaLateral(){
      System.out.println("area lateral obtenida: "+area.areaLateral());
  }
   public void verAreaTotal(){
    System.out.println("area total obtenida: "+area.areaTotal());
  }
 
  public static void main(String[] args){
    //clase abtracta y la clase extendida
     Area area= new Cubo(10); //le asignamos el valor 10
   
     AreaCubo areaCubo=new AreaCubo(area);    
     //visualizar área lateral
     areaCubo.verAreaLateral();
    //visualizar área total
     areaCubo.verAreaTotal();
   
 }
 
}
 
abstract class Area{
   public abstract double areaLateral();
   public abstract double areaTotal();
}
 
class Cubo extends Area{
private double arista;

public Cubo(){}

public Cubo(double ar){
  this.arista=ar;
}
 
@Override
public double areaLateral(){
 return 4*Math.pow(arista,2);
}
   
@Override
public double areaTotal(){
 return 6*Math.pow(arista,2);
}
 
}