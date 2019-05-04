package br.com.natheus;

import java.util.TreeMap;

public class Carrinho {
	private TreeMap<String, Produto> produtos = new TreeMap<>();

	public void adicionarProduto(String nome, float preco) {
		Produto produto = new Produto(nome.toUpperCase(), preco);
		produtos.put(nome.toUpperCase(), produto);
	}

	public void listar() {
		float precoTotal = 0;
		int quantidadeTotal = 0;
		System.out.println("Listagem dos produtos: ");

		int i = 1;
		for (Produto produto : produtos.values()) {
			System.out.println("Produto " + i);
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Preço total: " + produto.getPrecoTotal());
			System.out.println("////////////////////..///////////////");
			i++;
			quantidadeTotal += produto.getQuantidade();
			precoTotal += produto.getPrecoTotal();
		}
	}
}
