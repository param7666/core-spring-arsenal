package com.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.emp.DAO.IEmpDAO;

@Repository
public class EmpDAO implements IEmpDAO{
	
	private static final String ADD_EMP="INSERT INTO EMPLOYEE (ID,NAME,DEPARTMENT,SALARY) VALUES(?,?,?,?)";
	private static final String GET_ALL_EMP="SELECT * FROM EMPLOYEE";
	private static final String FINDBYID="SELECT * FROM EMPLOYEE WHERE ID=?";
	private static final String DELETEEMP="DELETE FROM EMPLOYEE WHERE ID=?";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getallEmp() throws Exception {
		List<Employee> allEmp=new ArrayList<Employee>();
		try(Connection con=ds.getConnection()) {
			PreparedStatement ps=con.prepareStatement(GET_ALL_EMP);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDepartment(rs.getString(3));
				e.setSalary(rs.getDouble(4));
				allEmp.add(e);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return allEmp;
	}

	@Override
	public List<Employee> getEmpById(int id) throws Exception {
		List<Employee> emp=new ArrayList<Employee>();
		try(Connection con=ds.getConnection()) {
			PreparedStatement ps=con.prepareStatement(FINDBYID);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDepartment(rs.getString(3));
				e.setSalary(rs.getDouble(4));
				emp.add(e);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	
	}

	@Override
	public int addEmp(Employee e) throws Exception {
		int k=0;
		try(Connection con=ds.getConnection()) {
			PreparedStatement ps=con.prepareStatement(ADD_EMP);
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getDepartment());
			ps.setDouble(4, e.getSalary());
			k=ps.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return k;
	}

	@Override
	public int deleteEmp(int id) throws Exception {
		int k=0;
		try(Connection con=ds.getConnection()) {
			PreparedStatement ps=con.prepareStatement(DELETEEMP);
			ps.setInt(1, id);
			k=ps.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return k;
	}
	
}
