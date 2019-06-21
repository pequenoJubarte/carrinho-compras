<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Calcular Frete</title>
<link rel="StyleSheet" type="text/css" href="css/estilo.css"
	media="screen">
</head>
<body>
	<div class="fundoFormulario">
		<h1>Adicionar Produto:</h1>
		<br>
		<form:form method="POST" action="calcularFrete">
			<form:label path="cepDestinatario">CEP</form:label>
			<br>
			<form:input path="cepDestinatario" type="text" name="nome" maxlength="150"
				placeholder="Digite o seu CEP.." />
			<br>
			<input type="submit" value="Enviar">
		</form:form>
		<a href="listarProdutos">Lista de Produtos</a> <br> <a
			href="calcularFrete">Calcular Frete</a>
	</div>
</body>
</html>