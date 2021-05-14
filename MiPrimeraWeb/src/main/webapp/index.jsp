<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

int zero = 0;
Cookie[] cookies = request.getCookies();
for(Cookie c: cookies){
	if("galleta".equals(c.getName())){
		out.println("Ya tengo un valor, adivinalo!");
		zero = 1;
	}
}

if(zero == 0) {
	out.println("Acabo de generar un numero!!");
	int objetivo = 1+ (int)(Math.random()*100);
	String objetivoGalleta = String.valueOf(objetivo);
	Cookie obj = new Cookie("galleta", objetivoGalleta);
	obj.setMaxAge(60*60*24);
	response.addCookie(obj);
}

%>
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
	<pre>${texto }</pre>
</body>
</html>