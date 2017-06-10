package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	public Connection getConnection() throws ClassNotFoundException {
		
	     try {
	    	 Class.forName("org.postgresql.Driver");
	         return DriverManager.getConnection(
	 "jdbc:postgresql://localhost:5432/Produtos", "postgres","root");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	
	
	
	
}
