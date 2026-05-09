package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ConterService {
  
	int counter =0;
 
	
	public void increament() {
		counter++;
	}
	public void viewCounter() {
		System.out.println("Increased Counter");
		System.out.println(counter);
	}
}
