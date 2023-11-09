package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockIdMain {
	
	public static void main(String[] args) {
		String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StockId : ");
		stockId = sc.next();
		InventoryDAO dao = new InventoryDAOImpl();
		try {
			InventoryDetails inv = dao.searchInventoryDao(stockId);
			if (inv!=null) {
				System.out.println(inv);
			}else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
