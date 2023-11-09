package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public interface InventoryDAO {
	   	  
	List<InventoryDetails> showInventoryDao() throws ClassNotFoundException, SQLException;
	InventoryDetails searchInventoryDao(String stockId) throws ClassNotFoundException, SQLException;
		  
	
	}
