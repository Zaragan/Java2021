package com.proyecto.controladores;

import java.io.IOException;

import com.proyecto.acceso.DaoUsuario;
import com.proyecto.entidades.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/identificar") 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if(email.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "Rellena los campos obligatorios.");
			request.getRequestDispatcher("/identificar.jsp").forward(request, response);
		} else {
			if(email.isEmpty() || password.isEmpty()) {
				request.setAttribute("error", "Rellena los campos obligatorios.");
				request.getRequestDispatcher("/identificar.jsp").forward(request, response);
			} else {
				Usuario usuario = DaoUsuario.obtenerPorEmail(email);
				if(usuario == null) {
					request.setAttribute("error", "No se ha encontrado el usuario.");
					request.getRequestDispatcher("/identificar.jsp").forward(request, response);
				} else {
					
					if(usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
						request.getSession().setAttribute("usuario", usuario);
						response.sendRedirect("principal");	
					} else {
						request.setAttribute("error", "Usuario o contraseña incorrecta.");
						request.getRequestDispatcher("/identificar.jsp").forward(request, response);
					}
				}
			}
		}	
	}
}
