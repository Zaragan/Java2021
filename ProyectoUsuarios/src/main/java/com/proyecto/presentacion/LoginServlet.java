package com.proyecto.presentacion;

import java.io.IOException;
import java.util.ArrayList;

import com.proyecto.accesso.Dao;
import com.proyecto.entidades.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("enviar");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		switch (tipo) {
			case "identificar":
				if(email.isEmpty() || password.isEmpty()) {
					request.setAttribute("error", "Rellena los campos obligatorios.");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				} else {
					Usuario usuario;
					usuario = Dao.obtenerPorEmail(email);
					if(usuario == null) {
						request.setAttribute("error", "No se ha encontrado el usuario.");
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					} else {
						
						if(usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
							request.getSession().setAttribute("email", email);
							response.sendRedirect("principal.jsp");	
						} else {
							request.setAttribute("error", "Usuario o contraseña incorrecta.");
							request.getRequestDispatcher("/index.jsp").forward(request, response);
						}
					}
				}
				break;
			case "registro":
				if(email.isEmpty() || password.isEmpty()) {
					request.setAttribute("error", "Rellena los campos obligatorios.");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				} else {
					ArrayList<String> user = Dao.obtenerEmails();
					int reg = 0;
					for(String u: user) {
						if(email.equals(u)) {
							reg = 1;
							request.setAttribute("error", "Nombre de usuario en uso.");
							request.getRequestDispatcher("/index.jsp").forward(request, response);
						}
					}
					if(reg == 0) {
						Usuario addUser = new Usuario(email,password);
						Dao.insertar(addUser);
						request.getSession().setAttribute("email", email);
						response.sendRedirect("principal.jsp");	
					}
				}
		}

		
	}

}
