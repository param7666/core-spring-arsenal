package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj01JdbcminipApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj01JdbcminipApplication.class, args);
		PayrollOperationsController controller=ctx.getBean("payroll",PayrollOperationsController.class);
		
		try {
			List<Employee>list=controller.showAllEmployeeByDesgs("CLERK","MANAGER","SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter desg:");
		String desg=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		System.out.println("Enter deptno(10,20,30..)");
		int deptno=sc.nextInt();
		
		Employee emp=new Employee();
		emp.setEname(name);
		emp.setDesg(desg);
		emp.setSalary(salary);
		emp.setDeptno(deptno);
		try {
			String msg=controller.processEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
