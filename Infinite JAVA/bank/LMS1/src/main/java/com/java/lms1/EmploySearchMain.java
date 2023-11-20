package com.java.lms1;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;


public class EmploySearchMain {
	
	public static void main(String[] args) {
		int empId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id  ");
		empId = sc.nextInt();
		EmployeeDAO dao = new EmployeeDAOImpl();
		try {
			Optional<Employee> employee = Optional.ofNullable(dao.searchEmployeeDao(empId));
			if (employee.isPresent()) {
				System.out.println(employee);
			} else {
				System.out.println("Not Found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
