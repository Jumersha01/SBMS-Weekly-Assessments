package com.nt.OnlineFoodDeliverySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbea.Order;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Order order = ctx.getBean(Order.class);
			
            order.viewMenu();
         
            order.placeOrder();
       
            order.cancelOrder();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
