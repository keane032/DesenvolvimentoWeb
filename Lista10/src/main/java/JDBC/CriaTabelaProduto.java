package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriaTabelaProduto {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection c = new ConnectionFactory().getConnection();
		String sql = "create table Produto (id serial, "+  
				"descricao VARCHAR(255), valor VARCHAR(255), "+   
				"primary key (id))";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.executeUpdate();
		c.close();
	}
	
}
