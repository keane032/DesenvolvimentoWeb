package ModeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.ConnectionFactory;
import Modelo.Produto;

public class ProdutoDAO {
	
	//id
	//valor 
	//descricao
	
	private Connection connection;

	
	public ProdutoDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
		// TODO Auto-generated constructor stub
	}
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void adiciona(Produto produto){
		String sql = "insert into produto " +
	            "(descricao,valor )" +
	            " values (?,?)";
		
		
		  try {
		        // prepared statement para inserção
		        PreparedStatement stmt = connection.prepareStatement(sql);

		        // seta os valores

		        stmt.setString(1,produto.getDescri());
		        stmt.setLong(2,(long) produto.getPreco());////////!!!!!!!!!!!!!!!

		        // executa
		        stmt.execute();
		        stmt.close();
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		}
		
	public List<Produto> getLista() {
	     try {
	         List<Produto> produtos = new ArrayList<Produto>();
	         PreparedStatement stmt = this.connection.
	                 prepareStatement("select * from Produto");
	         ResultSet rs = stmt.executeQuery();
	 
	         while (rs.next()) {
	             // criando o objeto Produto
	             Produto produto = new Produto();
	             produto.setId(rs.getString("id"));
	             produto.setDescri(rs.getString("descricao"));
	             produto.setPreco(rs.getFloat("valor"));
	             // adicionando o objeto à lista
	             produtos.add(produto);
	         }
	         rs.close();
	         stmt.close();
	         return produtos;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
		
		
	}
	
	


