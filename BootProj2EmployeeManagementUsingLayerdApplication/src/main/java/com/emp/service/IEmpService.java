package com.emp.service;

import java.util.List;

import com.emp.model.Employee;

public interface IEmpService {
	List<Employee> getAllEmp() throws Exception;
	List<Employee> getEmpById(int id) throws Exception;
	String addEmp(Employee e) throws Exception;
	String deleteEmp(int id) throws Exception;
	
}
