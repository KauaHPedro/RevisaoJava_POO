package exercicios_polimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios_polimorfismo.entities.PessoaFisica;
import exercicios_polimorfismo.entities.PessoaJuridica;
import exercicios_polimorfismo.entities.TaxPayer;

public class Program_Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> pagadores = new ArrayList<>();
		
		System.out.print("Digite o número de pagadores de impostos:  ");
		int numeroPagadores = sc.nextInt();
		
		for(int i = 1; i <= numeroPagadores; i++) {
			sc.nextLine();
			
			System.out.println("Dados do pagador #" + i);
			System.out.print("Pessoa Física ou Jurídica? (f/j) ");
			char resposta = sc.nextLine().toLowerCase().charAt(0);
			
			while(true) {
				if (resposta == 'f' || resposta == 'j') {
					break;
				} else {
					System.out.println("Opção incorreta! Tente novamente");
					resposta = sc.nextLine().toLowerCase().charAt(0);
				}
			}
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(resposta == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastos = sc.nextDouble();
				pagadores.add(new PessoaFisica(nome, rendaAnual, gastos));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroF = sc.nextInt();
				pagadores.add(new PessoaJuridica(nome, rendaAnual, numeroF));
			}

		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		
		double soma = 0.0;
		
		for(TaxPayer pagador : pagadores) {
			System.out.println(pagador);
			soma += pagador.totalImposto();
		}
		
		System.out.println();
		System.out.println("TOTAL DE IMPOSTOS: $" + String.format("%.2f", soma));
		sc.close();
		
	}
}
