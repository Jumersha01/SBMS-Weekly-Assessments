package com.nt.service;

import java.util.List;

import com.nt.model.OrderFood;

public interface IFoodOrderService {
	
  void addOrder(OrderFood order) throws Exception;
  List<OrderFood> viewOrder() throws Exception;
  void deleteOrder(int id) throws Exception;
  void updateOrder(OrderFood order) throws Exception;
  
}
