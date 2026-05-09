package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiscountCalculate {
@Value("${p.price}")
 double price;

@Value("${p.dis}")
double discountedPercentage;

@Value("#{${p.price} - (${p.price} * ${p.dis} / 100)}")
double finalPrice;

public void show() {
	System.out.println("price after discount is: "+this.finalPrice);
}
}
