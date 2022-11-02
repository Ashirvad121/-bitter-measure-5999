package com.Globsyn.usecases;

import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class TransferDepartment {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employee ID whome you want to transfer");
		int eid=sc.nextInt();
		System.out.println("Enter new department ID");
		int did=sc.nextInt();
		EmployeeDao dao=new EmployeeDaoImpl();
		dao.transfDept(eid, did);
	}

}
