<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="utf-8" />
<title>Lista de Produtos</title>
<link rel="StyleSheet" type="text/css" href="css/estilo.css"
	media="screen">
</head>
<body>
	<div class="fundoFormulario">
		<h1>Lista de Produtos</h1>

		<c:if test="${not empty produtos.values()}">
			<table>
				<tr>
					<td>Nome</td>
					<td>Preço</td>
					<td>Quantidade</td>
					<td>Preço Total</td>
				</tr>
				<c:forEach var="produto" items="${produtos.values()}">
					<tr>
						<td>${produto.nome}</td>
						<td>${produto.preco}</td>
						<td>${produto.quantidade}</td>
						<td>${produto.precoTotal}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>