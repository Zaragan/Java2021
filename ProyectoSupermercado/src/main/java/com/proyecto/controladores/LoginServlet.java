package com.proyecto.controladores;

import java.io.IOException;

import com.proyecto.acceso.Dao;
import com.proyecto.entidades.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/identificar")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if(email.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "Rellena los campos obligatorios.");
			request.getRequestDispatcher("/identificarse.jsp").forward(request, response);
		} else {
			//			COMPROBAR ESTO
			if(email.isEmpty() || password.isEmpty()) {
				request.setAttribute("error", "Rellena los campos obligatorios.");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else {
				Usuario usuario = Dao.obtenerPorEmail(email);
				if(usuario == null) {
					request.setAttribute("error", "No se ha encontrado el usuario.");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				} else {
					
					if(usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
						request.getSession().setAttribute("email", email);
						request.getSession().setAttribute("nombre", usuario.getNombre());
						response.sendRedirect("principal.jsp");	
					} else {
						request.setAttribute("error", "Usuario o contraseña incorrecta.");
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					}
				}
			}
			//		COMPROBAR ESTO
		}	
	}
}
