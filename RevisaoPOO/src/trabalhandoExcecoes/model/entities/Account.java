package trabalhandoExcecoes.model.entities;

import trabalhandoExcecoes.model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		
		if (balance < 0 || withdrawLimit < 0) {
			throw new DomainException("Depósito inicial e limite de saque tem que ser "
					+ "maior que zero!");
		}
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		withdrawValidate(amount);
		balance -= amount;
	}
	
	private void withdrawValidate(Double amount) {
		if (amount > getBalance()) {
			throw new DomainException("Saldo insuficiente para realizar o saque");
		}
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Saque ultrapassa o limite da conta");
		}
	}
	
	

}
