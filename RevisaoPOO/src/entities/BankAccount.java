package entities;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(String name, double balance, int accountNumber) {
		this.accountNumber = accountNumber;
		deposit(balance);
		this.name = name;
	}
	
	public BankAccount(String name, int accountNumber) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.0;
	}
	
	@Override
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}

}
