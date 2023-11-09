package com.java.lms1;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	
	List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException;
	Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException;
    	
}