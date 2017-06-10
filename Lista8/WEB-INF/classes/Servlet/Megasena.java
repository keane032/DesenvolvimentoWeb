package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Megasena
 */
@WebServlet("/megasena")
public class Megasena extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> sorteados = new ArrayList<Integer>();
		
		for (int i = 1; i < 61; i++) {
		    numeros.add(i);
		}
	
		Collections.shuffle(numeros);
		
		for (int i = 0; i < 5; i++) {
			sorteados.add(numeros.get(i));
		}
		
	
		
		request.setAttribute("numeros", sorteados);
        
        RequestDispatcher dispacho = request.getRequestDispatcher("Megasena.jsp");
		dispacho.forward(request, response);
		
	}

}
