package revisao_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		// Account acc1 = new Account(1000, "Kauã", 500.00);
		Account bacc1 = new BusinessAccount(1001, "Luis", 1000.00, 500.00);
		Account sacc1 = new SavingsAccount(1002, "Elis", 500.00, 1.0);
		
		List<Account> contas = new ArrayList<>();
		contas.add(bacc1);
		contas.add(sacc1);
		
		double total = 0.0;
		
		for (Account conta : contas) {
			total += conta.getBalance();
		}
		
		System.out.println(total);
		
		
	}

}
