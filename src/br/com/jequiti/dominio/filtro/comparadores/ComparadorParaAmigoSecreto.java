package br.com.jequiti.dominio.filtro.comparadores;

import br.com.jequiti.dominio.Produto;
import br.com.jequiti.dominio.filtro.ComparadorProdutos;

public class ComparadorParaAmigoSecreto implements ComparadorProdutos {

	@Override
	public boolean compara(Produto p) {
		return p.getPreco() > 50;
	}

}
