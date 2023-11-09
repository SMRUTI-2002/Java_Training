package com.jsp.compliant;

import java.sql.Timestamp;

public class ComplaintBeans {
	
	private String complaintID;
    private String complaintType;
    private String cDescription;
    private Timestamp complaintDate;
    private String severity;
    private String status;
	public String getComplaintID() 
	{
		return complaintID;
	}
	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public String getcDescription() {
		return cDescription;
	}
	public void setcDescription(String cDescription) {
		this.cDescription = cDescription;
	}
	public Timestamp getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Timestamp complaintDate) {
		this.complaintDate = complaintDate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ComplaintBeans(String complaintID, String complaintType, String cDescription, Timestamp complaintDate,
			String severity, String status) {
		super();
		this.complaintID = complaintID;
		this.complaintType = complaintType;
		this.cDescription = cDescription;
		this.complaintDate = complaintDate;
		this.severity = severity;
		this.status = status;
	}
	public ComplaintBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ComplaintBeans [complaintID=" + complaintID + ", complaintType=" + complaintType + ", cDescription="
				+ cDescription + ", complaintDate=" + complaintDate + ", severity=" + severity + ", status=" + status
				+ "]";
	}
}
