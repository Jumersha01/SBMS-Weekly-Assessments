package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.Vehicle;

@Component("car")
public class Car implements Vehicle {
	 
	@Value("MH-19-2093")
	String vehicleNo;
	
	@Value("SRT")
	String brandName;
	
	@Value("Diesel")
	String fuelType;
	
	@Value("30.2")
	double milage;
	
	@Value("12000000")
	double price;

	@Override
	public void calculateTax() {
		System.out.println("The car road tax is: "+(this.price*0.12)+"\nInsurance Amount: "+(this.price*0.05+"\nFinal Amount: "+(this.price+(this.price*0.12)+(this.price*0.05))));
	}

}
