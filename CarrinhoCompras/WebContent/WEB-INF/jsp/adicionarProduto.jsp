<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8" />
<title>Adicionar Produto</title>
<link rel="StyleSheet" type="text/css" href="css/estilo.css"
	media="screen">
</head>
<body>
	<div class="fundoFormulario">
		<h1>Adicionar Produto:</h1>
		<br>
		<form:form method="POST" action="adicionarProduto">
			<form:label path="nome">Nome</form:label>
			<br>
			<form:input path="nome" type="text" name="nome" maxlength="150"
				placeholder="Digite o nome do produto.." />
			<br>
			<form:label path="preco">Preço</form:label>
			<br>
			<form:input path="preco" type="text" name="preco" placeholder="0.0" />
			<br>
			<form:label path="quantidade">Quantidade</form:label>
			<br>
			<form:input path="quantidade" type="number" name="quantidade"
				value="1" />
			<br>
			<input type="submit" value="Enviar">
		</form:form>
		<a href="listarProdutos">Lista de Produtos</a> <br> <a
			href="formCalcularFrete">Calcular Frete</a>
	</div>
</body>
</html>