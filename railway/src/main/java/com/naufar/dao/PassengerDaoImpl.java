package com.naufar.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naufar.controller.PassengerController;
import com.naufar.entity.BookingConfirmation;
import com.naufar.entity.LowerBerth;
import com.naufar.entity.MiddleBerth;
import com.naufar.entity.Passenger;
import com.naufar.entity.Seat;
import com.naufar.entity.SideBerth;
import com.naufar.entity.UpperBerth;

@Repository
public class PassengerDaoImpl implements PassengerDao {
	
	@Autowired
	BookingConfirmation bookingConfirmation;
	
	private static List<Passenger> waitingList=new ArrayList<>(5);
	private static final String S1="Coach s1";
	private static final String S2="Coach s2";
	private static final String S3="Coach s3";
	private static final String S4="Coach s4";
	private static final String NO_TICKETS="No tickets available";
	List<String> seatNames= new ArrayList<>();
	
	

	@Override
	public BookingConfirmation bookTickets(List<Passenger> passengers) {
		
		bookingConfirmation.setTotalTickets(passengers.size());
		for(Passenger pass: passengers) {
			
		//COACH s1
		if(PassengerController.coaches[0].getAvailableTickets()>0 && PassengerController.coaches[1].getAvailableTickets()>0 && PassengerController.coaches[2].getAvailableTickets()>0 
				&& PassengerController.coaches[3].getAvailableTickets()>0) {
			
			if (pass.getBerthPreference().equalsIgnoreCase("Upper") && pass.getWithChild().equals(Boolean.FALSE) && pass.getAge() < 60) {

				if (PassengerController.coaches[0].getAvailUpperBerth() > 0) {
					

					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[0].getAvailUpperBerth() == 2 ? S1 + " Upper berth 2": S1 + " Upper berth 1");
					UpperBerth up = new UpperBerth();
					up.setSeats(seat);

					if (PassengerController.coaches[0].getAvailUpperBerth() > 1)
						PassengerController.coaches[0].getUpperBerth()[0] = up;
					else
						PassengerController.coaches[0].getUpperBerth()[1] = up;

					PassengerController.coaches[0].setAvailableTickets(PassengerController.coaches[0].getAvailableTickets() - 1);
					PassengerController.coaches[0].setAvailUpperBerth(PassengerController.coaches[0].getAvailUpperBerth() - 1);
					seatNames.add(seat.getSeatName());
				} else if (PassengerController.coaches[1].getAvailUpperBerth() > 0) {

					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[1].getAvailUpperBerth() == 2 ? S2 + " upper berth 2": S2 + " upper berth 1");
					UpperBerth up = new UpperBerth();
					up.setSeats(seat);

					if (PassengerController.coaches[1].getAvailUpperBerth() > 1)
						PassengerController.coaches[1].getUpperBerth()[0] = up;
					else
						PassengerController.coaches[1].getUpperBerth()[1] = up;

					PassengerController.coaches[1].setAvailableTickets(PassengerController.coaches[1].getAvailableTickets() - 1);
					PassengerController.coaches[1].setAvailUpperBerth(PassengerController.coaches[1].getAvailUpperBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

				else if (PassengerController.coaches[2].getAvailUpperBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[2].getAvailUpperBerth() == 2 ? S3 + " Upper berth 2": S3 + " Upper berth 1");
					UpperBerth up = new UpperBerth();
					up.setSeats(seat);

					if (PassengerController.coaches[2].getAvailUpperBerth() > 1)
						PassengerController.coaches[2].getUpperBerth()[0] = up;
					else
						PassengerController.coaches[2].getUpperBerth()[1] = up;

					PassengerController.coaches[2].setAvailableTickets(PassengerController.coaches[2].getAvailableTickets() - 1);
					PassengerController.coaches[2].setAvailUpperBerth(PassengerController.coaches[2].getAvailUpperBerth() - 1);
					seatNames.add(seat.getSeatName());
				} else if (PassengerController.coaches[3].getAvailUpperBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[3].getAvailUpperBerth() == 2 ? S4 + " Upper berth 2": S4 + " Upper berth 1");
					UpperBerth up = new UpperBerth();
					up.setSeats(seat);

					if (PassengerController.coaches[3].getAvailUpperBerth() > 1)
						PassengerController.coaches[3].getUpperBerth()[0] = up;
					else
						PassengerController.coaches[3].getUpperBerth()[1] = up;

					PassengerController.coaches[3].setAvailableTickets(PassengerController.coaches[1].getAvailableTickets() - 1);
					PassengerController.coaches[3].setAvailUpperBerth(PassengerController.coaches[1].getAvailUpperBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

			}
			
			
			
			
			else if (pass.getBerthPreference().equalsIgnoreCase("Middle") && pass.getWithChild().equals(Boolean.FALSE) && pass.getAge() < 60) {
				if (PassengerController.coaches[0].getAvailMiddleBerth() > 0) {

					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[0].getAvailMiddleBerth() == 2 ? S1 + " middle berth 2": S1 + " middle berth 1");
					MiddleBerth middle = new MiddleBerth();
					middle.setSeats(seat);

					if (PassengerController.coaches[0].getAvailMiddleBerth() > 1)
						PassengerController.coaches[0].getMiddleBerth()[0] = middle;
					else
						PassengerController.coaches[0].getMiddleBerth()[1] = middle;

					PassengerController.coaches[0].setAvailableTickets(PassengerController.coaches[0].getAvailableTickets() - 1);
					PassengerController.coaches[0].setAvailMiddleBerth(PassengerController.coaches[0].getAvailMiddleBerth() - 1);
					seatNames.add(seat.getSeatName());
				} else if (PassengerController.coaches[1].getAvailMiddleBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[1].getAvailMiddleBerth() == 2 ? S2 + " Middle berth 2": S2 + " Middle berth 1");
					MiddleBerth middle = new MiddleBerth();
					middle.setSeats(seat);

					if (PassengerController.coaches[1].getAvailMiddleBerth() > 1)
						PassengerController.coaches[1].getMiddleBerth()[0] = middle;
					else
						PassengerController.coaches[1].getMiddleBerth()[1] = middle;

					PassengerController.coaches[1].setAvailableTickets(PassengerController.coaches[1].getAvailableTickets() - 1);
					PassengerController.coaches[1].setAvailMiddleBerth(PassengerController.coaches[1].getAvailMiddleBerth() - 1);
					seatNames.add(seat.getSeatName());
				} else if (PassengerController.coaches[2].getAvailMiddleBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[2].getAvailMiddleBerth() == 2 ? S3 + " Middle berth 2": S3 + " Middle berth 1");
					MiddleBerth middle = new MiddleBerth();
					middle.setSeats(seat);

					if (PassengerController.coaches[2].getAvailMiddleBerth() > 1)
						PassengerController.coaches[2].getMiddleBerth()[0] = middle;
					else
						PassengerController.coaches[2].getMiddleBerth()[1] = middle;

					PassengerController.coaches[2].setAvailableTickets(PassengerController.coaches[2].getAvailableTickets() - 1);
					PassengerController.coaches[2].setAvailMiddleBerth(PassengerController.coaches[2].getAvailMiddleBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

				else if (PassengerController.coaches[3].getAvailMiddleBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[3].getAvailMiddleBerth() == 2 ? S4 + " Middle berth 2": S4 + " Middle berth 1");
					MiddleBerth middle = new MiddleBerth();
					middle.setSeats(seat);

					if (PassengerController.coaches[3].getAvailMiddleBerth() > 1)
						PassengerController.coaches[3].getMiddleBerth()[0] = middle;
					else
						PassengerController.coaches[3].getMiddleBerth()[1] = middle;

					PassengerController.coaches[3].setAvailableTickets(PassengerController.coaches[3].getAvailableTickets() - 1);
					PassengerController.coaches[3].setAvailMiddleBerth(PassengerController.coaches[3].getAvailMiddleBerth() - 1);
					seatNames.add(seat.getSeatName());
				}
			}
			
			
			
			
			
			else if (pass.getBerthPreference().equalsIgnoreCase("Lower") || pass.getWithChild().equals(Boolean.TRUE) || pass.getAge() > 60) {
				if (PassengerController.coaches[0].getAvailLowerBerth() > 0) {

					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[0].getAvailLowerBerth() == 2 ? S1 + " Lower berth 2": S1 + " Lower berth 1");
					LowerBerth lower = new LowerBerth();
					lower.setSeats(seat);

					if (PassengerController.coaches[0].getAvailMiddleBerth() > 1)
						PassengerController.coaches[0].getLowerBerth()[0] = lower;
					else
						PassengerController.coaches[0].getLowerBerth()[1] = lower;

					PassengerController.coaches[0].setAvailableTickets(PassengerController.coaches[0].getAvailableTickets() - 1);
					PassengerController.coaches[0].setAvailLowerBerth(PassengerController.coaches[0].getAvailLowerBerth() - 1);
					seatNames.add(seat.getSeatName());
				} else if (PassengerController.coaches[1].getAvailLowerBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[1].getAvailLowerBerth() == 2 ? S2 + " Lower berth 2": S2 + " Lower berth 1");
					LowerBerth lower = new LowerBerth();
					lower.setSeats(seat);

					if (PassengerController.coaches[1].getAvailMiddleBerth() > 1)
						PassengerController.coaches[1].getLowerBerth()[0] = lower;
					else
						PassengerController.coaches[1].getLowerBerth()[1] = lower;

					PassengerController.coaches[1].setAvailableTickets(PassengerController.coaches[1].getAvailableTickets() - 1);
					PassengerController.coaches[1].setAvailLowerBerth(PassengerController.coaches[1].getAvailLowerBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

				else if (PassengerController.coaches[2].getAvailLowerBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[2].getAvailLowerBerth() == 2 ? S3 + " Lower berth 2": S3 + " Lower berth 1");
					LowerBerth lower = new LowerBerth();
					lower.setSeats(seat);

					if (PassengerController.coaches[2].getAvailMiddleBerth() > 1)
						PassengerController.coaches[2].getLowerBerth()[0] = lower;
					else
						PassengerController.coaches[2].getLowerBerth()[1] = lower;

					PassengerController.coaches[2].setAvailableTickets(PassengerController.coaches[2].getAvailableTickets() - 1);
					PassengerController.coaches[2].setAvailLowerBerth(PassengerController.coaches[2].getAvailLowerBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

				else if (PassengerController.coaches[3].getAvailLowerBerth() > 0) {
					
					Seat seat = new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[3].getAvailLowerBerth() == 2 ? S4 + " Lower berth 2": S4 + " Lower berth 1");
					LowerBerth lower = new LowerBerth();
					lower.setSeats(seat);

					if (PassengerController.coaches[3].getAvailLowerBerth() > 1)
						PassengerController.coaches[3].getLowerBerth()[0] = lower;
					else
						PassengerController.coaches[3].getLowerBerth()[1] = lower;

					PassengerController.coaches[3].setAvailableTickets(PassengerController.coaches[3].getAvailableTickets() - 1);
					PassengerController.coaches[3].setAvailLowerBerth(PassengerController.coaches[3].getAvailLowerBerth() - 1);
					seatNames.add(seat.getSeatName());
				}

			}
		
			//RAC S1
			else  {
				
				if(PassengerController.coaches[0].getAvailSideBerth()>0) {
					
					Seat seat=new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[0].getAvailSideBerth()==2? S1+" Side berth 2":S1+" Side berth 1");
					SideBerth side=new SideBerth();
					side.setSeats(seat);
					
				if(PassengerController.coaches[0].getAvailSideBerth()>1)
					PassengerController.coaches[0].getSideBert()[0] = side;
				else
					PassengerController.coaches[0].getSideBert()[1] = side;
				
				PassengerController.coaches[0].setAvailableTickets(PassengerController.coaches[0].getAvailableTickets()-1);
				PassengerController.coaches[0].setAvailSideBerth(PassengerController.coaches[0].getAvailSideBerth()-1);
				seatNames.add(seat.getSeatName());
				}
			
			//RAC S2
			
				if(PassengerController.coaches[1].getAvailSideBerth()>0) {
					
					Seat seat=new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[1].getAvailSideBerth()==2? S2+" Side berth 2":S2+" Side berth 1");
					SideBerth side=new SideBerth();
					side.setSeats(seat);
					
				if(PassengerController.coaches[1].getAvailSideBerth()>1)
					PassengerController.coaches[1].getSideBert()[0] = side;
				else
					PassengerController.coaches[1].getSideBert()[1] = side;
				
				PassengerController.coaches[1].setAvailableTickets(PassengerController.coaches[1].getAvailableTickets()-1);
				PassengerController.coaches[1].setAvailSideBerth(PassengerController.coaches[1].getAvailSideBerth()-1);
				seatNames.add(seat.getSeatName());
				}
			
