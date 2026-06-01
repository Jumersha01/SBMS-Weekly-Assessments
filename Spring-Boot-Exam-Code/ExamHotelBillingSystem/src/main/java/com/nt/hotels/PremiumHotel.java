package com.nt.hotels;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile("premium")
@Data

public class PremiumHotel implements Hotels {
 
@Value("Junaid")
 String customerNmae;
	
 @Value("12")
  int numberOfDays;
 
 @Value("1300")
 double roomRent;
 
 @Value("5000")
  double foodCharges;
 
 @Value("2000")
  double laundry;
}
