package revisao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.*;
import utilitaries.Calculator;
import utilitaries.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do Dólar: ");
		double cotacao = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double qntd = sc.nextDouble();
		
		System.out.println("Valor a ser pago em reais: " + 
		CurrencyConverter.dollarToReal(cotacao, qntd));
		
		sc.close();

	}

}
