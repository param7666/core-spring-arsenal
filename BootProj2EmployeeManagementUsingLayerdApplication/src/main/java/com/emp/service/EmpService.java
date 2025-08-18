package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.DAO.IEmpDAO;
import com.emp.model.Employee;

@Service
public class EmpService implements IEmpService{
	
	@Autowired
	private IEmpDAO db;
		
	@Override
	public String addEmp(Employee e) throws Exception {
		int k=db.addEmp(e);
		return k>0?"Employee added":"Employee not added";
		
	}

	@Override
	public List<Employee> getAllEmp() throws Exception {
		List<Employee> allEmp=db.getallEmp();
		return allEmp;
	}

	@Override
	public List<Employee> getEmpById(int id) throws Exception {
		List<Employee> emp=db.getEmpById(id);
		return emp;
	}

	@Override
	public String deleteEmp(int id) throws Exception {
		int k=db.deleteEmp(id);
		return k>0?"Employee deleted":"Employee not deleted";
	}
	
	
}
