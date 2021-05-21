package com.proyecto.controladores;

import java.io.IOException;
import java.util.ArrayList;

import com.proyecto.acceso.Dao;
import com.proyecto.entidades.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nombre = request.getParameter("nombre");
		if(email.isEmpty() || password.isEmpty() || nombre.isEmpty()) {
			request.setAttribute("error", "Rellena los campos obligatorios.");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			ArrayList<String> usuarios = Dao.obtenerEmails();
			int registrado = 0;
			for(String usuario: usuarios) {
				if(email.equals(usuario)) {
					registrado = 1;
					request.setAttribute("error", "Nombre de usuario en uso.");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				}
			}
			if(registrado == 0) {
				Usuario addUser = new Usuario(email,password, nombre);
				Dao.insertar(addUser);
				request.getSession().setAttribute("email", email);
				response.sendRedirect("inddex.jsp");	
			}
		}	
	}
}
