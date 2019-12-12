package com.naufar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naufar.entity.BookingConfirmation;
import com.naufar.entity.Coach;
import com.naufar.entity.Passenger;
import com.naufar.service.PassengerService;
import com.naufar.util.ApiResponse;

@RestController
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	
	public static Coach[] coaches=new Coach[4];

	static {
		System.out.println("Static block");
		coaches[0]=new Coach();
		coaches[1]=new Coach();
		coaches[2]=new Coach();
		coaches[3]=new Coach();
	
	}
	
	@GetMapping("/getAvailableTickets")
	public ResponseEntity<?> getAvailableTickets() {
		Integer availabeleSeats = 0;
		for(Coach coach :coaches) {
			availabeleSeats = availabeleSeats + coach.getAvailableTickets();
		}
		return new ResponseEntity<>(new ApiResponse("Success",availabeleSeats),HttpStatus.OK);
	}
	
	
	
	@PostMapping("/bookTickets")
	public ResponseEntity<?> bookTickets(@RequestBody List<Passenger> passengers) {
		
		
		BookingConfirmation bookingConfirmation=passengerService.bookTickets(passengers);
		return new ResponseEntity<>(new ApiResponse("Success",bookingConfirmation),HttpStatus.OK);
		
	}
	
}
