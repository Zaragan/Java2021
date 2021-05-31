package com.proyecto.presentacion;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyecto.acceso.DaoCliente;
import com.proyecto.entidades.Cliente;

@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Cliente> clientes = DaoCliente.obtenerTodos();
		request.setAttribute("clientes", clientes);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		//	Cambiar de String a Integer
		Integer intId = Integer.valueOf(id);
		Cliente cliente = DaoCliente.obtenerPorId(intId);
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("/editar.jsp").forward(request, response);
	}

}
