package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	Map<Integer,String> tarefas = new TreeMap<Integer,String>();
	int qtd = 0;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		TreeMap<Integer, String> lista = (TreeMap<Integer, String>) session.getAttribute("lista");
		
		int aux = 0;
		
		for (String string : lista.values() ) {
			out.print(aux);
			out.println("-"+string);
			aux++;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tarefa = request.getParameter("tarefa");
		tarefas.put(qtd,tarefa);
		qtd = qtd + 1;
		
	}

}
