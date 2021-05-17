

import java.io.IOException;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sesiones
 */
@WebServlet("/sesiones")
@SuppressWarnings("unused")
public class Sesiones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/midb.sqlite3"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if("admin".equals(email) && "contra".equals(password)) {
			request.getSession().setAttribute("email", email);
			response.sendRedirect("principal.jsp");	
		} else {
			request.setAttribute("error", "Usuario o contraseña incorrectos");
			request.getRequestDispatcher("/index.jsp");
		}
	}
	
	public void conectar() {
		
	}

}
