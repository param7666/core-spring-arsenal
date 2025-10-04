package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payment.DAO.PaymentDAO;
import com.payment.model.User;

@Component("paypall")
public class PaypallPayment implements Payment {
	
	@Autowired
	private PaymentDAO pay;
	
	@Override
	public void paymentProcess(User u,double amount) {
		System.out.println("User "+u.getName()+ " done payment of rs "+amount+" using paypall");
		pay.savePayment(u.getId(), "Paypall", amount);
	}
}
