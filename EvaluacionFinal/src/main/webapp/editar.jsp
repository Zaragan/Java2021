<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Evaluacion final</title>
</head>
<body>
	<table class="table table-striped table-sm ">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nombre</th>
				<th scope="col">Apellido</th>
				<th scope="col">Telefono</th>
				<th scope="col">Mail</th>
				<th scope="col">Saldo</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cliente}" var="cliente">
				<tr>
					<th scope="row">${cliente.id}</th>
					<td>${cliente.nombre}</td>
					<td>${cliente.apellido}</td>
					<td>${cliente.telefono}</td>
					<td>${cliente.mail}</td>
					<td>${cliente.saldo}</td>
					<td>
						<form action="index" method="post">
							<input type="hidden" name="id" value="${cliente.id}">
							<input type="submit" value="Editar" class="btn btn-primary">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>