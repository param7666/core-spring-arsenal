package com.payment.service;

import com.payment.model.User;

public interface Payment {
	void paymentProcess(User u,double amount);
}
