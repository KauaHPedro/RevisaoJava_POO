package revisao_heranca_polimorfismo;

public class SavingsAccount extends Account {
	
	private Double interestRate;

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

}
