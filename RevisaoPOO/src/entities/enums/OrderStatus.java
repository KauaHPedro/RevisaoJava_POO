package entities.enums;

public enum OrderStatus {
	
	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private final int codigo;
	
	OrderStatus(int codigo) {
		this.codigo = codigo;
	}
	
	public static OrderStatus converteCodigo(int codigo) {
		for (OrderStatus status : OrderStatus.values()) {
			
			if (status.codigo == codigo) {
				return status;
			}
		}
		
		return null;
	}

}
