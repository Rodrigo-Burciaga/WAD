package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet("/Get_Cookie")
public class Get_Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    
	    try {
	    	Cookie[] galletas = request.getCookies();
	    	String cadena= new String();
		    for(int i=0;i<galletas.length;i++)
		    {
		    	cadena= cadena + URLDecoder.decode(galletas[i].getValue(), "UTF-8");
		    }
		    StringTokenizer st= new StringTokenizer(cadena,"&",false);
		    String[] inputs=new String[st.countTokens()];
		    int count=0;
		    while(st.hasMoreTokens()){
		    	inputs[count++]=st.nextToken();
		    }
		    
		   for (int i = 0; i < inputs.length; i++) {
			   
			   if((i+1)%2!=0){
				   out.println("<img src=\""+inputs[i]+"\" /> ");
			   }
			
			   else{
				   out.println("<p>"+inputs[i]+"</p>");
			   }
		   }
		    
		} catch (Exception e) {
			out.print("No hay nada en el carrito");
		}
	   
	}

	//Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8")); escribir cookie
	//String value = URLDecoder.decode(cookie.getValue(), "UTF-8"); leer cookie
	
	
}
