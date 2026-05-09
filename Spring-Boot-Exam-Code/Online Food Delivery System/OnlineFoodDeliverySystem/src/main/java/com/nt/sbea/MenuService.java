package com.nt.sbea;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class MenuService {
	
	public void menuData() {
		System.out.println("1.Chicken Curry\n2.Biryani\n3.Burger\n4.Pizza\n5.Chinese");
		
	}
	
}
