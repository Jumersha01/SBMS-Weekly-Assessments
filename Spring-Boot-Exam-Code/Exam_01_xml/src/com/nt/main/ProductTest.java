package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Cart;

public class ProductTest {
public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	
	Object obj = context.getBean("cart");
	
	Cart cart = (Cart)obj;
	IO.println(cart.showDetails());
	
	context.close();
}
}
