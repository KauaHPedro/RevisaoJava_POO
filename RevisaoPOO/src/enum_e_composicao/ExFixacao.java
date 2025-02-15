package enum_e_composicao;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.entidadesExFixacaoEnum.Client;
import entities.entidadesExFixacaoEnum.Order;
import entities.entidadesExFixacaoEnum.OrderItem;
import entities.entidadesExFixacaoEnum.Product;
import entities.enums.OrderStatus;
import utilitaries.ConversoresDataHora;

public class ExFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do cliente: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.println("Data de nascimento (DD/MM/YYYY): ");
		String dataDeNascimento = sc.nextLine();
		
		Client client = new Client(nome, email, 
				LocalDate.parse(dataDeNascimento, ConversoresDataHora.diaMesAno()));
		
		System.out.println("Digite os dados do pedido: ");
		
		System.out.print("Status: ");
		int status = sc.nextInt();
		
		Order pedido = new Order(Instant.now(), 
				OrderStatus.converteCodigo(status), client);
		
		System.out.println("Quantos produtos terão neste pedido?");
		int numeroItens = sc.nextInt();
		
		for(int i = 1; i <= numeroItens; i++) {
			
			sc.nextLine();
			System.out.println("Dados do item #" + i);
			
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			OrderItem item = new OrderItem(quantidade, new Product(nomeProduto,
					precoProduto));
			
			pedido.addItem(item);
			
		}
		
		System.out.println();
		
		System.out.println(pedido);
		
		sc.close();

	}

}
