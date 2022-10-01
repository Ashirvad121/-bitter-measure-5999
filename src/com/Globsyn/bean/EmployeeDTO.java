package com.Globsyn.bean;

public class EmployeeDTO {
	private int eid;
	private String name;
	private String password;
	private String address;
	private int depid;
	private String leavereq;
	private String leaveconf;
	private int salary;
	
	private String dname;
	private String location;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int eid, String name, String password, String address, int depid, String leavereq,
			String leaveconf, int salary, String dname, String location) {
		super();
		this.eid = eid;
		this.name = name;
		this.password = password;
		this.address = address;
		this.depid = depid;
		this.leavereq = leavereq;
		this.leaveconf = leaveconf;
		this.salary = salary;
		this.dname = dname;
		this.location = location;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [eid=" + eid + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", depid=" + depid + ", leavereq=" + leavereq + ", leaveconf=" + leaveconf + ", salary=" + salary
				+ ", dname=" + dname + ", location=" + location + "]";
	}
	
	
	
	
}
