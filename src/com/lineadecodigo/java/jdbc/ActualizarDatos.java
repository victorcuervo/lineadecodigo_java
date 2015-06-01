package com.lineadecodigo.java.jdbc;

/**
 * @file ActualizarDatos.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   27-marzo-2011
 * @url  http://lineadecodigo.com/java/actualizar-datos-con-jdbc/
 * @description Utilización de JDBC y una sentencia UPDATE para actualizar los datos de una base de datos.  
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActualizarDatos {

	public static void main(String[] args) {
		Connection con = null;
	    PreparedStatement stmt = null;
		
		// Definimos el driver y la url
	    String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";
	    
	    // Cargamos el driver y realizamos la conexión
	    try{
		Class.forName(sDriver).newInstance();    
		con = DriverManager.getConnection(sURL,"root","");		      
		      
		stmt = con.prepareStatement("UPDATE paises SET pais=? WHERE codigo=?");
		stmt.setString(1,"España");
		stmt.setString(2,"ES");

		int retorno = stmt.executeUpdate();
				      		
		if (retorno>0) {
			System.out.println("Actualización ejecutada correctamente");	
		}
		
		      
		      
	    } catch (SQLException sqle){
	    	System.out.println("SQLState: " 
			+ sqle.getSQLState());
	    	System.out.println("SQLErrorCode: " 
			+ sqle.getErrorCode());
	    	sqle.printStackTrace();
	    	
	    } catch (Exception e){
	    	e.printStackTrace();
	    } finally {
	    	if (con != null) {
	    		try{
	  	      		stmt.close();
	  	      		con.close();
	    		} catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    }		

	}

}
