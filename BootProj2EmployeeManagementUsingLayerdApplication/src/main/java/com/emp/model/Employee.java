package com.emp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	
}
