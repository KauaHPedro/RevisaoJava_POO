package entities.entidadesExFixacaoEnum;

public class OrderItem {
	
	private Integer quantity;
	private Product product;
	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return product.getPrice();
	}

	public Double getTotalPrice() {
		return subTotal();
	}
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * product.getPrice();
	}
	
	@Override
    public String toString() {
        return product.getName()
                + ", Preço unitário: $" + String.format("%.2f", getPrice())
                + ", Quantidade: " + quantity
                + ", Total: $" + String.format("%.2f", subTotal());
    }

}
