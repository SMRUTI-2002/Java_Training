package com.java.leaveproject;

import java.util.List;

public interface LeaveDAO {

	List<LeaveDetails> showLeaveDao();
	String addLeaveDao(LeaveDetails leave_details);
	LeaveDetails searchLeaveIdDao(int empno);
	String deleteLeaveIdDao(int empno);
	String updateLeaveIdDao(LeaveDetails updateLeaveId);
	String managerComments(int leaveId,LeaveStatus leavestatus,String managerComments);

}
