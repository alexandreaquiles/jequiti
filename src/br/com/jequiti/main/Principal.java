package br.com.jequiti.main;

import java.util.Arrays;
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

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		// Presentes para amigo secreto (mais de R$ 50)
		produtos.stream()
			.filter(p -> p.getPreco() > 50)
			.forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------");

		// Colônias
		produtos.stream()
			.filter(p -> p.getNome().startsWith("COLONIA"))
			.forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------");

		// Produtos Masculinos
		produtos.stream()
		.filter(p -> p.getNome().contains("MASCULIN"))
		.forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------");
		
		double somaDosPrecos = produtos.stream()
			.map(p -> p.getPreco())
			.reduce(0.0, (total, preco) -> total + preco);
		System.out.println(somaDosPrecos);
	}

}
