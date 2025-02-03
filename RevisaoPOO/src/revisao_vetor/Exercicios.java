package revisao_vetor;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Pessoa[] quartos = new Pessoa[10];
		
		System.out.print("Quantos estudantes irão alugar quartos? ");
		int estudantes = sc.nextInt();
		
		if (estudantes > 10) {
			System.out.println("Maior do que a capacidade permitida");
		} else {
			for (int i = 0; i < estudantes; i++) {
				sc.nextLine();
				
				System.out.println("Aluguel #" + (i + 1));
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Email: ");
				String email = sc.nextLine();
				
				System.out.print("Quarto: ");
				int quarto = sc.nextInt();
				
				quartos[quarto] = new Pessoa(nome, email);
			}
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.printf("%d: %s%n", i, quartos[i]);
			}
		}
		
		 
		sc.close();
	}

}
