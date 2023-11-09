package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public class ShowInventoryMain {
		
	public static void main(String[] args) {
		InventoryDAO dao = new InventoryDAOImpl();
		try {
			List<InventoryDetails> invList = dao.showInventoryDao();
			for (InventoryDetails inventoryDetails : invList) {
				System.out.println(inventoryDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
