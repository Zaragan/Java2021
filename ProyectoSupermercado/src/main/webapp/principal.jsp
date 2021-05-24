<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jakarta.servlet.http.HttpSession" %>
<%@ include file="/includes/header.jsp" %>
	<main>
		<p>Bienvenido <%= request.getSession().getAttribute("nombre")%> tu email es <%= request.getSession().getAttribute("email")%> </p>
	</main>
</body>
</html>