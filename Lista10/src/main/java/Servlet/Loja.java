package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Produto;
import ModeloDAO.ProdutoDAO;

@WebServlet("/loja")
public class Loja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ProdutoDAO dao = new ProdutoDAO();
			List<Produto> produtos = dao.getLista();
			
			request.setAttribute("produtos",produtos);
	        
	        RequestDispatcher dispacho = request.getRequestDispatcher("loja.jsp");
			dispacho.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
