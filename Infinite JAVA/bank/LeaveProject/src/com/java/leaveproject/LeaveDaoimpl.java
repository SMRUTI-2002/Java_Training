package com.java.leaveproject;

import java.util.ArrayList;
import java.util.List;

public class LeaveDaoimpl implements LeaveDAO {
	
static List<LeaveDetails> leaveList;
	
	static {
		leaveList = new ArrayList<LeaveDetails>();
	}

	@Override
	public List<LeaveDetails> showLeaveDao() {
		// TODO Auto-generated method stub
		return leaveList;
	}

	@Override
	public String addLeaveDao(LeaveDetails leave_details) {
		// TODO Auto-generated method stub
		int leaveId = autoLeaveID();
        leave_details.setLeaveId(leaveId); 
        leaveList.add(leave_details);
        return "Applied";
        
	}

	private int autoLeaveID() {
		// TODO Auto-generated method stub
		if (leaveList.size() == 0) {
            return 1;
        } else {
            return leaveList.get(leaveList.size() - 1).getLeaveId() + 1;
        }
	}

	@Override
	public LeaveDetails searchLeaveIdDao(int empno) {
		// TODO Auto-generated method stub
		for (LeaveDetails leave_details : leaveList) {
            if (leave_details.getEmpno() == empno) {
                return leave_details;
            }
        }
		
        return null;
	}

	@Override
	public String deleteLeaveIdDao(int empno) {
		// TODO Auto-generated method stub
		LeaveDetails leaveFound = searchLeaveIdDao(empno);
        if (leaveFound != null) {
            leaveList.remove(leaveFound);
            return "Leave application record deleted";
        }
        return "Application not found";
	}

	@Override
	public String updateLeaveIdDao(LeaveDetails updateLeaveId) {
		// TODO Auto-generated method stub
		 LeaveDetails leaveFound = searchLeaveIdDao(updateLeaveId.getEmpno());
	        if (leaveFound != null) {
	            leaveFound.setEmpno(updateLeaveId.getEmpno());
	            leaveFound.setName(updateLeaveId.getName());
	            leaveFound.setLeaveStartDate(updateLeaveId.getLeaveStartDate());
	            leaveFound.setLeaveEndDate(updateLeaveId.getLeaveEndDate());
	            leaveFound.setLeaveType(updateLeaveId.getLeaveType());
	            return "Leave application updated";
	        }
	        return "Leave application not found";
	}

	@Override
	public String managerComments(int leaveId,LeaveStatus leavestatus,String managerComments) {
		// TODO Auto-generated method stub
		LeaveDetails leaveFound = searchLeaveIdDao(leaveId);
        if (leaveFound != null) {
        	leaveFound.setManagerComments(leaveFound.getManagerComments());
        	leaveFound.setLeaveStatus(leaveFound.getLeaveStatus());
        	leaveFound.setLeaveId(leaveFound.getLeaveId());
            return "Leave application checked by manager";
        }
        return "Leave application not found";
		
		
	}

}
