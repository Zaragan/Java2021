<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/header.jsp" %>
	<main class="container">
		<table class="table table-striped table-sm align-middle">
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
				<c:forEach items="${clientes}" var="cliente">
					<tr>
						<th scope="row">${cliente.id}</th>
						<td>${cliente.nombre}</td>
						<td>${cliente.apellido}</td>
						<td>${cliente.telefono}</td>
						<td>${cliente.mail}</td>
						<td>${cliente.saldo}</td>
						<td>
							<form action="index" method="post">
								<input type="hidden" name="id" value="${cliente.id}"> <input
									type="submit" value="Editar" class="btn btn-primary">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="container" style="font-size: 12px;">
			<div class="row">
				<div class="col">
					<p style="text-align: center; font-size: 20px;">Agregar Cliente</p>
					<form action="agregar" method="post">
						<div class="mb-3">
							<label for="cNombre" class="form-label">Nombre</label> <input
								type="text" class="form-control" id="cNombre" name="cNombre">
						</div>
						<div class="mb-3">
							<label for="cApellido" class="form-label">Apellido</label> <input
								type="text" class="form-control" id="cApellido" name="cApellido">
						</div>
						<div class="mb-3">
							<label for="cTelefono" class="form-label">Teléfono</label> <input
								type="text" class="form-control" id="cTelefono" name="cTelefono">
						</div>
						<div class="mb-3">
							<label for="cMail" class="form-label">Mail</label> <input
								type="text" class="form-control" id="cMail" name="cMail">
						</div>
						<div class="mb-3">
							<label for="cSaldo" class="form-label">Saldo</label> <input
								type="text" class="form-control" id="cSaldo" name="cSaldo">
						</div>
						<button type="submit" class="btn btn-primary">Guardar</button>
					</form>
				</div>
				<div class="col">
					<p style="text-align: center; font-size: 20px;">Eliminar
						cliente</p>
					<form action="eliminar" method="post">
						<div class="mb-3">
							<label for="cId" class="form-label">Id de cliente</label> <input
								type="text" class="form-control" id="cId" name="cId">
						</div>
						<button type="submit" class="btn btn-primary">Eliminar</button>
					</form>
				</div>
			</div>
		</div>
	</main>
<%@ include file="/WEB-INF/includes/footer.jsp" %>