<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/includes/header.jsp" %>
	<main>
		<form action="registro" method="post">
			<label for="email">Email:</label>
			<input type="text" name="email">
			<label for="password">Contraseña:</label>
			<input type="password" name="password">
			<label for="nombre">Nombre:</label>
			<input type="text" name="nombre">
			<input type="submit" value="Registrarse">
		</form>
		<p>${error}</p>
	</main>
</body>
</html>