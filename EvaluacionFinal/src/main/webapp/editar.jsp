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
	<main class="container">
		<form action="editar" method="post">
			<div class="mb-3">
				<label for="cNombre" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="cNombre" name="cNombre" value="${cliente.nombre}">
			</div>
			<div class="mb-3">
				<label for="cApellido" class="form-label">Apellido</label> <input
					type="text" class="form-control" id="cApellido" name="cApellido" value="${cliente.apellido}">
			</div>
			<div class="mb-3">
				<label for="cTelefono" class="form-label">Teléfono</label> <input
					type="text" class="form-control" id="cTelefono" name="cTelefono" value="${cliente.telefono}">
			</div>
			<div class="mb-3">
				<label for="cMail" class="form-label">Mail</label> <input
					type="text" class="form-control" id="cMail" name="cMail" value="${cliente.mail}">
			</div>
			<div class="mb-3">
				<label for="cSaldo" class="form-label">Saldo</label> <input
					type="text" class="form-control" id="cSaldo" name="cSaldo" value="${cliente.saldo}">
			</div>
			<input type="hidden" id="cId" name="${cliente.id}">
			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	</main>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>