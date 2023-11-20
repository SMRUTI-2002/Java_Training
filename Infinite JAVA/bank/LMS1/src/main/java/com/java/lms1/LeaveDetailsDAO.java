package com.java.lms1;

import java.sql.SQLException;
import java.util.List;

public interface LeaveDetailsDAO {
	
	List<LeaveDetails> showLeaveDao(int empno) throws ClassNotFoundException, SQLException;
	
	String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException;
	
	LeaveDetails searchLeaveDao(int empId) throws ClassNotFoundException, SQLException;
	String ApproveDeny(int leaveid,int managerid, String status,String mgcmt) throws ClassNotFoundException, SQLException;


}
