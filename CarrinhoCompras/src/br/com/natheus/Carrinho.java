package br.com.natheus;

import java.util.TreeMap;

public class Carrinho {

	private TreeMap<String, Produto> mapaProdutos = new TreeMap<>();

	public void adicionarProduto(Produto produto) {
		mapaProdutos.put(produto.getNome().toUpperCase(), produto);
	}

	public TreeMap<String, Produto> getMapaProdutos() {
		return mapaProdutos;
	}

	public void setMapaProdutos(TreeMap<String, Produto> mapaProdutos) {
		this.mapaProdutos = mapaProdutos;
	}
}