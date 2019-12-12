package com.naufar.entity;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class BookingConfirmation {

	private Integer totalTickets;
	private List<String> seatNumbers=new ArrayList<>();
	
	public Integer getTotalTickets() {
		return totalTickets;
	}
	public void setTotalTickets(Integer totalTickets) {
		this.totalTickets = totalTickets;
	}
	public List<String> getSeatNumbers() {
		return seatNumbers;
	}
	public void setSeatNumbers(List<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}
	@Override
	public String toString() {
		return "BookingConfirmation [totalTickets=" + totalTickets + ", seatNumbers=" + seatNumbers + "]";
	} 
	
	
}
