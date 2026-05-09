package com.nt.DiscountCalculationSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.DiscountCalculate;


public class App {
    public static void main(String[] args) {
      try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	     DiscountCalculate cal = ctx.getBean( DiscountCalculate.class);
    	     cal.show();
      }
    }
}
