package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		if (this.quantity >= quantity) {
			this.quantity -= quantity;
		} else {
			System.out.println("Erro: Quantidade insuficiente em estoque!");
		}
	}
	
	@Override
	public String toString() {
		return name +  ", $" + String.format("%.2f", price) + ", "
				+ quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
	}

}
