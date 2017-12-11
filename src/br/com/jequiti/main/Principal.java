package br.com.jequiti.main;

import java.util.ArrayList;
import java.util.List;

import br.com.jequiti.dominio.Produto;

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
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		produtos.add(p7);
		produtos.add(p8);
		produtos.add(p9);
		produtos.add(p10);
		
		// Presentes para amigo secreto (mais de R$ 50)
		List<Produto> amigoSecreto = new ArrayList<>();
		for (Produto p : produtos) {
			if (p.getPreco() > 50) {
				amigoSecreto.add(p);
			}
		}
		for (Produto p : amigoSecreto) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");

		// Colônias
		List<Produto> colonias = new ArrayList<>();
		for (Produto p : produtos) {
			if (p.getNome().startsWith("COLONIA")) {
				colonias.add(p);
			}
		}
		for (Produto p : colonias) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");

		// Produtos Masculinos
		List<Produto> masculinos = new ArrayList<>();
		for (Produto p : produtos) {
			if (p.getNome().contains("MASCULIN")) {
				masculinos.add(p);
			}
		}
		for (Produto p : masculinos) {
			System.out.println(p);
		}

		System.out.println("-----------------------------------------------------------------");
	}

}
