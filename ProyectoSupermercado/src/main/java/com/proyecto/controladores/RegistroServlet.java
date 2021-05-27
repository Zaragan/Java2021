package com.proyecto.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.acceso.DaoUsuario;
import com.proyecto.entidades.Usuario;

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
			request.getRequestDispatcher("/registro.jsp").forward(request, response);
		} else {
			ArrayList<String> usuarios = DaoUsuario.obtenerEmails();
			int registrado = 0;
			for(String usuario: usuarios) {
				if(email.equals(usuario)) {
					registrado = 1;
					request.setAttribute("error", "Nombre de usuario en uso.");
					request.getRequestDispatcher("/registro.jsp").forward(request, response);
				}
			}
			if(registrado == 0) {
				Usuario addUser = new Usuario(email,password,nombre);
				DaoUsuario.insertar(addUser);
				request.getSession().setAttribute("usuario", addUser);
				response.sendRedirect("principal");	
			}
		}	
	}
}
