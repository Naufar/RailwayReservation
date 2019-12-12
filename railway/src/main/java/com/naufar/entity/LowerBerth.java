package com.naufar.entity;

public class LowerBerth {

	private Seat seats;

	public Seat getSeats() {
		return seats;
	}

	public void setSeats(Seat seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "UpperBerth [seats=" + seats + "]";
	}
	
}
