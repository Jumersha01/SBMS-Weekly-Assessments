package com.nt.repository;

import java.util.List;

import org.springframework.core.annotation.Order;

import com.nt.model.OrderFood;

public interface IFoodOrderDAO {
	
  void placeOrder(OrderFood order) throws Exception;
  List<OrderFood>  getAllOrders() throws Exception;
  void deleteOrder(int id) throws Exception;
  void updateOrder(OrderFood order) throws Exception;
  
  
}
