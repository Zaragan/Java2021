<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			<label for="email">Email:</label>
			<input name="email" id="email" type="text">
		</div>
		<div>
			<label for="password">Password:</label>
			<input name="password" id="password" type="password">
		</div>
		<input type="submit" value="identificar" name="enviar" >
		<input type="submit" value="registro" name="enviar" >
	</form>
	<p>${error}</p> 
</body>
</html>