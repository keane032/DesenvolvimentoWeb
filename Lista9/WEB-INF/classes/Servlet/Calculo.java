package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculo
 */
@WebServlet("/calculo")
public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		
		String n1 = request.getParameter("numero1");
		String n2 = request.getParameter("numero2");
		
		
		 float a = Float.parseFloat(n1);
	     float b = Float.parseFloat(n2);
	     
	     float soma = a + b;
	     float sub = a - b;
	     
	     request.setAttribute("soma",soma);
	     request.setAttribute("sub", sub);
	     
	     
		RequestDispatcher dispacho = request.getRequestDispatcher("Calculo.jsp");
		dispacho.forward(request, response);
		
	}

}
