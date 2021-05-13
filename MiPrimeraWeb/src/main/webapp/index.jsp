<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="saludar">
		<input name="nombre" />
		<button>Saludar</button>
	</form>
	<pre>Hola <%= valorCookie %></pre>
</body>
</html>