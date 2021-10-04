package com.lineadecodigo.java.jdbc;

/**
 * @file ConexionMariaDB.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/marzo/2021
 * @url  http://lineadecodigo.com/java/conectar-a-mariadb-con-java/
 * @description Conexión JDBC a una base de datos MariaDB
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionMariaDB {

    public static void main(String[] args) {
        Connection con = null;
	    
	    String sURL = "jdbc:mariadb://localhost:3306/lineadecodigo";

	    try {

	      con = DriverManager.getConnection(sURL,"victor","victor");

	      try (PreparedStatement stmt = con.prepareStatement("SELECT pais FROM paises")) {

	        // Ejecutamos Query
	        ResultSet rs = stmt.executeQuery();
	   
	        // Recorremos el resultado
	        while (rs.next())
	          System.out.println (rs.getString("pais"));

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
