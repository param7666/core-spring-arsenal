package com.payment.model;

import lombok.Data;

@Data
public class PaymentRecord {
	
	private Long paymentId;
	private String userid;
	private double amount;
	private String paymentType;
}
