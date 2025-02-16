package exercicios_polimorfismo.application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios_polimorfismo.entities.ImportedProduct;
import exercicios_polimorfismo.entities.Product;
import exercicios_polimorfismo.entities.UsedProduct;
import utilitaries.ConversoresDataHora;

public class Program_Ex02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> produtos = new ArrayList<>();
		
		System.out.print("Digite o número de produtos que serão cadastrados: ");
		int numeroProds = sc.nextInt();
		
		for(int i = 1; i <= numeroProds; i++) {
			sc.nextLine();
			
			System.out.println("Dados do produto #" + i);
			System.out.print("Comum, usado ou importado? (c/u/i) ");
			char resposta = sc.nextLine().toLowerCase().charAt(0);
			
			while(true) {
				if (resposta == 'c' || resposta == 'u' || resposta == 'i') {
					break;
				} else {
					System.out.println("Opção incorreta! Tente novamente");
					resposta = sc.nextLine().toLowerCase().charAt(0);
				}
			}
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			if (resposta == 'i') {
				System.out.print("Taxas de importação: ");
				Double taxas = sc.nextDouble();
				
				produtos.add(new ImportedProduct(nome, preco, taxas));
			} else if (resposta == 'u') {
				
				System.out.print("Data de fabricação: ");
				
				LocalDate dataFab = LocalDate.parse(sc.next(), 
						ConversoresDataHora.diaMesAno());
				
				produtos.add(new UsedProduct(nome, preco, dataFab));
			} else {
				produtos.add(new Product(nome, preco));
			}
			
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO: ");
		
		for (Product produto : produtos) {
			System.out.println(produto.priceTag());
		}
		
		
		sc.close();
	}

}
