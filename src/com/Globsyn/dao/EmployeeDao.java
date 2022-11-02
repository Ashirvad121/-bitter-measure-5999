package com.Globsyn.dao;

import java.sql.SQLException;
import java.util.List;

import com.Globsyn.bean.Employee;

public interface EmployeeDao {
	
	public String addDeptByAdim(int did,String dname,String location);
	
	public List<String> allDepartmentList();
	
	public String updateDep(int did,String newName)throws Exception;

	public String regisEmp(int eId,String eName,String password,String address,int salary,int did) throws Exception;
	
	public void transfDept(int eId,int newDid);
	
	public Employee viewEmployee(int eid,String password);
	
	public void passChange(int eid,String newpass);
	
	public void requestLeave(int eid,String password);
	
	public void leaveConf(int eid);
}
