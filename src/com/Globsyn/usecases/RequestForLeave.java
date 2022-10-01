package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class RequestForLeave {
	public static void main(String[] args) {
		System.out.println("Enter your eid");
		Scanner sc= new Scanner(System.in);
		int eid=sc.nextInt();
		System.out.println("Enter your password");
		String pass=sc.next();
		EmployeeDao dao= new EmployeeDaoImpl();
		dao.requestLeave(eid, pass);
		
	}

}
