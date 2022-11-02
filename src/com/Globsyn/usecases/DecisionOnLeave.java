package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class DecisionOnLeave {
	public static void main(String[] args) {
		System.out.println("Enter employee id whom leave you want to conform");
		Scanner sc= new Scanner(System.in);
		int eid=sc.nextInt();
		EmployeeDao dao= new EmployeeDaoImpl();
		dao.leaveConf(eid);
		
	}

}
