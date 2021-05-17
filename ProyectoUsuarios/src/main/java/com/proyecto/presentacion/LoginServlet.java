package com.proyecto.presentacion;

import java.io.IOException;

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
				if(email != null && password != null) {
					//saca datos
					Usuario user = Dao.obtenerPorEmail(email);
					String uEmail = user.getEmail();
					String uPass = user.getPassword();
					if(email == uEmail && password == uPass) {
						request.getSession().setAttribute("email", uEmail);
						response.sendRedirect("principal.jsp");
					} else {
						request.setAttribute("error", "Usuario o contraseña incorrectos");
						request.getRequestDispatcher("/index.jsp").forward(request, response);
					}
					
				} else {
					request.setAttribute("error", "Debes introducir un usuario y contraseña válidas.");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				}
				
				break;
			case "registro":
				Usuario addUser = new Usuario(email,password);
				Dao.insertar(addUser);
				break;
		}

		
	}

}
