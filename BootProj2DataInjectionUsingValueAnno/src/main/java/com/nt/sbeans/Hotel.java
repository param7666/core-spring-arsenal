package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ht")
@Data
public class Hotel {
	@Value("10001")
	private int id;
	@Value("${ht.name}")
	private String name;
	@Value("${ht.addrs}")
	private String addrs;
	@Value("Param")
	private String username;
	@Value("#{mn.pizza+mn.vadapaw+mn.manchurian+mn.cocacola+mn.burger+mn.samosa}")
	private double totalBill;
	@Value("#{mn.pizza+mn.vadapaw+mn.manchurian}")
	private double combo;
	@Value("#{mn.cocacola+mn.burger+mn.samosa}")
	private double combo2;
	
}
