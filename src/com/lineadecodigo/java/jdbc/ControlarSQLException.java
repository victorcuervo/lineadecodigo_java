package com.lineadecodigo.java.jdbc;

/**
 * @file ControlarSQLException.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2016
 * @url  http://lineadecodigo.com/java/controlar-sqlexception/
 * @description Cómo controlar una SQLException y mostrar información relacionada con ella.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ControlarSQLException {
	
	private static void datosError(SQLException sqle) {
		
		System.out.println("Error de Ejecución");
		
		System.out.println("Código de Error: " + sqle.getErrorCode() + "\n" +
				"SLQState: " + sqle.getSQLState() + "\n" +
				"Mensaje: " + sqle.getMessage() + "\n");
		
		
		System.out.println("Causas");
		
		Throwable t = sqle.getCause();
        while(t != null) {
            System.out.println("Causa: " + t + "\n");
            t = t.getCause();
        }
        
        System.out.println("Excepciones Relacionadas");
        
        SQLException ex = sqle.getNextException();
        while (ex != null) {                                      
        	System.out.println("Código de Error: " + sqle.getErrorCode() + "\n" +
    				"SLQState: " + sqle.getSQLState() + "\n" +
    				"Mensaje: " + sqle.getMessage() + "\n");
          }
		
				
							
	}

	public static void main(String[] args) {
		Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";
	    
	    Properties p = new Properties();
	    p.put("user", "root");
	    p.put("password","");

	    try {

	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,p);
	      
	      try {
	   
	        stmt = con.prepareStatement("SELECT pais FROM paises2");
	        rs = stmt.executeQuery();
	   
	        while (rs.next())
	        	System.out.println (rs.getString("pais"));
	        	        
	   
	      } catch (SQLException sqle) { 
	           datosError(sqle);
	      }
	   
	    } catch (Exception e) { 
	      System.out.println("Error en la conexión: " + e.toString() );
	    } finally {
	      try {
	        if (rs!=null) rs.close();
	        if (stmt!=null) stmt.close();
	        if (con!=null) con.close();    
	      } catch (Exception e) {
	        System.out.println("Error cerrando conexiones: " + e.toString());
	      } 
	    } 

	}

}
