package com.proyecto.filtros;

import java.io.IOException;

import com.proyecto.entidades.Usuario;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("/admin/*")
public class Filtros implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");
		
		if(usuario.getRol.().equals("admin")) {
			chain.doFilter(request, response);			
		} else {
			res.sendRedirect(req.getContextPath()+"/login");
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void destroy() {	}
}
