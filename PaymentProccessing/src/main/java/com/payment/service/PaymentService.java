package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.payment.model.User;

@Service
public class PaymentService {
	
	@Autowired
	@Qualifier("creditCard")
	private Payment cCard;
	
	@Autowired
	@Qualifier("paypall")
	private Payment paypall;
	
	public void processPayment(User user, double amount, String type) {
		if("creditCard".equalsIgnoreCase(type)) {
			cCard.paymentProcess(user, amount);
		} else if("paypall".equalsIgnoreCase(type)) {
			paypall.paymentProcess(user, amount);
		} else {
			System.out.println("Invalid payment type");
		}
			
	}
}
