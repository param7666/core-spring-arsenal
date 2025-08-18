package com.emp.DAO;

import java.util.List;

import com.emp.model.Employee;

public interface IEmpDAO {
	List<Employee> getallEmp() throws Exception;
	List<Employee> getEmpById(int id) throws Exception;
	int addEmp(Employee e) throws Exception;
	int deleteEmp(int id) throws Exception;
	
}
