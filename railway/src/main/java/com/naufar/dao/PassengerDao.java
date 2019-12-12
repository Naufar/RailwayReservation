package com.naufar.dao;

import java.util.List;

import com.naufar.entity.BookingConfirmation;
import com.naufar.entity.Passenger;

public interface PassengerDao {

	BookingConfirmation bookTickets(List<Passenger> passengers);

}
