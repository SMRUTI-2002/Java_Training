package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsertMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ No");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name");
		employ.setName(sc.next());
		System.out.println("Enter Employ Gender");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Employ Dept");
		employ.setDept(sc.next());
		System.out.println("Enter Employ Desig");
		employ.setDesig(sc.next());
		System.out.println("Enter Employ Basic");
		employ.setBasic(sc.nextDouble());
		EmployDAO dao = new EmployDAOImpl();
		
		try {
			System.out.println(dao.addEmployDao(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
