package com.param;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.param.EmpDetails.Employee;

@SpringBootApplication
public class BootProj4BulkDataInjectionUsingYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj4BulkDataInjectionUsingYmlApplication.class, args);
		Employee e=ctx.getBean("emp",Employee.class);
		System.out.println(e);
	}

}
