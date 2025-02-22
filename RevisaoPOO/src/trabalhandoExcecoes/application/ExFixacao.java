package trabalhandoExcecoes.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import trabalhandoExcecoes.model.entities.Account;
import trabalhandoExcecoes.model.exceptions.DomainException;

public class ExFixacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite os dados da conta: ");
		
		try {
			
			System.out.print("Número da conta: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Titular da conta: ");
			String titular = sc.nextLine();
			
			System.out.print("Depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			Account conta = new Account(number, titular, depositoInicial, limiteSaque);
			
			System.out.println();
			
			System.out.print("Digite o valor do saque: ");
			double saque = sc.nextDouble();
			
			conta.withdraw(saque);
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getBalance()));
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Dado informado no formato incorreto!");
		}
		
		sc.close();
	}

}
