package com.naufar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naufar.entity.BookingConfirmation;
import com.naufar.entity.Passenger;

@Service
public interface PassengerService {

	BookingConfirmation bookTickets(List<Passenger> passengers);

}
