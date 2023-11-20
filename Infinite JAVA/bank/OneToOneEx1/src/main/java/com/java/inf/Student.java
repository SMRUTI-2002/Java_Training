package com.java.inf;

public class Student {
	private int studentId;
    private String name;
    private int mobileNo;
    private String BloodGroup;
    private String studentClass;
    private StudentIdCard studentIdCard;
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public StudentIdCard getStudentIdCard() {
		return studentIdCard;
	}
	public void setStudentIdCard(StudentIdCard studentIdCard) {
		this.studentIdCard = studentIdCard;
	}
    
	
}
