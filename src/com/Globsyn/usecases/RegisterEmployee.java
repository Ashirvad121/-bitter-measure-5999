package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class RegisterEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please fill the details to register employee");
		System.out.println("Enter employee id");
		int eid=sc.nextInt();
		System.out.println("Enter employee name");
		String eName= sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		System.out.println("Enter address");
		String address =sc.next();
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		System.out.println("Enter department id");
		int dId=sc.nextInt();
		EmployeeDao dao= new EmployeeDaoImpl();
	    try {
			String password= dao.regisEmp(eid, eName,pass, address, salary, dId);
			System.out.println("Password is "+ password);
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
