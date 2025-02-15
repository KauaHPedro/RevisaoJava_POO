package utilitaries;

import java.time.format.DateTimeFormatter;

public class ConversoresDataHora {
	
	public static DateTimeFormatter diaMesAno() {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fmt1;
	}
	
	public static DateTimeFormatter mesAno() {
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		return fmt2;
	}
	
	public static DateTimeFormatter diaMesAnoHora() {
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return fmt3;
	}

}
