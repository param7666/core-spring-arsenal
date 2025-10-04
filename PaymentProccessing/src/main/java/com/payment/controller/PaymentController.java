package com.payment.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.payment.model.User;
import com.payment.service.PaymentService;
@Controller("paymentController")
public class PaymentController {
	
	@Autowired
	private PaymentService ps;
	public void startPayment() {
		User u= new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User id");
		u.setId(sc.nextInt());
		System.out.println("Enter user name");
		u.setName(sc.nextLine());
		System.out.println("Enter Email");
		u.setEmail(sc.nextLine());
		
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter type");
		String type=sc.nextLine();
		ps.processPayment(u, amount, type);
	}
}
