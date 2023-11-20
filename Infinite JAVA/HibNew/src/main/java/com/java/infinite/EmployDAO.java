package com.java.infinite;

import java.util.List;

public interface EmployDAO {
	
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
    String addEmployDao(Employ employ);
    String deleteEmployDao(int employno);
}
