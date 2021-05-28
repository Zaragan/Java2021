<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<base href="/ProyectoSupermercado/">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap5.min.css" rel="stylesheet">
<link rel="stylesheet" href="includes/css/main.css">
<title>Tienda Online</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<c:if test="${usuario == null}"><li class="nav-item"><a class="nav-link active" aria-current="page" href="index.jsp">Índice</a></li></c:if>
					<c:if test="${usuario != null}"><li class="nav-item"><a class="nav-link active" aria-current="page" href="principal">Principal</a></li></c:if>
					<li class="nav-item"><a class="nav-link" href="#">Link A</a></li>
					<c:if test="${usuario.rol == 2}"><li class="nav-item"><a class="nav-link" href="#">Administración</a></li></c:if>
				</ul>
				<ul class="navbar-nav mb-2 mb-lg-0">
					<li class="nav-item dropdown">
          				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
          				<c:if test="${usuario == null}">Usuario Desconocido</c:if><c:if test="${usuario != null}">Bienvenido, ${usuario.getNombre()}</c:if></a>
         				<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
           					<li><a class="dropdown-item" href="identificar.jsp">Identificar</a></li>
				            <li><a class="dropdown-item" href="registro.jsp">Registro</a></li>
				            <c:if test="${usuario != null}"><li><hr class="dropdown-divider"></li>
				            <li><a class="dropdown-item" href="desconectar">Desconectar</a></li></c:if>
				            
				        </ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
<main class="container">