package com.lineadecodigo.java.jdbc;

/**
 * @file ConexionBaseDatosMSAccess.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   27/noviembre/2006
 * @url  http://lineadecodigo.com/java/jdbc-conectarse-a-una-base-de-datos-ms-access/
 * @description Realizar una conexión a una BD MS Access mediante ODBC.
 */

import java.sql.*;

public class ConexionBaseDatosMSAccess {

	public static void main(String[] args) {
		
		Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
	    String sURL = "jdbc:odbc:DSN_LineaDeCodigo";

	    try {

	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,"root","");

	      try {

	        // La Query
	        stmt = con.prepareStatement("SELECT pais FROM paises");
	        rs = stmt.executeQuery();
	   
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
	        if (rs!=null) rs.close();
	        if (stmt!=null) stmt.close();
	        if (con!=null) con.close();    
	      } catch (Exception e) {
	        System.out.println("Error cerrando conexiones: "
	         + e.toString());
	      } 
	    } 
	}

}
