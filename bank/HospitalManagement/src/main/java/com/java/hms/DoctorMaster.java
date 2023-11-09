package com.java.hms;

public class DoctorMaster {
	
	 private String drid;
	 private String drname;
	 private String dept;
	public String getDrid() {
		return drid;
	}
	public void setDrid(String drid) {
		this.drid = drid;
	}
	public String getDrname() {
		return drname;
	}
	public void setDrname(String drname) {
		this.drname = drname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public DoctorMaster(String drid, String drname, String dept) {
		super();
		this.drid = drid;
		this.drname = drname;
		this.dept = dept;
	}
	public DoctorMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DoctorMaster [drid=" + drid + ", drname=" + drname + ", dept=" + dept + "]";
	}	
}
