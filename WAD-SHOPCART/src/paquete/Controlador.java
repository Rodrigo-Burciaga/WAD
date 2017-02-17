package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out= response.getWriter();
		String imagen = request.getParameter("imagen");
		String price = request.getParameter("price");
		
		
			Cookie[] galletas = request.getCookies();
			if (galletas==null) {
				Cookie galleta= new Cookie("1", URLEncoder.encode(imagen+"&"+price+"&", "UTF-8"));
				galleta.setMaxAge(60*60*24);
				response.addCookie(galleta);
				out.print("Añadido al carrito");
			}
			else{
				int name= Integer.parseInt(galletas[galletas.length-1].getName());
				name=name+1;
				Cookie galleta = new Cookie(Integer.toString(name),URLEncoder.encode(imagen+"&"+price+"&", "UTF-8"));
				galleta.setMaxAge(60*60*24);
				response.addCookie(galleta);
				out.print("Añadido al carrito");
				
				 /* for(int i=0;i<galletas.length;i++)
				    {
				      out.print("El valor de la galleta es:"+ URLDecoder.decode(galletas[i].getValue(), "UTF-8")+"\n");

				    }*/
				
			}
			
		  
		 
			
		
		
		
		
		
		
	}

	
	

}
