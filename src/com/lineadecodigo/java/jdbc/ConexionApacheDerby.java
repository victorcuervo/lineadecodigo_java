package com.lineadecodigo.java.jdbc;

/**
 * @file ConexionApacheDerby.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/octubre/2016
 * @url  http://lineadecodigo.com/java/conexion-java-con-derby/
 * @description Conexión JDBC a Apache Derby
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConexionApacheDerby {

	public static void main(String[] args) {
		
		Connection con = null;
	    
	    String sURL = "jdbc:derby:memory:myDB;create=true";

	    try {

	      con = DriverManager.getConnection(sURL);	      	      
	      
	      // Creamos la tabla
	      PreparedStatement tabla = con.prepareStatement("CREATE TABLE country (country varchar(100) not null)");
	      tabla.execute();
	      
	      // Insertamos datos	      
	      Statement carga = con.createStatement();
	      carga.addBatch("INSERT INTO country VALUES ('Spain')");
	      carga.addBatch("INSERT INTO country VALUES ('France')");
	      carga.addBatch("INSERT INTO country VALUES ('United States')");
	      carga.addBatch("INSERT INTO country VALUES ('Brazil')");
	      carga.addBatch("INSERT INTO country VALUES ('Japan')");	     
	      carga.executeBatch();

	      try (PreparedStatement stmt = con.prepareStatement("SELECT country FROM country")) {

	        // Ejecutamos Query
	        ResultSet rs = stmt.executeQuery();
	   
	        // Recorremos el resultado
	        while (rs.next())
	          System.out.println (rs.getString("country"));

	      } catch (SQLException sqle) { 
	           System.out.println("Error en la ejecución:" 
	             + sqle.getErrorCode() + " " + sqle.getMessage());    
	      }
	   
	    } catch (Exception e) { 
	      System.out.println("Error en la conexión:" + e.toString() );
	    } finally {
	      try {
	        // Cerramos posibles conexiones abiertas
	        if (con!=null) con.close();    
	      } catch (Exception e) {
	        System.out.println("Error cerrando conexiones: "
	         + e.toString());
	      } 
	    } 

	}

}
