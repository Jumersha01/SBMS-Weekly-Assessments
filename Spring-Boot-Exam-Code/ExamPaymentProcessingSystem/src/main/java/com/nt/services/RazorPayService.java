package com.nt.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;



@Component
@Profile("India")
@Data
@ToString
public class RazorPayService implements  PaymentService{
	
    @Value("${raz.pay}")
	private String gatWayName;
    
    @Value("${raz.charge}")
    private double transactionCharge;
    
    @Value("${raz.currency}")
    private String currency;
     
}
