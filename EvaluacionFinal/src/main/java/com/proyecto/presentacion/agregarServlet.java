package com.proyecto.presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.acceso.DaoCliente;
import com.proyecto.entidades.Cliente;

@WebServlet("/agregar")
public class agregarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("cNombre");
		String apellido = request.getParameter("cApellido");
		String telefono = request.getParameter("cTelefono");
		String mail = request.getParameter("cMail");
		Double saldo = Double.parseDouble(request.getParameter("cSaldo"));
		
		DaoCliente.insertar(new Cliente(nombre,apellido, null, telefono,mail,saldo));
		response.sendRedirect("index");
	}

}
