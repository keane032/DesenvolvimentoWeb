package Mega;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gerador")
public class Gerador extends HttpServlet{
	
	protected void service(HttpServletRequest request,	HttpServletResponse response)	
			throws ServletException	,	IOException	{	
		
		PrintWriter out = response.getWriter();
		
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i < 61; i++) {
		    numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		
		for (int i = 0; i < 6; i++) {
		  out.println(numeros.get(i)+"-");
		}	
		
		
	}
	

}
