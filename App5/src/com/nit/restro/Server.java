package com.nit.restro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Server {
	
	private Order order;
	
	 @Autowired
	    public Server(Order order) {
	        this.order = order;
	    }
	
	@Autowired
	public void setOrder(Order order) {
		this.order=order;
	}
	
	public void takeOrder(Order order) {
		System.out.println("Taking Order");
		order.processOrder();
	}
	
	public void serveOrder(Order order) {
		System.out.println("Serving Food");
		order.f.serve();
	}
}


//takeOrder(Order order)
//serveOrder(Order order)