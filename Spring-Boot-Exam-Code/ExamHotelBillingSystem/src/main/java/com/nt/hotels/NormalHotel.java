package com.nt.hotels;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component
@Profile("normal")
@Data

public class NormalHotel implements Hotels {

	@Value("Junaid")
 String customerNmae;
		
	 @Value("10")
	 int numberOfDays;
	 
	 @Value("500")
	 double foodCharges;
	 
	 @Value("200")
	 double laundry;
	
}
