package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.OrderFood;
import com.nt.repository.IFoodOrderDAO;

@Service("foodService")
public class FoodServiceImp implements IFoodOrderService {

	@Autowired
	IFoodOrderDAO ifooddao;
	
	@Override
	public void addOrder(OrderFood order) throws Exception {
		ifooddao.placeOrder(order);

	}

	@Override
	public List<OrderFood> viewOrder() throws Exception {
		List<OrderFood> orders = ifooddao.getAllOrders();
		return orders;
	}

	@Override
	public void deleteOrder(int id) throws Exception {
		ifooddao.deleteOrder(id);

	}

	@Override
	public void updateOrder(OrderFood order) throws Exception {
		ifooddao.updateOrder(order);

	}

}
