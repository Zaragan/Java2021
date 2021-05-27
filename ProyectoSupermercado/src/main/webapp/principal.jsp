<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ include file="/includes/header.jsp" %>
<table class="table table-striped table-sm ">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
      <th scope="col">Cantidad</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${productos}" var="producto">
	<tr>
    	<th scope="row">${producto.id}</th>
    	<td>${producto.nombre}</td>
    	<td>${producto.precio}</td>
    	<td>${producto.cantidad }</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
<%@ include file="/includes/footer.jsp" %>