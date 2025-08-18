package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.emp.controller.EmpController;

@SpringBootApplication
public class BootProj2EmployeeManagementUsingLayerdApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= SpringApplication.run(BootProj2EmployeeManagementUsingLayerdApplication.class, args);
		EmpController c=ctx.getBean("empControl",EmpController.class);
		while(true) {
			c.startOperation();
		}
	}

}
