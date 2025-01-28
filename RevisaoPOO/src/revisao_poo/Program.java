package revisao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount b = null;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String initial = sc.nextLine().toLowerCase();

		while (!initial.equals("y") && !initial.equals("n")) {
			System.out.print("Invalid choice! Try again: ");
			initial = sc.nextLine().toLowerCase();
		}

			if (initial.equals("y")) {
				System.out.print("Enter initial deposit value: ");
				double value = sc.nextDouble();
				b = new BankAccount(holder, value, number);
			} else {
				b = new BankAccount(holder, number);
			} 

			System.out.println("Account data: ");
			System.out.println(b);

			System.out.print("Enter a deposit value: ");
			b.deposit(sc.nextDouble());

			System.out.println("Updated account data: ");
			System.out.println(b);

			System.out.print("Enter a withdraw value: ");
			b.withdraw(sc.nextDouble());

			System.out.println("Updated account data: ");
			System.out.println(b);

			sc.close();
		}
	}	