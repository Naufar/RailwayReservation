package com.naufar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naufar.dao.PassengerDao;
import com.naufar.entity.BookingConfirmation;
import com.naufar.entity.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerDao passengerDao;

	@Override
	public BookingConfirmation bookTickets(List<Passenger> passengers) {
		
		BookingConfirmation bookingConfirmation=passengerDao.bookTickets(passengers);
		
		return bookingConfirmation;
	}

}
