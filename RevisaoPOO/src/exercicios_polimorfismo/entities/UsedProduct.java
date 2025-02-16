package exercicios_polimorfismo.entities;

import java.time.LocalDate;

import utilitaries.ConversoresDataHora;

public class UsedProduct extends Product {
	
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return  getName()
				+ " (used) $"
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(ConversoresDataHora.diaMesAno())
				+ ")";
	}

}
