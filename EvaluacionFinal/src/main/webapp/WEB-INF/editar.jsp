<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/header.jsp" %>
<main class="container">
	<form action="editar" method="post">
		<div class="mb-3">
			<label for="cNombre" class="form-label">Nombre</label> <input
				type="text" class="form-control" id="cNombre" name="cNombre"
				value="${cliente.nombre}">
		</div>
		<div class="mb-3">
			<label for="cApellido" class="form-label">Apellido</label> <input
				type="text" class="form-control" id="cApellido" name="cApellido"
				value="${cliente.apellido}">
		</div>
		<div class="mb-3">
			<label for="cTelefono" class="form-label">Teléfono</label> <input
				type="text" class="form-control" id="cTelefono" name="cTelefono"
				value="${cliente.telefono}">
		</div>
		<div class="mb-3">
			<label for="cMail" class="form-label">Mail</label> <input
				type="text" class="form-control" id="cMail" name="cMail"
				value="${cliente.mail}">
		</div>
		<div class="mb-3">
			<label for="cSaldo" class="form-label">Saldo</label> <input
				type="text" class="form-control" id="cSaldo" name="cSaldo"
				value="${cliente.saldo}">
		</div>
		<input type="hidden" id="cId" name="cId" value="${cliente.id}">
		<button type="submit" class="btn btn-primary">Guardar</button>
	</form>
</main>
<%@ include file="/WEB-INF/includes/footer.jsp" %>