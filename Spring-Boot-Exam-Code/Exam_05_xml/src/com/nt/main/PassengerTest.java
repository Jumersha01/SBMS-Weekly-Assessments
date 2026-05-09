package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbean.Passenger;

public class PassengerTest {

	public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
Object obj = context.getBean("psg");
Passenger passenger = (Passenger) obj;
IO.println(passenger.showPassengerDetails());
	}

}
