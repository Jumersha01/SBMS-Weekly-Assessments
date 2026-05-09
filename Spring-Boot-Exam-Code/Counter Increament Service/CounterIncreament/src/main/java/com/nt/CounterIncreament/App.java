package com.nt.CounterIncreament;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Counter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	       Counter count = ctx.getBean(Counter.class);
    	       Counter count1 = ctx.getBean(Counter.class);
    	       
    	       count.inC();
    	       count.show();
    	       System.out.println("----");
    	       
    	       count1.inC();
    	       count1.show();
    	       
    	       
    	       
       }
    }
}
