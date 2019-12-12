package com.naufar.entity;

public class Seat {

	private String seatName;
	
	private Passenger passenger;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	@Override
	public String toString() {
		return "Seat [seatName=" + seatName + ", passenger=" + passenger + "]";
	}
	
	
	
	
	
}
