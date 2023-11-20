package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShow {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","india@123");
			System.out.println("Connected");
			String cmd = "select * from Employ";
			PreparedStatement pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Employ No "+rs.getInt("empno"));
				System.out.println("Employ Name "+rs.getString("name"));
				System.out.println("Gender "+rs.getString("gender"));
				System.out.println("Department "+rs.getString("Dept"));
				System.out.println("Designation"+rs.getString("desig"));
				System.out.println("Basic "+rs.getDouble("basic"));
				System.out.println("------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
