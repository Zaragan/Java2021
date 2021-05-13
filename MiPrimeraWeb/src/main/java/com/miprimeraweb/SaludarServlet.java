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
	private static String valorCookie = null;
	//private static String resultado = null;
	
	Cookie[] cookies = request.getCookies();
	for (Cookie c: cookies) {
		if("galleta".equals(c.getName())){
			String valorCookie = c.getValue();
			break;		
		} else if(valorCookie == null){
			int objetivo = 1 + (int)(Math.random()*100);
			String objGalleta = String.valueOf(objetivo);
		
			Cookie obj = new Cookie("galleta", objGalleta);
			obj.setMaxAge(60*60*24);
			response.addCookie(obj);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		Cookie[] cookies = request.getCookies();
		String valorCookie = null;
		for (Cookie c : cookies) {
			if ("galleta".equals(c.getName())) {
				valorCookie = c.getValue();
				break;
			}
		}
		
		if(valorCookie != null) {
			
		}
		
		
		//	generamos numero
		int objetivo = 1 + (int)(Math.random()*100);
		String objGalleta = String.valueOf(objetivo);
		
		//	obtenemos input
		String input = request.getParameter("nombre");
		
		//int numero = Integer.parseInt(input);
		//	declaramos array y si esta lo guardamos
		
		
		//	si hay cookie recoremos el array para sacarla
		if(valorCookie != null) {
			
				 resultado = "no habia galleta pero ahora si!";
			
		//	si no hay cookie la creamos con el numero generado
		} else {
			resultado="test";
			Cookie obj = new Cookie("galleta", objGalleta);
			obj.setMaxAge(60*60*24);
			response.addCookie(obj);
		}
		
		
		
		
		
		
		request.setAttribute("sunombre", resultado);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	*/}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



