package com.Globsyn.bean;

public class Employee {
	private int eid;
	private String name;
	private String password;
	private String address;
	private int depid;
	private String leavereq;
	private String leaveconf;
	private int salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String name, String password, String address, int depid, String leavereq, String leaveconf,
			int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.password = password;
		this.address = address;
		this.depid = depid;
		this.leavereq = leavereq;
		this.leaveconf = leaveconf;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getLeavereq() {
		return leavereq;
	}
	public void setLeavereq(String leavereq) {
		this.leavereq = leavereq;
	}
	public String getLeaveconf() {
		return leaveconf;
	}
	public void setLeaveconf(String leaveconf) {
		this.leaveconf = leaveconf;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", depid=" + depid + ", leavereq=" + leavereq + ", leaveconf=" + leaveconf + ", salary=" + salary
				+ "]";
	}
	
	
	

}
