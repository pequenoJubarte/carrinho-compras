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
		<form:form name="Adicionar Produto" id="cadastroDeProduto"
			action="addProduto" method="POST">
			<label>Nome</label>
			<br>
			<input type="text" name="nome" maxlength="150"
				placeholder="Digite o nome do produto.." />
			<br>
			<br>
			<label>Preço</label>
			<br>
			<input type="text" name="preco" maxlength="150"
				placeholder="Digite seu endereço.." />
			<br>
			<br>
			<label>Quantidade</label>
			<br>
			<input type="number" name="quantidade" value="1" />
			<br>
			<br>
			<input type="submit" name="enviar" value="Enviar">
		</form:form>
	</div>
</body>
</html>