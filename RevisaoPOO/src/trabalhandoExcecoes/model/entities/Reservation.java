package trabalhandoExcecoes.model.entities;

import java.time.LocalDate;
import java.time.Period;

import utilitaries.ConversoresDataHora;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		validateDates(checkIn, checkOut);
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}


	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public Integer duration() {
		
		return Period.between(checkIn, checkOut).getDays();
	
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		validateDates(checkIn, checkOut);
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	private void validateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();

        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new IllegalArgumentException("As datas de check-in e check-out devem ser futuras.");
        }
        
        if (!checkOut.isAfter(checkIn)) {
            throw new IllegalArgumentException("A data de check-out deve ser posterior à data de check-in.");
        }
    }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber + ", ");
		sb.append("check-in: ");
		sb.append(checkIn.format(ConversoresDataHora.diaMesAno()) + ", ");
		sb.append("check-out: ");
		sb.append(checkOut.format(ConversoresDataHora.diaMesAno()) + ", ");
		sb.append(duration() + " nights");
		
		return sb.toString();
	}

}
