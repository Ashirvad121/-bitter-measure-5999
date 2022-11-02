package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class AddNewDepartment {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter department id");
		int did=sc.nextInt();
		System.out.println("Enter department name");
		String name= sc.next();
		System.out.println("Enter department location");
		String location =sc.next();
		EmployeeDao dao= new EmployeeDaoImpl();
		String result= dao.addDeptByAdim(did, name, location);
		System.out.println(result);
		
	}

}
