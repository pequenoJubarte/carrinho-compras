package br.com.natheus;

import java.util.TreeMap;

public class Carrinho {
	private TreeMap<String, Produto> produtos = new TreeMap<>();
	private Frete frete = new Frete();
	
	public void adicionarProduto(Produto produto) {
		String nome = produto.getNome().toUpperCase();
		produtos.put(nome, produto);
	}
	
	public double calcularFrete(String cepDestinatario) {
		return frete.calcularFrete(cepDestinatario, getQuantidadeTotal());
	}

	public TreeMap<String, Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(TreeMap<String, Produto> produtos) {
		this.produtos = produtos;
	}

	public int getQuantidadeTotal() {
		int quantidadeTotal = 0;

		for (Produto produto : produtos.values()) {
			quantidadeTotal += produto.getQuantidade();
		}

		return quantidadeTotal;
	}

	public double getPrecoTotal() {
		double precoTotal = 0;

		for (Produto produto : produtos.values()) {
			precoTotal += produto.getPrecoTotal();
		}

		return precoTotal;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	
}
