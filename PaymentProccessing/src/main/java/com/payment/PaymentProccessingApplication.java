package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.payment.controller.PaymentController;

@SpringBootApplication
public class PaymentProccessingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(PaymentProccessingApplication.class, args);
		PaymentController control=ctx.getBean("paymentController",PaymentController.class);
		control.startPayment();
	}

}
