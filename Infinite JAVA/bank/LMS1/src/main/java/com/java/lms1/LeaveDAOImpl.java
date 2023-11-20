package com.java.lms1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class LeaveDAOImpl implements LeaveDetailsDAO {
	
	Connection connection;
	PreparedStatement pst;
	private Object startDateStr;
	private Object yesterdayStr;
	private Object endDateStr;
	
	public int dateDiff(Date startDate , Date endDate) {
		long ms = endDate.getTime() - startDate.getTime();
		int diff = (int)(ms/(1000*60*60*24));
		diff++;
		return diff;
	}

	@Override
	public String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException {
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		 
		java.util.Date date=new java.util.Date();
		Calendar cal = Calendar.getInstance();		 
		cal.setTime(date);
		cal.add(Calendar.DATE, -1);		
		java.util.Date yesterdayDate= cal.getTime();	
		String sDate=sdf.format(leaveDetails.getLeaveStartDate());
		String eDate=sdf.format(leaveDetails.getLeaveEndDate());
		
		String yesterday=sdf.format(yesterdayDate);
		
		int diff = dateDiff(leaveDetails.getLeaveStartDate(), leaveDetails.getLeaveEndDate());
		 EmployeeDAO edao = new EmployeeDAOImpl();
	        
		   
		if (sDate.equals(yesterday) || eDate.equals(yesterday)) {

                   return "no";
	        }

	        if(leaveDetails.getLeaveStartDate().before(yesterdayDate)) {
                return "no";

        }
        Employee employee=edao.searchEmployeeDao(leaveDetails.getEmpId());
		int leaveavail=employee.getLeaveAvail();
		System.out.println(leaveavail);
	    if(leaveDetails.getNoOfDays()>=leaveavail) {

	      return "no";
      	}

	    if(leaveDetails.getLeaveEndDate().before(leaveDetails.getLeaveStartDate())) {
	    return "no";
	     }
         
	    //----------------------------------------
          
         		

	
		
		//------------------------------
	    leaveDetails.setNoOfDays(diff);
		LeaveStatus status = LeaveStatus.PENDING;
		leaveDetails.setLeaveStatus(status);

	    System.out.println(leaveDetails.getNoOfDays());
	    System.out.println(leaveDetails.getLeaveStatus());
		System.out.println(leaveDetails);
		connection = ConnectionHelper.getConnection();
		
		
		String cmd = "Insert into LeaveDetails(EmpId,LeaveStartDate,LeaveEndDate,"
				+ "noOfDays,leaveType,leaveReason) values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveDetails.getEmpId());
		pst.setDate(2, leaveDetails.getLeaveStartDate());
		pst.setDate(3, leaveDetails.getLeaveEndDate());
		pst.setInt(4, leaveDetails.getNoOfDays());
		pst.setString(5, leaveDetails.getLeaveType().toString());
		pst.setString(6, leaveDetails.getLeaveReason());
		pst.executeUpdate();
		cmd = "Update Employee set LeaveAvail = LeaveAvail - ? Where EmpId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, diff);
		pst.setInt(2, leaveDetails.getEmpId());
		
		pst.executeUpdate();
		return "Leave Applied...";
	}
	@Override
	public List<LeaveDetails> showLeaveDao(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LeaveDetails searchLeaveDao(int empId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ApproveDeny(int leaveid, int managerid, String status, String mgcmt)throws ClassNotFoundException, SQLException {
 
		LeaveDetails leaveFound = searchLeaveDao(leaveid);
		int empid = leaveFound.getEmpId();
		EmployeeDAO dao = new EmployeeDAOImpl();
		Employee employ = dao.searchEmployeeDao(empid);
		int mgrId = employ.getManagerId();
		LeaveDetails newleave = new LeaveDetails();
		
		if(managerid==mgrId) {
			if("YES".equals(status)) {
				newleave.setLeaveStatus(LeaveStatus.valueOf("ACCEPTED"));
			}
			else if("NO".equals(status)) {
				newleave.setLeaveStatus(LeaveStatus.valueOf("REJECTED"));
			}
			else {
				newleave.setLeaveStatus(LeaveStatus.valueOf("PENDING"));
				System.out.println("Enter a Valid Option...");
			}
			System.out.println("NoofLeave is : "+newleave.getNoOfDays());
			connection = ConnectionHelper.getConnection();
			String cmd = "update leavedetails set leaveStatus=?,ManagerComments=? where leaveid=?";
			pst = connection.prepareStatement(cmd);	
			pst.setString(1, newleave.getLeaveStatus().toString());
			pst.setString(2, mgcmt);
			pst.setInt(3, leaveid);
			pst.executeUpdate();
			if(status.equals("NO")) {
				int diff = dateDiff(leaveFound.getLeaveStartDate(), leaveFound.getLeaveEndDate());
				cmd = "Update Employee set LeaveAvail = LeaveAvail + ? Where EmpId=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, diff);
				pst.setInt(2, leaveFound.getEmpId());
				pst.executeUpdate();
			}
			return "Leave Review Compleated...";
		}
		else {
			return "Not Authorized";
		}
		
	}
}