			//RAC S3
			
				if(PassengerController.coaches[2].getAvailSideBerth()>0) {
					
					Seat seat=new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[2].getAvailSideBerth()==2? S3+" Side berth 2":S3+" Side berth 1");
					SideBerth side=new SideBerth();
					side.setSeats(seat);
					
				if(PassengerController.coaches[2].getAvailSideBerth()>1)
					PassengerController.coaches[2].getSideBert()[0] = side;
				else
					PassengerController.coaches[2].getSideBert()[1] = side;
				
				PassengerController.coaches[2].setAvailableTickets(PassengerController.coaches[2].getAvailableTickets()-1);
				PassengerController.coaches[2].setAvailSideBerth(PassengerController.coaches[2].getAvailSideBerth()-1);
				seatNames.add(seat.getSeatName());
				}
			
			//RAC S4
			
				if(PassengerController.coaches[3].getAvailSideBerth()>0) {
					
					Seat seat=new Seat();
					seat.setPassenger(pass);
					seat.setSeatName(PassengerController.coaches[3].getAvailSideBerth()==2? S4+" Side berth 2":S4+" Side berth 1");
					SideBerth side=new SideBerth();
					side.setSeats(seat);
					
				if(PassengerController.coaches[3].getAvailSideBerth()>1)
					PassengerController.coaches[3].getSideBert()[0] = side;
				else
					PassengerController.coaches[3].getSideBert()[1] = side;
				
				PassengerController.coaches[3].setAvailableTickets(PassengerController.coaches[3].getAvailableTickets()-1);
				PassengerController.coaches[3].setAvailSideBerth(PassengerController.coaches[3].getAvailSideBerth()-1);
				seatNames.add(seat.getSeatName());
				}
			}
		}
		
			
		
		//Waiting List
		else if(waitingList.size()<=5) {
			waitingList.add(pass);
		}
		else 
			seatNames.add(NO_TICKETS);
			
		}
		
		bookingConfirmation.setSeatNumbers(seatNames);
		return bookingConfirmation;
	}

}
