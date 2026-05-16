package com.nt.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.OrderFood;

@Repository("dao")
public class FoodOrderDAOImpl implements IFoodOrderDAO {
	private static final String INSERT_QUERY = "Insert into FoodOrders values(?,?,?,?,?,?)";
	private static final String RETRIVE_QUERY = "Select ORDERID , CUSTOMERNAME, ITEMNAME  , QUANTITY,  PRICE,TOTALAMOUNT  from FoodOrders";
	private static final String DELETE_QUERY = "delete from FoodOders where ORDERID=?";
	private static final String UPDATE_QUERY = "UPDATE FoodOrders SET  CUSTOMERNAME=?,ITEMNAME =?, QUANTITY=? ,PRICE=?, TOTALAMOUNT=?WHERE ORDERID=?";

	@Autowired
	private DataSource ds;

	@Override
	public void placeOrder(OrderFood order) throws Exception {
		try (Connection con = ds.getConnection()) {
			PreparedStatement st = con.prepareStatement(INSERT_QUERY);
			st.setInt(1, order.getOrderId());
			st.setString(2, order.getCustomerName());
			st.setString(3, order.getItemName());
			st.setInt(4, order.getQuantity());
			st.setDouble(5, order.getPrice());
			st.setDouble(6, (order.getQuantity() * order.getPrice()));

			int rowCount = st.executeUpdate();
			if (rowCount >= 1) {
				System.err.println("Food Ordered...");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<OrderFood> getAllOrders() throws Exception {
		List<OrderFood> foodList = new ArrayList<>();

		try (Connection con = ds.getConnection()) {
			PreparedStatement st = con.prepareStatement(RETRIVE_QUERY);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String cname = rs.getString(2);
				String itemName = rs.getString(3);
				int qty = rs.getInt(4);
				double price = rs.getDouble(5);
				double tamount = rs.getDouble(6);

				OrderFood food = new OrderFood(id, cname, itemName, qty, price, tamount);
				foodList.add(food);
			}
			return foodList;

		} catch (Exception e) {
			throw e;
		}

	
	}

	@Override
	public void deleteOrder(int id) throws Exception {
		try(Connection con = ds.getConnection()){
			PreparedStatement st = con.prepareStatement(DELETE_QUERY);
			st.setInt(1, id);
			
			int rowCount = st.executeUpdate();
			if(rowCount>=1) {
			 System.out.println("Order Deleted...");
			}
			
			
		}
		catch(Exception e) {
			throw e;
		}

	}

	@Override
	public void updateOrder(OrderFood order) throws Exception {
		
		try(Connection con = ds.getConnection()){
			PreparedStatement st = con.prepareStatement(UPDATE_QUERY);
			st.setString(1, order.getCustomerName());
			st.setString(2, order.getItemName());
			st.setInt(3, order.getQuantity());
			st.setDouble(4, order.getPrice());
			st.setDouble(5, order.getTotalAmount());
			st.setInt(6, order.getOrderId());
			
			int rowCount = st.executeUpdate();
			if(rowCount>=1) {
				System.err.println("Oder updated");
			}
		
		}
		catch(Exception e) {
			throw e;
		}
	}

}
