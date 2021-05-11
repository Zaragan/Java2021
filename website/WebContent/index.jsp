<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for(int i = 1; i <= 5; i++){ %>
	<h1>Me repito <%= i %></h1>
	<% } %>
	<% ArrayList<String> lista = new ArrayList<>(); 
	lista.add("Uno");
	lista.add("Dos");
	lista.add("Tres");%>
	
	<ul>
		<% for(String dato: lista) { %>
		<li><%=dato %></li>
		<% } %>
	</ul>
</body>
</html>