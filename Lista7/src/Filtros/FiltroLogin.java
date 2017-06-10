package Filtros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebFilter(urlPatterns = {"/login.html"})
public class FiltroLogin implements Filter {

   
    public FiltroLogin() {}	
	public void destroy() {}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletResponse response2 = (HttpServletResponse) response;
		
		try{
			
			
		if(((HttpServletRequest) request).getSession().getAttribute("usuario") == null){
			
			out.println("Nao esta logado");
			
		}else {
			
			out.println("Esta logado");
			response2.sendRedirect("home.html");
			
		}
		
		}catch (Exception e) {
		
			out.println("Erro");
			
		}finally {
		
		chain.doFilter(request, response);
	
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {}

}
