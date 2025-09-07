package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;
@Controller("payroll")
public class PayrollOperationsController {
    @Autowired
	private IEmployeeService service;
    public List<Employee>showAllEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception{
    	List<Employee>list=service.fetchAllEmpbyDesgs(desg1, desg2, desg3);
    	return list;
    }
    public String processEmployee(Employee emp)throws Exception{
    	String resultmsg=service.registerEmployee(emp);
    	return resultmsg;
    }
	
}
