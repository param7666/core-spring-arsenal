package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payment.DAO.PaymentDAO;
import com.payment.model.User;
@Component("creditCard")
public class CreaditCardPayment implements Payment{
	
	@Autowired
	private PaymentDAO pay;
	
	public void paymentProcess(User u,double amount) {
		System.out.println("User "+u.getName()+ " done payment of rs "+amount+" using credit card");
		pay.savePayment(u.getId(), "Credit Card", amount);
	}
}
