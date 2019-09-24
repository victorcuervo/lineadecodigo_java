package com.lineadecodigo.java.jdbc;

/**
 * @file InsertarDatos.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7/junio/2007
 * @url  http://lineadecodigo.com/java/insertar-datos-con-jdbc/
 * @description Realizar inserciones de datos en una BD mediante INSERT y JDBC.  
 */

import java.sql.*;

public class InsertarDatos {

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
		      

		String sISBN = "84-9815-212-7";
		String sTitulo = "Yo, Claudio";
		String sDescripcion="Supuesta autobiografía de Claudio";
		String sCategoria = "Novela Histórica";
		int idAutor = 3;
		      
		stmt = con.prepareStatement("INSERT INTO libros VALUES (?,?,?,?,?)");

	    stmt.setString(1,sISBN);
		stmt.setInt(2,idAutor);
		stmt.setString(3,sTitulo);
		stmt.setString(4,sDescripcion);
		stmt.setString(5,sCategoria);
		      
		int retorno = stmt.executeUpdate();
		
		if (retorno>0)
			System.out.println("Insertado correctamente");      
		      
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
