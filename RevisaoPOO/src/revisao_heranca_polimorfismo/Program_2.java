package revisao_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;

public class Program_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> figuras = new ArrayList<>();
		
		System.out.print("Digite o número de formas: ");
		int numeroFormas = sc.nextInt();
		
		for(int i = 1; i <= numeroFormas; i++) {
			sc.nextLine();
			System.out.println("Dados da forma #" + i);
			System.out.print("Retângulo ou círculo (r/c)? ");
			char resposta = sc.nextLine().toLowerCase().charAt(0);
			System.out.print("Qual a cor? ");
			int cor = sc.nextInt();
			
			if(resposta == 'r') {
				System.out.print("Comprimento: ");
				double comprimento = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				figuras.add(new Rectangle(Color.converteCodigo(cor), largura, comprimento));
				
			} else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				
				figuras.add(new Circle(Color.converteCodigo(cor), raio));
			}
		}
		
		System.out.println();
		System.out.println("ÁREAS: ");
		
		for(Shape figura : figuras) {
			System.out.println(String.format("%.2f", figura.area()));
			System.out.println(figura.getColor());
		}
		
		sc.close();

	}

}
