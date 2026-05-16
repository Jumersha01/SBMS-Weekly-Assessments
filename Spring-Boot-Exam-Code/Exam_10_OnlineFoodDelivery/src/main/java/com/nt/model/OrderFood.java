package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class OrderFood {
	
  private int  orderId;
  private String customerName;
  private String itemName;
  private int quantity;
  private double price;
  private double totalAmount;
  
}
