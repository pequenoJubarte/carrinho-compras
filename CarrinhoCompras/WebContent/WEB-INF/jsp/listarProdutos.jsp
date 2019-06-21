<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8" />
<title>Lista de Produtos</title>
<link rel="StyleSheet" type="text/css" href="css/estilo.css"
	media="screen">
</head>
<body>
	<div class="fundoFormulario">
		<h1>Lista de Produtos</h1>


		<c:if test="${not empty carrinho.getProdutos().values()}">
			<table class="fundoFormulario">
				<tr>
					<td>Nome</td>
					<td>Preço</td>
					<td>Quantidade</td>
					<td>Preço Total</td>
				</tr>
				<c:forEach var="produto" items="${carrinho.getProdutos().values()}">
					<tr>
						<td>${produto.nome}</td>
						<td><fmt:formatNumber pattern="R$ ###,##0.00">${produto.preco}</fmt:formatNumber></td>
						<td>${produto.quantidade}</td>
						<td><fmt:formatNumber pattern="R$ ###,##0.00">${produto.precoTotal}</fmt:formatNumber></td>
					</tr>
				</c:forEach>
			</table>

			<table class="fundoFormulario">
				<tr>
					<td>Quantidade Total</td>
					<td>Preço Total</td>
				</tr>
				<tr>
					<td>${carrinho.quantidadeTotal}</td>
					<td><fmt:formatNumber pattern="R$ ###,##0.00">${carrinho.precoTotal}</fmt:formatNumber></td>
				</tr>
			</table>

			<c:if test="${!(carrinho.frete == null)}">
				<table class="fundoFormulario">
					<tr>
						<td>CEP</td>
						<td>Valor do Frete</td>
					</tr>
					<tr>
						<td>${carrinho.frete.cepDestinatario}</td>
						<td><fmt:formatNumber pattern="R$ ###,##0.00">${carrinho.frete.precoTotal}</fmt:formatNumber></td>
					</tr>
				</table>
			</c:if>
		</c:if>
		<a href="formAddProduto">Adicionar um novo Produto</a> <br> <a
			href="/CarrinhoCompras/">Início</a> <br> <a
			href="formCalcularFrete">Calcular Frete</a>
	</div>
</body>
</html>