package com.java.leaveproject;


import java.util.Date;
import java.util.List;

public class LeaveBAL {
	
	static StringBuilder sb;
	static LeaveDAO dao;
	
	static {
		sb = new StringBuilder();
		dao = new LeaveDaoimpl();
	}
	
	public String checkLeaveId(int leaveId,LeaveStatus leavestatus,String managerComments) throws LeaveException {
		
			return dao.managerComments(leaveId, leavestatus, managerComments);
		
	}
	
	
	public String updateLeaveId(LeaveDetails leaveUpdate) throws LeaveException {
		if(validateLeaveDetails(leaveUpdate) == true ) {
			return dao.updateLeaveIdDao(leaveUpdate);
		}
		throw new LeaveException(sb.toString());
		
	}
	
	public String deleteLeaveId(int empno) {
		return dao.deleteLeaveIdDao(empno);
	}
	
	
	public LeaveDetails searchLeaveId(int empno) {
		return dao.searchLeaveIdDao(empno);
	}
	
	public List<LeaveDetails> showLeaveBal(){
		return dao.showLeaveDao();
	}
	
	
	public String addLeaveBal(LeaveDetails leave_details) throws LeaveException {
		if(validateLeaveDetails(leave_details) == true) {
			return dao.addLeaveDao(leave_details);
		}
		throw new LeaveException(sb.toString());
		
		
	}
	
	public boolean validateLeaveDetails(LeaveDetails leave) {
		Date currentDate = new Date();
		boolean flag = true;
		if (leave.getEmpno() <= 0) {
			flag = false;
			sb.append("Employ No Cannot be Zero or Negative...\r\n");
		}
//		if (leave.getLeaveId() <= 0) {
//			flag = false;
//			sb.append("Leave id Cannot be Zero or Negative...\r\n");
//		}
		if (leave.getName().length() < 5) {
			flag = false;
			sb.append("Name Contains min 5 characters...\r\n");
		}
		if (leave.getLeaveStartDate().before(currentDate)) {
			flag = false;
			sb.append("Leave start date shouldn't be Yesterday...\r\n");
		}
		if ((leave.getLeaveEndDate().before(currentDate))&& (leave.getLeaveEndDate().before(leave.getLeaveStartDate()))) {
			flag = false;
			sb.append("Leave end date shouldn't be Yesterday...\r\n");
		}
		long totalDays = calculateDateDifference(leave.getLeaveStartDate(),leave.getLeaveEndDate());
		
		if(totalDays>10) {
			flag = false;
			sb.append("Leave start date and  end date difference shouldn't be more then 10 days...\r\n");
			
		}
		return flag;
	}

	private long calculateDateDifference(Date leaveStartDate, Date leaveEndDate) {
		// TODO Auto-generated method stub
		long differenceInMills= leaveStartDate.getTime() - leaveEndDate.getTime();
		return differenceInMills/(24*60*60*1000);
	}
	


}
