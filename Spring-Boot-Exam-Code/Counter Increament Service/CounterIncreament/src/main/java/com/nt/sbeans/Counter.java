package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Counter {
	@Autowired
	ConterService service;
	
	public void inC()
	{
		System.out.println("Increased Counter");
		service.increament();
	}
	public void show() {
		service.viewCounter();
	}
	

}
