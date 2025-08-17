package com.nit.package1;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingService {
	private MessageProvider msg;
	
	@Autowired
	public GreetingService(MessageProvider msg) {
		this.msg=msg;
	}
	public void printMessage() {
		System.out.println(msg.getMessage());
	}
	
}
