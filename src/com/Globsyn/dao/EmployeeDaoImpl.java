package com.Globsyn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Globsyn.bean.Employee;
import com.Globsyn.exceptions.EmployeeException;
import com.Globsyn.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String addDeptByAdim(int did, String dname, String location) {
		String outcome="not added";
		try(Connection conn=DBUtil.providConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into dept values(?,?,?)");
			ps.setInt(1, did);
			ps.setString(2, dname);
			ps.setString(3, location);
			int x= ps.executeUpdate();
			if(x>0) {
				outcome=x+" record inserted sucessfully";
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		return outcome;
	}

	@Override
	public List<String> allDepartmentList() {
		List<String> list=new ArrayList<>();
		try(Connection conn=DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("select dname from dept");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String dname=rs.getString("dname");
				list.add(dname);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		return list;
	}

	@Override
	public String updateDep(int did, String newName) throws Exception {
		String outcome="not updated";
		try(Connection conn=DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("update dept set dname=? where did=?");
			ps.setString(1, newName);
			ps.setInt(2, did);
			int x= ps.executeUpdate();
			outcome=x+" record updated sucessfully";
		} catch (Exception e) {
			e.getMessage();
		}
		
		return outcome;
	}

	@Override
	public String regisEmp(int eId, String eName,String password, String address, int salary, int did) throws Exception {
		
		try(Connection conn=DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into emp(eid,ename,password,address,salary,did) values(?,?,?,?,?,?)");
			ps.setInt(1, eId);
			ps.setString(2, eName);
			ps.setString(3, password);
			ps.setString(4, address);
			ps.setInt(5, salary);
			ps.setInt(6, did);
			int x= ps.executeUpdate();
			if(x>0) {
				System.out.println("Registered Successfully");
				
			}
			return password;
		} catch (Exception e) {
			throw  new EmployeeException(e.getMessage());
			
		}
		
		
	}

	@Override
	public void transfDept(int  eId, int newDid) {
		
		try(Connection conn=DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("update emp set did=? where eid=?");
			ps.setInt(1, newDid);
			ps.setInt(2, eId);
			int x= ps.executeUpdate();
			if(x>0) {
				System.out.println("Transfer successfully");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

	@Override
	public Employee viewEmployee(int eid, String password) {
		Employee emp= new Employee();
		try(Connection conn = DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from emp where eid=?");
			ps.setInt(1, eid);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int eId=rs.getInt("eid");
				String ename=rs.getString("ename");
				String pass=rs.getString("password");
				String add=rs.getString("address");
				int salary=rs.getInt("salary");
				String leavereq=rs.getString("leavereq");
				String leaveconf=rs.getString("leaveconf");
				int did=rs.getInt("did");
				emp.setEid(eId);emp.setName(ename);emp.setAddress(add);emp.setPassword(pass);
				emp.setSalary(salary);emp.setLeavereq(leavereq);emp.setLeaveconf(leaveconf);
				emp.setDepid(did);
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		return emp;
	}

	@Override
	public void passChange(int eid,String newpass) {
		try(Connection conn= DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("update emp set password=? where eid=?");
			ps.setString(1, newpass);
			ps.setInt(2, eid);
			int x= ps.executeUpdate();
			if(x>0) {
				System.out.println("password updated successfully");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
	}

	@Override
	public void requestLeave(int eid, String password) {
		try(Connection conn=DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("update emp set leavereq='yes' where eid=?");
			ps.setInt(1, eid);
			int x= ps.executeUpdate();
			if(x>0) {
				System.out.println("your request for leave is successfully entered");
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

	@Override
	public void leaveConf(int eid) {
		try(Connection conn= DBUtil.providConnection()) {
			PreparedStatement ps= conn.prepareStatement("update emp set leaveconf='yes' where eid=?");
			ps.setInt(1, eid);
			int x= ps.executeUpdate();
			if(x>0) {
				System.out.println("Leave conform");
			}			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

}
