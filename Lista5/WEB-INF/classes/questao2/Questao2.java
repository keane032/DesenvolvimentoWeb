package questao2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/questao2")
public class Questao2 extends HttpServlet{
	
	protected void service(HttpServletRequest request,	HttpServletResponse response)	
			throws ServletException	,	IOException	{	

		PrintWriter out = response.getWriter();
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		
		 float a = Float.parseFloat(n1);
	     float m = Float.parseFloat(n2);
	     
	    out.println("soma");
	    out.println(a+m);
	    out.println("subtracao");
		out.println(a-m);
		

	}
}