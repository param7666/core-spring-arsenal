package com.nit.restro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private Food f;
	private Drink d;
	
	@Autowired
	public void setFood(Food f) {
		this.f=f;
	}
	@Autowired
	public void setDrink(Drink d) {
		this.d=d;
	}
	
	public void processOrder() {
		System.out.println("proccesing the order");
		f.prepare();
		d.prepare();
	}
}


//setFood(Food food)
//setDrink(Drink drink)
//processOrder()