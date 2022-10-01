package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class ChangePassword {
	public static void main(String[] args) {
		System.out.println("Enter your id");
		Scanner sc =new Scanner(System.in);
		int eid=sc.nextInt();
		System.out.println("Enter new password");
		String npass=sc.next();
		EmployeeDao dao= new EmployeeDaoImpl();
		dao.passChange(eid, npass);
		
	}

}
