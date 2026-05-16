package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.FoodController;
import com.nt.model.OrderFood;

@SpringBootApplication
public class Exam10OnlineFoodDeliveryApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Exam10OnlineFoodDeliveryApplication.class, args)){
			FoodController control = ctx.getBean("foodControll",FoodController.class);
			OrderFood order = new OrderFood(101,"Junaid","Pizza",2,250,(2*250));
			control.addOrder(order);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
