package com.param.EmpDetails;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "emp.info")
public class Employee {
	
	private int id;
	private String name;
	private String sirname;
	private String addrs;
	private long mobileNo;
}
