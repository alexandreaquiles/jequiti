package br.com.jequiti.main;

import java.util.Arrays;
import java.util.List;

import br.com.jequiti.dominio.Produto;
import br.com.jequiti.dominio.filtro.ComparadorProdutos;
import br.com.jequiti.dominio.filtro.FiltroDeProdutos;

public class Principal {

	public static void main(String[] args) {

		Produto p1 = new Produto("COLONIA DESODORANTE MASCULINA FÁBIO JR.", 16.9);
		Produto p2 = new Produto("ESMALTE JEQUITI AVIVA BARILOCHE", 6.9);
		Produto p3 = new Produto("ESMALTE JEQUITI AVIVA TÓQUIO", 6.9);
		Produto p4 = new Produto("DESODORANTE ANTITRANSPIRANTE MASCULINO AEROSSOL ZINC EXTRA FRESH", 14.9);
		Produto p5 = new Produto("COLONIA DESODORANTE MASCULINA LUAN SANTANA LS& YOU SOUND", 97.9);
		Produto p6 = new Produto("COLONIA DESODORANTE FEMININA CLAUDIA LEITTE INTENSE", 19.9);
		Produto p7 = new Produto("COLONIA DESODORANTE FEMININA IVETE SANGALO", 99.9);
		Produto p8 = new Produto("PALETTE DE SOMBRAS JEQUITI AVIVA 6 CORES", 59.9);
		Produto p9 = new Produto("COLONIA DESODORANTE FEMININA ISABELLA FIORENTINO BELLA", 19.9);
		Produto p10 = new Produto("ESTOJO ELIANA CRISTAL", 129.9);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		FiltroDeProdutos filtro = new FiltroDeProdutos();

		// Presentes para amigo secreto (mais de R$ 50)
		List<Produto> amigoSecreto = filtro.filtra(produtos, new ComparadorProdutos() {
			public boolean compara(Produto p) {
				return p.getPreco() > 50;
			}
		});
		for (Produto p : amigoSecreto) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");

		// Colônias
		List<Produto> colonias = filtro.filtra(produtos, new ComparadorProdutos() {
			public boolean compara(Produto p) {
				return p.getNome().startsWith("COLONIA");
			}
		});
		for (Produto p : colonias) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");

		// Produtos Masculinos
		List<Produto> masculinos = filtro.filtra(produtos, new ComparadorProdutos() {
			public boolean compara(Produto p) {
				return p.getNome().contains("MASCULIN");
			}
		});
		for (Produto p : masculinos) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");
	}

}
