package trabalhandoExcecoes.application;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import trabalhandoExcecoes.model.entities.Reservation;
import utilitaries.ConversoresDataHora;

public class Program {

	public static void main(String[] args) {
		
		try {
			int room = 8021;
			LocalDate checkin = LocalDate.parse("28/09/2025", ConversoresDataHora.diaMesAno());
			LocalDate checkout = LocalDate.parse("26/09/2025", ConversoresDataHora.diaMesAno());
			Reservation r = new Reservation(room, checkin, checkout);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (DateTimeParseException e) {
			System.out.println("Formato de data inválido!");
		}
		
	}

}
