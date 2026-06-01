package com.nt.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile("International")
@Data

public class PayPalService  implements PaymentService{
	
	 @Value("${payp.pay}")
		private String gatWayName;
	    
	    @Value("${payp.charge}")
	    private double transactionCharge;
	    
	    @Value("${payp.currency}")
	    private String currency;
	
}
