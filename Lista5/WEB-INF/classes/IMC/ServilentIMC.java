package IMC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imc")	
public class ServilentIMC extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest request,	HttpServletResponse response)	
throws ServletException	,	IOException	{	
			PrintWriter out = response.getWriter();
			
			
	        String altura = request.getParameter("a");
	        String massa  = request.getParameter("m");
	        
	        float a = Float.parseFloat(altura);
	        float m = Float.parseFloat(massa);
	
	        float imc = m/(a*a);
	        String resp = "nao valido";
	        
	        if(imc < 16){
	    	 resp = "Magreza grave:";
	    	}else if( imc < 17 && imc > 16){
	    		resp = "Magreza moderada:";
	    	}else if( imc > 17 && imc < 18.5){
	    		resp = "Magreza leve";
	    	}else if(18.5 < imc && imc< 25){
	    		resp = "Saldavel";
	    	}else if (25 < imc && imc < 30){
	    		resp = "Sobrepeso";
	    	}else if (30 < imc && imc < 35){
	    		resp = "Obesidade Grau I";
	    	}else if (35 < imc && imc < 40){
	    		resp = "Obesidade Grau II";
	    	}else if ( imc > 40){
	    		resp = "Obesidade Grau III";
	    	}
	        
	        
	        out.println("<html>");
            out.println("<body>");
            out.println(resp+" : "+ imc);
            out.println("</body>");
            out.println("</html>");
	
	}	
	
	
}
