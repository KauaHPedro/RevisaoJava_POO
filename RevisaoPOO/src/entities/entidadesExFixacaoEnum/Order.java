package entities.entidadesExFixacaoEnum;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;
import utilitaries.ConversoresDataHora;

public class Order {
	
	private Instant moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItens = new ArrayList<>();

	public Order(Instant moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}
	
	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		if (orderItens.contains(item)) {
			orderItens.remove(item);
		} else {
			System.out.println("Item não encontrado no pedido");
		}
	}
	
	public Double total() {
		double orderTotal = 0.00;
		
		for (OrderItem item : orderItens) {
			orderTotal += item.getTotalPrice();
		}
		
		return orderTotal;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("RESUMO DO PEDIDO: \n");
		sb.append("Data e Hora do pedido: ");
		sb.append(LocalDateTime.ofInstant(moment, ZoneId.systemDefault()).
				format(ConversoresDataHora.diaMesAnoHora()) + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		
		sb.append("Itens do pedido: \n");
		
		for (OrderItem item : orderItens) {
			sb.append(item + "\n");
		}
		
		sb.append("Total do pedido: $" + total());
		
		return sb.toString();
	}
	
	

}
