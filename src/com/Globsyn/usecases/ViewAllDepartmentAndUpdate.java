package com.Globsyn.usecases;

import java.util.List;
import java.util.Scanner;

import com.Globsyn.dao.EmployeeDao;
import com.Globsyn.dao.EmployeeDaoImpl;

public class ViewAllDepartmentAndUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao= new EmployeeDaoImpl();
		System.out.println("If you want to view all department press 1");
		int yn=sc.nextInt();
		
		if(yn==1) {
			List<String> list= dao.allDepartmentList();
			for(String l : list) {
				System.out.println(l);
			}
		}
		System.out.println("If you want to change department name press 2");
		int yn2=sc.nextInt();
		if(yn2==2){
			System.out.println("Enter department id which you want to update");
			int did=sc.nextInt();
			System.out.println("Enter new name of department");
			String newName=sc.next();
			String mess;
			try {
				mess = dao.updateDep(did, newName);
				System.out.println(mess);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
