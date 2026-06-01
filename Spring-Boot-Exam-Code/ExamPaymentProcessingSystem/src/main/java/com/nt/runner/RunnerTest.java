package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.services.PaymentService;
@Component
public class RunnerTest implements CommandLineRunner {

	@Autowired
	private PaymentService service;
	
	@Override
	public void run(String... args) throws Exception {
	 System.out.println(service.toString());	
      
	}

}
