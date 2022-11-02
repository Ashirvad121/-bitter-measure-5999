package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.bean.Employee;
import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class ViewEmployeeProfile {
	public static void main(String[] args) {
		System.out.println("Enter your id");
		Scanner sc = new Scanner(System.in);
		int eid=sc.nextInt();
		System.out.println("Enter password");
		String pass =sc.next();
		EmployeeDao dao= new EmployeeDaoImpl();
		Employee emp= dao.viewEmployee(eid, pass);
		System.out.println(emp);
	}

}
