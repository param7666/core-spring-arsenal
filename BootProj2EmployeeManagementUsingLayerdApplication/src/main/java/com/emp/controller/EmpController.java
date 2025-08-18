package com.emp.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.service.IEmpService;

@Controller("empControl")
public class EmpController {
	
	@Autowired
	private IEmpService service;
	
	
	public void startOperation() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("=========OPERATIONS==========");
		System.out.println("1) GET ALL THE EMPLOYEE");
		System.out.println("2) GET EMPLOYEE BY ID");
		System.out.println("3) ADD EMPLOYEE");
		System.out.println("4) DELETE EMPLOYEE");
		System.out.println("5) EXIT");
		System.out.println("====================================");
		System.out.println("ENTER YOUR CHOICE");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("All Employee List");
			System.out.println(service.getAllEmp());
			break;
		}
		case 2: {
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println(service.getEmpById(id));
			break;
		}
		case 3: {
			Employee e=new Employee();
			System.out.println("Enter Employee id");
			e.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Employee Name");
			e.setName(sc.nextLine());
			System.out.println("Enter Department");
			e.setDepartment(sc.nextLine());
			System.out.println("Enter Salary");
			e.setSalary(sc.nextDouble());
			String result=service.addEmp(e);
			System.out.println(result);
			break;
		}
		case 4: {
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println(service.deleteEmp(id));
			break;
		}
		case 5: {
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
	}
	
}
