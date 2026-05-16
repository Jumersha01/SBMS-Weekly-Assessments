package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.OrderFood;
import com.nt.service.IFoodOrderService;

@Controller("foodControll")
public class FoodController {
  
	@Autowired
	IFoodOrderService service;
	
	public void addOrder(OrderFood order) throws Exception {
		service.addOrder(order);
	}
	
	public List<OrderFood> getOrder() throws Exception{
		return service.viewOrder();
	}
	
	public void deleteOrder(int id) throws Exception {
		service.deleteOrder(id);
	}
	
	public void updateOrder(OrderFood order) throws Exception {
		service.updateOrder(order);
	}
	
}
