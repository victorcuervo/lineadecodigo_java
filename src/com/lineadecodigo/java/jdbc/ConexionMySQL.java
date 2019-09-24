package com.lineadecodigo.java.jdbc;

/**
 * @file ConexionMySQL.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2016
 * @url  http://lineadecodigo.com/java/conectar-mysql-java/
 * @description Conexión JDBC a MySQL
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionMySQL {

	public static void main(String[] args) {

		Connection con = null;
	    
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";

	    try {

	      con = DriverManager.getConnection(sURL,"root","");

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
