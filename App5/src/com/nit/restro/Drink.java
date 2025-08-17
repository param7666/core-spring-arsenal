package com.nit.restro;

import org.springframework.stereotype.Component;

@Component
public class Drink  {
	
	
	public void prepare() {
		System.out.println("Drink is preparing");
	}
	
	
	public void serve() {
		System.out.println("Drink is serving");
	}
}
