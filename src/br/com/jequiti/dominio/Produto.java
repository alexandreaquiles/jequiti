package br.com.jequiti.dominio;

public class Produto {

	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return nome + " (R$" + preco + ")";
	}
	
	

}
