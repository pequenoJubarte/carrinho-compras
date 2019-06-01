<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="utf-8" />
<title>Adicionar Produto</title>
<link rel="StyleSheet" type="text/css" href="css/estilo.css"
	media="screen">
</head>
<body>
	<div class="fundoFormulario">
		<h1>Adicionar Produto:</h1>
		<br>
		<form:form method="POST" action="adicionaProduto">
			<form:label path="nome">Nome</form:label>
			<br>
			<form:input path="nome" type="text" name="nome" maxlength="150"
				placeholder="Digite o nome do produto.." />
			<br>
			<br>
			<form:label path="preco">Preço</form:label>
			<br>
			<form:input path="preco" type="text" name="preco" />
			<br>
			<br>
			<form:label path="quantidade">Quantidade</form:label>
			<br>
			<form:input path="quantidade" type="number" name="quantidade"
				value="1" />
			<br>
			<br>
			<input type="submit" name="enviar" value="Enviar">
		</form:form>
		<a href="listaProdutos">Lista de Produtos</a>
	</div>
</body>
</html>