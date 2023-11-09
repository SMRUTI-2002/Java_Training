package com.jsp.compliant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComplaintDAOImpl  implements ComplaintDAO {

	Connection connection;
	PreparedStatement pst;
	
	
//	public String generateComplaintId() throws ClassNotFoundException, SQLException  {
//		
//		connection=ConnectionHelper.getConnection();
//		String ComplaintId = "C000";
//		String cmd = "Select  max(ComplaintId) cid from Complaint";
//        pst= connection.prepareStatement(cmd);
//		ResultSet rs = pst.executeQuery();
//		rs.next();
//		String complainid = rs.getString("cid");
//		int num = Integer.parseInt(complainid.substring(1));
//		num++;
//		String incrementComplaintId = String.format("C%03d", num);
//		return incrementComplaintId;	
//
//	}
	
	public String generateComplaintID() throws ClassNotFoundException, SQLException {
 		connection = ConnectionHelper.getConnection();
 		String cmd = "select max(ComplaintID) sid from Complaint";
    	pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
    	if(rs.next()) {
    	String sid = rs.getString("sid");
    	int id = Integer.parseInt(sid.substring(1));
    	id++;
    	sid = String.format("C%03d", id);
		return sid;
    	}
    	else {
    		return "C001";
    	}
		}
	
	@Override
	public String addComplaintDao(ComplaintBeans complaint) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
//		complaint.setStatus("PENDING");
		String id = generateComplaintID();
		String cmd = "Insert into Complaint(ComplaintID, ComplaintType, CDescription, Severity ) VALUES (?, ?, ?, ?)";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setString(1, id);
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3, complaint.getcDescription());
	//	pst.setTimestamp(4, complaint.getComplaintDate());
		pst.setString(4, complaint.getSeverity());
	//	pst.setString(6, complaint.getStatus());
		
//		pst.setString(5, "PENDING");
		pst.executeUpdate();
		return "Complaint Registered Sucessfully...";
	}

	@Override
	public List<ComplaintBeans> showComplaintDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<ComplaintBeans> cList = new ArrayList<ComplaintBeans>();
		ComplaintBeans complaint = null;
		while(rs.next()) {
			complaint = new ComplaintBeans();
			complaint.setComplaintID(rs.getString("complaintID"));
			complaint.setComplaintType(rs.getString("complaintType"));
			complaint.setcDescription(rs.getString("cDescription"));
			complaint.setComplaintDate(rs.getTimestamp("complaintDate"));
			complaint.setSeverity(rs.getString("severity"));
			complaint.setStatus(rs.getString("status"));
			cList.add(complaint);
		}
		return cList;
	}

	@Override
	public ComplaintBeans searchComplaintDao(String complaintID) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from complaint where ComplaintID=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, complaintID);
		ResultSet rs = pst.executeQuery();
		ComplaintBeans complaint= null;
		if(rs.next()) {
			complaint = new ComplaintBeans();
			complaint.setComplaintID(rs.getString("complaintID"));
			complaint.setComplaintType(rs.getString("complaintType"));
			complaint.setcDescription(rs.getString("cDescription"));
			complaint.setComplaintDate(rs.getTimestamp("complaintDate"));
			complaint.setSeverity(rs.getString("severity"));
			complaint.setStatus(rs.getString("status"));
		}
		return complaint;
	}

}
