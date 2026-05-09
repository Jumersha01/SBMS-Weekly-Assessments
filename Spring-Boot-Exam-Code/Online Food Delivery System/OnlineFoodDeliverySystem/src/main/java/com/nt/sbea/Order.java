package com.nt.sbea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Order {

	

	MenuService service;
	
	@Autowired
	public Order(MenuService service) {
		this.service=service;
	}
	public void placeOrder() {
      System.out.println("The order has been placed.");
	}
	
	public void viewMenu() {
	  service.menuData();	
	}
	
	public void cancelOrder() {
		System.out.println("The order has been cancelled");
	}
	
	
}
