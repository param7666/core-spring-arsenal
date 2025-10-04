package com.payment.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentDAO {
	
	@Autowired
	private Connection con;
	private static final String INSERT="INSERT INTO PAYMENTS(USERID,PAYMENTS,AMOUNT) VALUES(?,?,?)";
	int k;
	public int savePayment(int userid,String paymenttype,double amount) {
		try {
			PreparedStatement ps=con.prepareStatement(INSERT);
			ps.setInt(1, userid);
			ps.setString(2, paymenttype);
			ps.setDouble(3, amount);
			k=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
