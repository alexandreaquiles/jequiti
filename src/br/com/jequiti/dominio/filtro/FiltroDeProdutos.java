package br.com.jequiti.dominio.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.jequiti.dominio.Produto;

public class FiltroDeProdutos {

	public List<Produto> filtra(List<Produto> produtos, ComparadorProdutos comparador) {
		List<Produto> filtrados = new ArrayList<>();
		for (Produto p : produtos) {
			if (comparador.compara(p)) {
				filtrados.add(p);
			}
		}
		return filtrados;
	}

}
