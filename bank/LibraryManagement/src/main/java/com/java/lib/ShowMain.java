package com.java.lib;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ShowMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserName : ");
		String username = sc.next();
		
		LibraryDAO dao = new LibraryDaoImpl();
		List<Tranbook> historylist;
		try {
			historylist = dao.showHistoryDao(username);
			for(Tranbook history :historylist) {
				System.out.println(history.getUsername());
				System.out.println(history.getBookId());
				System.out.println(history.getFromdate());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
