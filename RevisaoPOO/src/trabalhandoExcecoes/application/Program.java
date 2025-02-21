package trabalhandoExcecoes.application;

import java.time.LocalDate;

import trabalhandoExcecoes.model.entities.Reservation;
import utilitaries.ConversoresDataHora;

public class Program {

	public static void main(String[] args) {
		
		int room = 8021;
		LocalDate checkin = LocalDate.parse("28/09/20149", ConversoresDataHora.diaMesAno());
		LocalDate checkout = LocalDate.parse("26/09/2019", ConversoresDataHora.diaMesAno());
		
		try {
			Reservation r = new Reservation(room, checkin, checkout);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
