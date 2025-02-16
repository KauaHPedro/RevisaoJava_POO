package exercicios_polimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios_polimorfismo.entities.Employee;
import exercicios_polimorfismo.entities.OutsourcedEmployee;

public class Program_Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de funcionários: ");
		int numeroFuncionarios = sc.nextInt();
		
		List<Employee> funcionarios = new ArrayList<Employee>();
		
		for(int i = 1; i <= numeroFuncionarios; i++) {
			sc.nextLine();
			
			System.out.println("Dados do funcionário #" + i);
			System.out.print("Terceirizado? (s/n) ");
			
			char resposta = sc.nextLine().toLowerCase().charAt(0);
			
			while (true) {
				if (resposta == 's') {
					break;
				} else if (resposta == 'n' ) {
					break;
				} else {
					System.out.println("Opção incorreta! Tente de novo!");
					resposta = sc.nextLine().toLowerCase().charAt(0);
				}
			}
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (resposta == 's') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				
				funcionarios.add(new OutsourcedEmployee(nome, horas, valorPorHora,
						despesaAdicional));
			} else {
				funcionarios.add(new Employee(nome, horas, valorPorHora));
			}
			
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		
		for (Employee e : funcionarios) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
