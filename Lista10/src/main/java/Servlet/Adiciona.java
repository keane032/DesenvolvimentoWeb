package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Produto;
import ModeloDAO.ProdutoDAO;


@WebServlet("/adiciona")
public class Adiciona extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		    
			ProdutoDAO dao = new ProdutoDAO();
			Produto produto = new Produto();
			
			String descri = request.getParameter("descricao");
			String valor = request.getParameter("valor");
			
			produto.setDescri(descri);
			produto.setPreco(Float.parseFloat(valor));
			
			dao.adiciona(produto);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
