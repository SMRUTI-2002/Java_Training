package com.jsp.compliant;

import java.sql.SQLException;
import java.util.List;

public interface ComplaintDAO {
	
	String addComplaintDao(ComplaintBeans complaint) throws ClassNotFoundException, SQLException;
	List<ComplaintBeans> showComplaintDao() throws ClassNotFoundException, SQLException;
	ComplaintBeans searchComplaintDao(String complaintID) throws ClassNotFoundException, SQLException;
}
