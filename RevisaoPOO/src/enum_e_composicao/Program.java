package enum_e_composicao;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import utilitaries.ConversoresDataHora;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do departamento: ");
		String depto = sc.nextLine();
		
		
		
		System.out.println("Digite os dados do funcionário: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Nível: ");
		int nivel = sc.nextInt();
		
		System.out.print("Salário base: ");
		double base = sc.nextDouble();
		
		Worker funcionario = new Worker(nome, WorkerLevel.converteCodigo(nivel), 
				base, new Department(depto));
		
		System.out.print("Quantos contratos esse funcionário terá? ");
		int contratos = sc.nextInt();
		
		for(int i  = 1; i <= contratos; i++) {
			
			sc.nextLine();
			
			System.out.println("Digite os dados do contrato #" + i);
			
			System.out.print("Data (DD/MM/YYYY): ");
			LocalDate data = LocalDate.parse(sc.nextLine(), ConversoresDataHora.diaMesAno());
			
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			
			System.out.print("Duração em horas: ");
			int horas = sc.nextInt();
			
			funcionario.addContract(new HourContract(data, valor, horas));
			
		}
		
		sc.nextLine();
		
		System.out.print("Digite o mês e o ano para calcular o total (MM/YYYY): ");
		YearMonth data = YearMonth.parse(sc.nextLine(), ConversoresDataHora.mesAno());
		int mes = data.getMonthValue();
		int ano = data.getYear();
		
		System.out.println("Nome: " + funcionario.getName());
		System.out.println("Departamento: " + funcionario.getDepartment());
		System.out.println("Total para o mês " + 
		data.format(ConversoresDataHora.mesAno()) + ": " + funcionario.income(ano, mes));
		
		sc.close();
		
	}
	

}
