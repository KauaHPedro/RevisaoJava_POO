package revisao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		double media = 0.00;
		
		Product[] produtos = new Product[n];
		
		for (int i = 0; i < produtos.length; i++) {
			String name = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine();
			produtos[i] = new Product(name, price);
			
			media += produtos[i].getPrice();
		}
		
		System.out.printf("%.2f", media / produtos.length);
		
		sc.close();
		
		}
	}	