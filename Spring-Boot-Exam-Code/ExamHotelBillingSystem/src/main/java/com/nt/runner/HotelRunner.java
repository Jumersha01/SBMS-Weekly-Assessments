package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.hotels.PremiumHotel;

@Component
public class HotelRunner implements CommandLineRunner {

	@Autowired
	 PremiumHotel hotel;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Roome cost: "+(hotel.getNumberOfDays()*hotel.getRoomRent()));
		
		System.out.println("SubTotal: "+(hotel.getRoomRent()+hotel.getFoodCharges()+hotel.getLaundry()));

		double fi =(hotel.getRoomRent()+hotel.getFoodCharges()+hotel.getLaundry());
		System.out.println("Final Price: "+(fi-(fi*0.18)));
		
	}

}
