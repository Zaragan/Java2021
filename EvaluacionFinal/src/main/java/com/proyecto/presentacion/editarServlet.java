package com.proyecto.presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.acceso.DaoCliente;

@WebServlet("/editar")
public class editarServlet extends HttpServlet {
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
		Integer id = Integer.parseInt(request.getParameter("cId"));
		
		DaoCliente.modificar(nombre, apellido, telefono, mail, saldo, id);
		response.sendRedirect("index");
	}

}
