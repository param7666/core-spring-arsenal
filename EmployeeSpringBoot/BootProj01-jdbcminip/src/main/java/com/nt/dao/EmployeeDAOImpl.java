package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
   private static final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
   private static final String INSERT_EMPLOYEE="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL,DEPTNO)VALUES(EMPNO_SEQ1.NEXTVAL,?,?,?,?)";
   @Autowired
   private DataSource ds;
	//@SuppressWarnings("null")
	@Override
	public List<Employee> getEmployeeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee>list=new ArrayList<Employee>();
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);)
		{
		   ps.setString(1, desg1);
		   ps.setString(2, desg2);
		   ps.setString(3, desg3);
		   
		   try(ResultSet rs=ps.executeQuery()){
			  // System.out.println("EmployeeDAOImpl.getEmployeeeByDesgs()");
			   while(rs.next())
			   {
				   //System.out.println("EmployeeDAOImpl.getEmployeeeByDesgs()while loop");
				   Employee emp=new Employee();
				   emp.setEmpno(rs.getInt(1));
				   emp.setEname(rs.getString(2));
				   emp.setDesg(rs.getString(3));
				   emp.setDeptno(rs.getInt(5));
				   emp.setSalary(rs.getDouble(4));
				   emp.setGrossSalary(0.0);
				   emp.setNetSalary(0.0);
				  // System.out.println(emp);
				   
				   list.add(emp);
				  
				   
			   }
		   }
		}
		   catch(SQLException se)
		   {
			   //System.out.println("EmployeeDAOImpl.getEmployeeeByDesgs() sql exception");
			   se.printStackTrace();
			   throw se;
		   }
		   catch(Exception e)
		   {
			   //System.out.println("EmployeeDAOImpl.getEmployeeeByDesgs()");
			   e.printStackTrace();
			   throw e;
		   }
		//System.out.println("EmployeeDAOImpl.getEmployeeeByDesgs()");
		//list.forEach(System.out::print);
		return list;
	}
	
	
	@Override
	public int insertEmployee(Employee emp)throws Exception {
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_EMPLOYEE);){
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());
			
			result=ps.executeUpdate();
		}
		catch(SQLException se)
		{
			throw se;
		}
		catch(Exception e)
		{
			throw e;
		}
		return result;
	}
	

}
