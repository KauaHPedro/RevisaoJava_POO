package revisao_vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Listas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1));
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while(validaId(funcionarios, id)) {
				System.out.print("ID já usado, tente de novo: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Digite o ID do funcionário que terá aumento: ");
		int id = sc.nextInt();
		System.out.print("Digite a porcentagem: ");
		double porcentagem = sc.nextDouble();
		
		Funcionario f = funcionarios.stream().filter(x -> x.getId() == id).findFirst()
				.orElse(null);
		if (f!= null) {
			f.aumentarSalario(porcentagem);
		} else {
			System.out.println("Esse ID não existe");
		}
		
		System.out.println("Lista de funcionários: ");
		for(Funcionario x : funcionarios) {
			System.out.println(x);
		}
		
		sc.close();

	}
	
	public static boolean validaId(List<Funcionario> lista, int id) {
	    return lista.stream().anyMatch(x -> x.getId() == id);
	}


}
