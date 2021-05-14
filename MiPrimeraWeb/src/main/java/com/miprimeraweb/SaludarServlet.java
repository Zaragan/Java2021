package com.miprimeraweb;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saludar")
public class SaludarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	iniciamos variables finales	
		String solucion = "";
		int valor = -1;
		//	obtenemos input
		String input = request.getParameter("nombre");
		int numero = Integer.parseInt(input);
		// obtenemos el numero de la cookie
		Cookie[] cookies = request.getCookies();
		for(Cookie c: cookies){
			if("galleta".equals(c.getName())){
				String sValor = c.getValue();
				valor = Integer.valueOf(sValor);
			}
		}
		//	Comprobamos el numero
		if(numero == valor) {
			solucion = "Has acertado"; 
			Cookie obj = new Cookie("galleta","");
			obj.setMaxAge(0);
			response.addCookie(obj);
		} else {
			solucion = "Sigue intentandolo!";
		}
		
		
		
		
		
		
		
		
		request.setAttribute("texto", solucion);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



