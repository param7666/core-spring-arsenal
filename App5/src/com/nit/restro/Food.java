package com.nit.restro;

import org.springframework.stereotype.Component;

@Component
public class Food {
	
	public void prepare() {
		System.out.println("Food Is prapering");
	}
	
	public void serve() {
		System.out.println("Food is serving");
	}
}

//Method: prepare()
//Method: serve()
