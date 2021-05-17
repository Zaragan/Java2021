<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sesiones" method="get">
	<div>
	<label for="email"></label>
	<input name="email" id="email" type="text">
	</div>
	
	<div>
	<label for="password"></label>
	<input name="password" id="password" type="password">
	</div>
	<button>Enviar</button>
</form>
<p>${error}</p>
</body>
</html>