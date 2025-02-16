package revisao_heranca_polimorfismo;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account(1000, "Kauã", 500.00);
		BusinessAccount bacc1 = new BusinessAccount(1001, "Luis", 15.00, 1000.00);
		SavingsAccount sacc1 = new SavingsAccount(1002, "Elis", 500.00, 1.0);
		
		Account testeSaving = new SavingsAccount(1003, "Maria", 500.00, 1.0);
		
		SavingsAccountPlus teste2 = new SavingsAccountPlus(1004, "Antonia", 500.00, 1.0);
		
		acc1.withdraw(20.00);
		//bacc1.withdraw(20.00);
		sacc1.withdraw(20.00);
		testeSaving.withdraw(20.00);
		teste2.withdraw(20.00);
		
		System.out.println(acc1.getBalance());  
		System.out.println(bacc1.getBalance());  
		System.out.println(sacc1.getBalance()); 
		System.out.println(testeSaving.getBalance());
		System.out.println(teste2.getBalance());
		
		// Mesmo que eu esteja armazenando a instância da subclasse numa variável
		// do tipo da superclasse, métodos sobreescritos ainda serão chamados com a
		// implementação da subclasse
		
	}

}
