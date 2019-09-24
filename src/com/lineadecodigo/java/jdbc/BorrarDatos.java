package com.lineadecodigo.java.jdbc;

/**
 * @file BorrarDatos.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/agosto/2009
 * @url  http://lineadecodigo.com/java/borrado-de-datos-con-jdbc
 * @description Realizar borrado de datos en una BD mediante DELETE y JDBC.  
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BorrarDatos {

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
		      
		stmt = con.prepareStatement("DELETE FROM paises");
		int retorno = stmt.executeUpdate();		      
				      
		System.out.println(retorno);      
		      
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
