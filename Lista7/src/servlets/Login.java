package servlets;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logIn")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		
	if(login.equals("admin") && senha.equals("teste1234")){
			
			HttpSession session = request.getSession();
			session.setAttribute("usuario", "admin");
			
			session.setAttribute("lista",new TreeMap<>());
			
			response.sendRedirect("home.html");
			
	}else{
	
			response.sendRedirect("login.html");
			
		}
		
		
	}

	
}
