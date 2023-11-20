package com.java.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAOImpl implements InventoryDAO {
	Connection connection;
	PreparedStatement pst;

	 public static String incrementString() {
	        // Extract the numeric part of the string, if any
		 	String inputString ="S003";
	        String prefix = inputString.replaceAll("[0-9]", "");
	        String numericPart = inputString.replaceAll("[^0-9]", "");

	        // Convert the numeric part to an integer and increment it
	        int numericValue = Integer.parseInt(numericPart) + 1;

	        // Format the numeric part back to a 3-digit string
	        String formattedNumericPart = String.format("%03d", numericValue);

	        // Reconstruct the final string
	        String resultString = prefix + formattedNumericPart;

	        return resultString;
	    }


	@Override
	public List<InventoryDetails> showInventoryDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		
		List<InventoryDetails> invList = new ArrayList<InventoryDetails>();
		InventoryDetails inv = null;
		while(rs.next()) {
			inv=new InventoryDetails();
			inv.setStockId(rs.getString("stockId"));
			inv.setItemName(rs.getString("itemName"));
			inv.setPrice(rs.getDouble("price"));
			inv.setQuantityAvail(rs.getInt("quantityAvail"));
			
			
		}
		return invList;
	}


	@Override
	public InventoryDetails searchInventoryDao(String stockId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from stock where stockId=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		InventoryDetails inv = null;
		if(rs.next()) {
			inv=new InventoryDetails();
			inv.setStockId(rs.getString("stockId"));
			inv.setItemName(rs.getString("itemName"));
			inv.setPrice(rs.getDouble("price"));
			inv.setQuantityAvail(rs.getInt("quantityAvail"));
			
		}
		return inv;
	}

}



	

	

	

